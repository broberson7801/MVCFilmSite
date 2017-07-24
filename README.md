# MVCFilmSite

RUNNING THE PROGRAM

Follow the prompts on the buttons. Note there is no validation, so if invalid entries are entered, the program will break.

WHO DID THE PROJECT -> 

Jacob Paul helped with the "Look up film by id", "Get actors by film name", "Get film by Actor First Name" features of this project. Moses Lee helped with the FilmController.java file, and Aaron Aguil gave a litle guidance in terms of how to my JSP's should be hitting my Film Controller (e.g. when you press the button to edit, it hits the controller which sends you to the AddFilm jsp (which will allow editing), and then when you submit, it goes to another method in the controller). Aaron Aguil also helped with the editing functionality and adding a film functionality. 

WHAT WAS THE PROJECT-> 

The project was basically about getting a base-line knowledge on how to add, delete (more on that below), and edit films in a datbase.

Now, deleting a film can only happen with films that the user adds. The first 1000 films in the database all have actor ids, and store ids, rental ids, customer ids and payment records attached- all of which would have to be deleted first before the film can be deleted. (That's five total tables to delete from before it's possible to delete the film).  

I felt that deleting films already in the database was beyond the scope of this project. The user can delete any films that the user adds, as those films don't have the "coupling" problem of the first 1000 films.
 
TECHNOLOGIES USED-> 

Java, Spring, Gradle, SQL and JSP, That's it. No HTML or CSS was used as I think the goal of the project was basic CRUD operations and not about making the project "pretty." Besides, I here there's a bigger project coming up, and that's the one I will spend time on making pretty. 

FUTURE FEATURE SETS TO ADD ->

I would definitely use HTML and CSS to make the site look pretty. I would definitely lay out the functionality better and, I would want a more "decoupled" database. 


STUMBLING POINTS ENCOUNTERED->

In no particular order...

-Figuring out how to pass 10 different parameters to the my "addFilm" method in the controller took a lot of googling (I ended up following Moses Lee's advice and just passed a Film command object. (As a side note, when using the @RequestParam annotation, you can tell Spring what the value of a parameter is if the user passes in nothing by using "defaultValue="", and you can tell Spring that a particular parameter is not even required using "required = false").

-I had a hard time figuring out how to assign the auto generated key to the film (Aaron helped out), and it took some time to figure out how to display the generated id (I ended up adding the id in particular in the controller using the mv.addObject() method and displaying it in the AddFilm.jsp).

-Aaron did part of the editing functionality. I subsequently chased down null pointer exceptions (because the film's id wasn't getting added to the film object), chased down Invalid Object exceptions (because my implementation class was trying to add the film's title to the databases id column), and figured out why my fields in the edit form wasn't auto-populating with the film's attributes (ultimately a problem with my SQL statements in the implementation class).

-I struggled a little with validation, (I did a little validation with the checkboxes and scroll menu on the AddFilm.jsp) and ultimately said "screw it." I learned the hard way that the database has ranges of acceptable values and there was no way (that I know of) to see those value ranges. E.g. if the user entered "2017" for the film release year, the film would be added. Likewise if the user entered "1642" for the release year, the program would break. I decided to spare myself the headache of testing for the "high" and "low" limits of each of the parameters and restricting the user to the acceptable ranges.  

-Speaking of release year, I fought for a couple of hours on how to set the year in the Film object class. Should it have been a DateTime? An Integer? (I had started with sql.DateTime, went to java.Calandar.Year, then went with an Integer). 