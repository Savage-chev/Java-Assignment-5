/**
 * @author (@00533641 Plamen Savchev Group 1.1) 
 * 
 * @version (3.5 11/02/20)
 * 
 *class <code>StudentRecord</code> simulates a student record and stores 
 * the name and array of marks.
 */

public class StudentRecord
{
    //name of the student e.g. Andreas Antoniades
    private String name;
    
    //marks of the student e.g. 65 85 77
    private int[] marks;

    /**
    * Create an student record with the specified name and specified array
    * of marks
    * @param  <code>name</code> a <code>String</code> specifying the 
    * name of student
    * @param  <code>makrs</code> a <code>int[]</code> specifying array
    * of marks 
    */
    public StudentRecord(String name, int marks[])
    {
        this.name = name;
        this.marks = marks;
    }

    /**
    * Returns the name of the <code>StudentRecord</code> object
    * 
    * @return   the name of student, as a <code>String</code>
    */
    public String getName()
    {
        return name;
    }
    
    /**
    * Returns the marks of the <code>StudentRecord</code> object
    * 
    * @return   the marks of student, as a <code>String</code>
    */
    public String getMarks()
    {
        String result = "";
        for (int i=0; i<marks.length; i++)
        {
            result = result + " " + marks[i];
        }
        return result;
    }
    
    /**
    * Returns the  number of elements in the array[] marks of the 
    * <code>StudentRecord</code> object
    * 
    * @return   the number of marks of student, as a <code>String</code>
    */
    public String getNoOfMarks()
    {
        String noOfMarks = String.valueOf(marks.length);
        return noOfMarks;
    }
    
    /**
     * Edit student record marks data
     *
     * @param  <code>markPosn</code> mark position in the array[] list
     * @param  <code>newMark</code> new value for the element from the array[]
     */
    public void setMark(int markPosn, int newMark)
    {
        for (int i=0 ; i <= marks.length ; i++)
        {
            if ( markPosn >= 0 && markPosn <= marks.length )
            {
                if (i == markPosn)
                {
                    marks[i] = newMark;
                }
            }
            else
            {
                System.out.println("Invalid mark position!");
            }
        }
    }
    
    /**
    * Returns the marks average of the marks array from the 
    * <code>StudentRecord</code> object
    * 
    * @return   the marks average of student, as a <code>double</code>
    */
    public double getMarkAverage()
    {
        double markAverage = 0;
        for (int i=0; i<marks.length; i++)
        {
            markAverage = markAverage + (double)marks[i] / marks.length;
        }
        return markAverage;
    }
    
    /**
    * Returns a string representing the <code>StudentRecord</code> object. 
    * 
    * @return   a <code>String</code> representation of the student name & marks
    */
    public String toString()
    {
        return name + " " + marks;
    }
}
