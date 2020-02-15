import java.util.*;
import java.io.*;

/**
 * @author (@00533641 Plamen Savchev Group 1.1) 
 * 
 * @version (3.5 11/02/20)
 * 
 * class <code>MarksProcessor</code> simulates storing student data in a collection
 * and the name of the file list that is currently working on.
 */

public class MarksProcessor
{
    //name of the group e.g. CC1 Group 6
    private String nameOfCohort;
    
    //ArrayList - stores nameOfCohort,noOfMarks,name & marks of students
    private ArrayList<StudentRecord> marksList;

    /**
     * Default constructor for objects of class MarksProcessor
     */
    public MarksProcessor()
    {
        marksList = new ArrayList<>();
        nameOfCohort = null;
    }
    
    /**
     * Constructor for objects of class MarksProcessor that is passed file parameter    
     */
    public MarksProcessor(String fileName) throws FileNotFoundException
    {
        this();
        readMarksData(fileName);
    }
    
    /**
    * Adds an student record to the marks list
    *
    * @param   <code>student</code> an <code>StudentRecord</code> object, the 
    * student record to be added
    */
    public void storeToRecord(StudentRecord student)
    {
        marksList.add(student);
    }
    
    /**
    * Shows an student record by printing it's details.  This includes
    * it's position,name & marks in the collection.
    *
    * @param  <code>listPosition</code> the position of the student record
    */
    public void showStudent(int listPosition)
    {
        StudentRecord student;
        if (listPosition < marksList.size() )
        {
            student = marksList.get(listPosition);
            System.out.println(listPosition + 1 + " " + student.getName() + "               "
            + student.getMarks() + "           " + student.getMarkAverage());
        }
    }
    
    /**
    * Displays all the student records in the collection
    *
    */
    public void displayResults()
    {
        System.out.println("Results for " + nameOfCohort);
        System.out.println("  Name                              Marks          Average");
        
        int listPosition = 0;
        while (listPosition < marksList.size())
        {
            showStudent(listPosition);
            listPosition++;
        }
    }
    
    /**
    * Writes student records data to a file
    *
    * @param   <code>fileName</code> a <code>String</code>, the name of the 
    *          text file in which the data will be stored.
    * 
    * @throws  FileNotFoundException
    */
    public void writeMarksData(String fileName) throws FileNotFoundException
    {
        PrintWriter pWriter = new PrintWriter(fileName);
        boolean doneOnce=false;
        
        pWriter.println(nameOfCohort);
        for (StudentRecord sr : marksList)
        {
            if (!doneOnce)
            {
                pWriter.println(sr.getNoOfMarks());
                doneOnce=true;
            }
            String nameOfStudent = sr.getName();
            pWriter.println(nameOfStudent);
            String gradesOfStudent = sr.getMarks();
            pWriter.println(gradesOfStudent);
        }
        pWriter.close();
    }
   
    /**
    * Reads data from a file and adds corresponding student records to marksList
    *
    * @param   <code>fileName</code> a <code>String</code>, the name of the 
    *          text file in which the data is stored.
    * 
    * @throws  FileNotFoundException
    */   
   
    public void readMarksData(String fileName) throws FileNotFoundException
    {
        File dataFile = new File(fileName);
        Scanner scanner = new Scanner(dataFile);
        
        nameOfCohort = scanner.nextLine();
        //System.out.println(nameOfCohort);          //diagnostic statement
        
        int noOfMarks = scanner.nextInt();
        //System.out.println(noOfMarks);         //diagnostic statement
        scanner.nextLine();
        
        while ( scanner.hasNext() )
        {
            String name = scanner.nextLine();
            //System.out.println(name);         //diagnostic statement
            
            int[] marks = new int[noOfMarks];
            for (int i = 0; i < marks.length; i++) {
                    marks[i] = scanner.nextInt();
            }
            //System.out.println(marks[0]+" "+marks[1]+" "+marks[2]);   //diagnostic statement
            scanner.nextLine();
            
            storeToRecord( new StudentRecord (name, marks));
        }
        scanner.close();
        displayResults();
    }
    
    /**
     * Edit student record marks data selected by position
     *
     * @param  <code>listPosition</code> the position of the student record
     * @param  <code>markPosn</code> mark position in the array[] list
     * @param  <code>newMark</code> new value for the element from the array[]
     */
    public void editMarksData(int studentPosn,int markPosn, int newMark)
    {
        studentPosn -= 1;
        markPosn-= 1;
        StudentRecord sr;
        if (studentPosn < 0 || studentPosn > marksList.size())
        {
            System.out.println("Invalid position!");
        }
        else
        {
            sr=marksList.get(studentPosn);
            if (newMark >= 0 && newMark <=100)
            {
                sr.setMark(markPosn,newMark);
            }
            else
            {
                System.out.println("Invalid mark value!");
            }
        }
        System.out.println("System update:");
        showStudent(studentPosn);
    }
   
    /**
    * Remove an student records from the collection
    *
    * @param  <code>listPosition</code> the position of the student record
    */
    public void clearMarksData()
    {
        nameOfCohort = "";
        marksList.clear();
    }
}
