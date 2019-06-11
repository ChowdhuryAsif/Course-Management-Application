# Course-Management-Application

It is a simple application using JavaFX.<br>
It's about:<br>
  Registering for a course named Research Methodology<br>
  Apply for Research<br>
  Manage Invitations from other student who applied for Research and added you as a team mate<br>
  Accepting those applications from Faculty members<br>
  Accepting those application from Chairman Sir.<br>
  
=====================================================================================
=====================================================================================
=====================================================================================

Instructions to run this App:<br>

You need to change "USERNAME", "PASSWORD", "HOSTNAME" from the controller to successfully connect to the Database;<br>

# Student Part:

	* After logged in to student Account there will be 
		-> Dashboard
		-> Registration
		-> Apply for Research
		-> Group Info
		-> Log out

	* In Registration Container Offered Courses are shown in the ListView. If 
	  one have already registered for CSE4000 he/she cannot register again. 
	  "Register" Button will be disabled for him/her.

	* In Apply for Research Container a form have to fill for apply for apply
	  for Research. "Apply" Button will be disabled for those are not 
	  Registered for CSE4000. One can apply upto 3 Application for Research 
	  After 3 application a Notification will popup that "You cannot apply 
	  more than 3 time for research". There are three option for team mate but 
	  it can also be done by 1 or 2 member. Also a student can see how many
	  students are already enrolled with faculties in supervisor comboBox.

	* In Group Info container all invitation will be listed when someone apply
	  for Research and wished to be a team mate with Logged Student. Logged 
	  Student can see all the invitations and Logged Student can confirm team
	  for Research by selecting a team from a tableView. One cannot confirm
	  any group before registering CSE4000. One Student can also see the application
	  progress in this section.
	
	* Log out

N.B. Student can apply for research before a deadline which will set by Chairman sir 
before semester start. In my case you can see the deadlines for "Summer2019" and "Fall2019" 
in database table named "deadline". If the deadline is over a notification will popup.

=========================================================================================

# Faculty Part:

	* After Successfully logged in to Faculty Account
		-> Dashboard
		-> Applications
		-> Students Info
		-> Log out

	* In Application container teacher will see how mane applications are requested to
	  do Research under logged faculty supervision. Faculty can choose the semester and
	  accept group which he/she prefer. It also have to done before a deadline. An 
	  Application will only be listed under faculty application list when all the team
	  mate confirmed there group.

	* In Student Info section faculty will see all groups under him/her supervision and 
	  also can see individuals students list.

	* Log out.

==========================================================================================

# Chairman Sir Part:

	* There are two option in this section
		-> Applications
		-> Set Deadline

	* In Application section, Chairman sir will see all the applications and also all
	  the "Confirmed Applications". Chairman sir can confirm any 
	  "Confirmed Application" for final confirmation.

	* Set Deadline: Chairman sir can select a semester (i.e Spring, Summer, Fall) and 
	  choose the semesterStartDate and the semesterEndDate. It will automaticly 
	  generate the semesterId like Spring2019/Fall2019 by LocalDate.now().getYear();
	  Also Research Application Deadline, Faculty Approval Deadline and Application 
	  Approval Deadline have to set by Chairman Sir.

==========================================================================================
