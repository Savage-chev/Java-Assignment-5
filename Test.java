import java.util.*;
import java.io.*;

/**
 * @author (@00533641 Plamen Savchev Group 1.1) 
 * 
 * @version (3.5 11/02/20)
 * 
 * This class function is to test the methods from the Mark Processor and
 *  StudentRecord objects.
 */

public class Test
{
    public MarksProcessor marksProcessor;   //Hold reference for the marksProcessor object
    
    public StudentRecord studentRecord;     //Hold reference for the studentRecord object

    /**
     * Constructor for objects of class Test
     */
    public Test() throws FileNotFoundException
    {
        marksProcessor= new MarksProcessor();  //Creating new object of the type MarksProcessor 
        
        //STEP 1 CHECKING --> Using data1.txt that holds 3 marks for each student
        
        marksProcessor.readMarksData("data1.txt"); //reading the passed file
        
        marksProcessor.editMarksData(1,1,99);      //edit mark of selected student
        
        marksProcessor.displayResults();           //display list after edit
        
        marksProcessor.writeMarksData("t1.txt");   //writing new file
        
        marksProcessor.clearMarksData();           //clears the arrayList
        
        //STEP 2 CHECKING --> Using data1.txt that holds 5 marks for each student
        
        marksProcessor.readMarksData("data2.txt"); //reading the passed file
        
        marksProcessor.editMarksData(1,1,99);      //edit mark of selected student
        
        marksProcessor.displayResults();           //display list after edit
        
        marksProcessor.writeMarksData("t2.txt");   //writing new file
        
        marksProcessor.clearMarksData();           //clears the arrayList
        
        //STEP 3 CHECKING --> Using data1.txt (3marks) & data2.txt (5marks) per student
        
        marksProcessor.readMarksData("data1.txt"); //reading the passed file
        
        marksProcessor.readMarksData("data2.txt"); //reading the passed file
        
        marksProcessor.editMarksData(1,1,99);      //edit mark of selected student
        
        marksProcessor.displayResults();           //display list after edit
        
        marksProcessor.writeMarksData("t3.txt");   //writing new file
        
        marksProcessor.clearMarksData();           //clears the arrayList
        
        //STEP 4 CHECKING --> Using first data2.txt(5marks) than data1.txt(3 marks)
        
        marksProcessor.readMarksData("data2.txt"); //reading the passed file
        
        marksProcessor.readMarksData("data1.txt"); //reading the passed file
        
        marksProcessor.editMarksData(1,1,99);      //edit mark of selected student
        
        marksProcessor.displayResults();           //display list after edit
        
        marksProcessor.writeMarksData("t4.txt");   //writing new file
        
        marksProcessor.clearMarksData();           //clears the arrayList
        
        //STEP 5 CHECKING --> For invalid position entry while editing
        
        marksProcessor.readMarksData("data1.txt"); //reading the passed file
        
        marksProcessor.editMarksData(999,1,1);      //student position - out of range
        
        marksProcessor.clearMarksData();           //clears the arrayList
        
        //STEP 6 CHECKING --> For invalid marks elementent while editing
        
        marksProcessor.readMarksData("data1.txt"); //reading the passed file
        
        marksProcessor.editMarksData(1,99,100);      //marks element - out of range
        
        marksProcessor.clearMarksData();           //clears the arrayList
        
        //STEP 7 CHECKING --> For invalid mark entry while editing
        
        marksProcessor.readMarksData("data1.txt"); //reading the passed file
        
        marksProcessor.editMarksData(1,1,999);      //student new mark - out of range
        
        marksProcessor.clearMarksData();           //clears the arrayList
    }
}