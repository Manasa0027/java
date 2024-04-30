package week6;

public class student
{
	private String name;
    private int[] internalMarks;

    public student(String name, int[] internalMarks) 
    {
        this.name = name;
        this.internalMarks = internalMarks;
    }

    public String getName()
    {
        return name;
    }

    public int[] getInternalMarks()
    {
        return internalMarks;
    }
}

class GradeCalculator 
{
    public static void calculateGrade(student student) 
    {
        double averageMarks = calculateAverageMarks(student.getInternalMarks());
        char grade = getGrade(averageMarks);
        System.out.println("Grade: " + grade);
    }

    private static double calculateAverageMarks(int[] marks)
    {
        int sum = 0;
        for (int mark : marks)
        {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    private static char getGrade(double averageMarks)
    {
        if (averageMarks >= 90) 
        {
            return 'A';
        } 
        else if (averageMarks >= 80) 
        {
            return 'B';
        } 
        else if (averageMarks >= 70) 
        {
            return 'C';
        } 
        else if (averageMarks >= 60)
        {
            return 'D';
        } 
        else {
            return 'F';
        }
    }
}
class Mainstudent
{
    public static void main(String[] args) 
    {
        int[] internalMarks = {90, 95, 90};
        student student = new student("MANASA C P", internalMarks);
        System.out.println("Student: " + student.getName());
        GradeCalculator.calculateGrade(student);
    }
}

