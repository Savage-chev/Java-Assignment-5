SOFTWARE: BlueJ(IDE)
BOOK: Object First with Java | Sixth Edition | Chapter 5
PROJECT TITLE: MarksProcessor
PURPOSE OF PROJECT: University weekly assignment
VERSION or DATE: February 2020
AUTHOR: Plamen Savchev 

ASSIGNMENT INSTRUCTIONS:

Individual Assessed Coursework 5
February 2020

Scenario: this homework is intended to give you practice in 
•	reading text data from a file;
•	using an array to store information;
•	writing text data to a file.

The input data files you will need for this homework are on BlackBoard in Homeworks|Homework 5.  Each file stores the names of students and their marks, as percentages, for assessed coursework.  The first few lines of one of these files, for example data1.txt, are
CS1 Group 2
3
Andreas Antoniades
65 85 77
Charlotte Brocklebank
87 93 81
suzanne dawson
0 55 42
......
Here the first line contains the name of the cohort of students and the second line contains an int to indicate the number of marks for each of the students whose names and (integer) marks follow as shown in the examples above.  You may assume that the data in the file has been checked and so the input of data does not need any validation e.g. you can assume there will be a single int on the second line of the file and that all the marks are ints.

You will need to read this data into a system for processing the marks for a cohort of students.  Firstly, create a project called Hwk 5 Step 1.
You should re-compile your project after each of these steps and test your code thoroughly at every step. 
Step 1: Set up classes StudentRecord and MarksProcessor and read the data from a file
Create a class StudentRecord that has two fields: name and an array marks to store each student's marks.  The class should have a constructor with parameters corresponding to these fields (and accessor methods as usual).

Create a class MarksProcessor that has two fields, nameOfCohort and marksList (which is an arraylist to store StudentRecord objects).

Next, download the data files from BlackBoard as you are going to write a method readMarksData() that has a String parameter that allows the name of the data file to be passed to the method. You are advised to re-read Slides SM4.14-18 and then complete the method in the following stages:
i)	Assuming you have set up a suitable Scanner object, you firstly need to read the name of the cohort and the number of marks per student before entering a loop that reads in the data for each student.  At this stage, read a set of marks such as 65 60 52 as a single string: do not attempt to read it as three ints so you can concentrate on the input and loop structure.  Hence base your code on the following pseudocode
read name of cohort as a string
read number of marks as an int
while there is more data to read
   read student name as a string
   read marks as a string
To make sure that the data is being read correctly, add println() statements such as System.out.println("student name " + name) to print out each piece of data immediately after you have read it in.  Such println() statements are often called "diagnostic" statements as they allow us to detect errors.  If the first student name to be printed out is missing (i.e. blank) and the student names and marks seem to have been interchanged and, most probably, a NoSuchElementException occurs then do not move on to the next stage before solving the problem.  Hint: Before entering the loop you need to ensure that you are ready to read data from the third line of the file.
ii)	You now need to read each student's marks "properly" as ints and store them in an array.  As in stage i) above, make sure that after reading the last int on each line of marks, you make sure that you are ready to read from the next line in the file.  You will also need to amend your diagnostic println statement(s) for outputting the marks to verify that they have been read correctly and stored in an array.

iii)	Finally, for Step 1:
•	comment out the diagnostic println() statements;
•	write a private method storeStudentRecord() to add each student's data to marksList;
•	write a displayResults() method which will write a report, to the terminal window, on the student's results in a format similar to the one below:
Results for CC1 Group 6
   Name                              Marks
1 Andreas Antoniades                65 85 77 
2 Charlotte Brocklebank                87 93 81 
3 suzanne dawson                0 55 42  ...
Note that the output in the terminal window is not aligned in "neat columns" because the student's names are of different lengths. 
Note also that that you are not to use any methods from the Arrays class to do this as this homework is testing your ability to use loops with an array.
•	Next, read in data from the file data2.txt.  If you have written your code sensibly, this will be a trivial matter and will require no change to your code -- if not, then .

Create a Test class in the project to make testing easier and quicker. Note that this Test class is much simpler than the one used in the last homework 

Step 2: Compute each student's average mark
Amend the displayResults() method so that the average mark of each student is calculated so that the output now is similar to:
Results for CS1 Group 2
Name                              Marks           Average
Andreas Antoniades                65 85 77        75.66666666666667
Charlotte Brocklebank                87 93 81        87.0
suzanne dawson                0 55 42        32.333333333333336 ...

Step 3: Add more methods to the MarksProcessor class,

i)	Write a method writeMarksData() that writes the data for all the student records stored in marksList to a text file in the same format as the files that are used for reading in data

ii)	Write a method clearMarksData() that removes all the entries from marksList.  This will be convenient when the user wishes to read in and display a different set of student data.

iii)	Write a method editMarksData() that allows a user to modify the marks of a particular student.  The method should have three int parameters:
•	studentPosn -- the position of the student as displayed by the displayResults() method;
•	markPosn -- the position of the mark to be modified, with 1 for the first mark displayed, etc;
•	newMark -- the new mark for the student.

Hand in details: 
•	You will need to submit a hard copy of the source code for this homework printed out via BlueJ.  Your name & group number should be on the front page.  All work should be handed in inside a clear plastic wallet and should be handed in at the workshop on Tuesday 11th February 2020.  

Note that by the act of following these instructions and handing your work in, it is deemed that you have read and understand the rules on plagiarism as written in your student handbook.

