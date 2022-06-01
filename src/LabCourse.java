/*
 * Robert Henderson
 * 01/23/2021
 * Chapter 10 Assignment
 */

public class LabCourse extends CollegeCourse
{
	private int adjFee;
	
	public LabCourse(String department, String courseNumber, int numCredits)
	{
		super(department, courseNumber, numCredits);
		setAdjFee(super.getFee());
	}
	
	@Override
	public void display()
	{
		System.out.println("Department: " + getDepartment() + " | Course Number: " + getCourseNum() + 
				" | Amt of Credits: " + getNumCredits() + " | Fee: $" + getAdjFee());
	}
	
	public int getAdjFee()
	{
		return adjFee;
	}
	
	public void setAdjFee(int f)
	{
		adjFee = (f * numCredits) + 50;
	}
}
