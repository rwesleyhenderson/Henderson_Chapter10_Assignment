/*
 * Robert Henderson
 * 01/23/2021
 * Chapter 10 Assignment
 */

public class CollegeCourse
{
	private String department;
	private String courseNumber;
	protected int numCredits;
	protected static final int FEE = 120;
	
	public CollegeCourse(String department, String courseNumber, int numCredits)
	{
		setDepartment(department);
		setCourseNum(courseNumber);
		setNumCredits(numCredits);
	}
	
	public void display()
	{
	   System.out.println("Department: " + getDepartment() + " | Course Number: " + getCourseNum() + 
			   " | Amt of Credits: " + getNumCredits() + " | Fee: $" + getNumCredits() * FEE);
	}
	
	public String getDepartment()
	{
		return department;
	}
	public String getCourseNum()
	{
		return courseNumber;
	}
	public int getNumCredits()
	{
		return numCredits;
	}
	
	public int getFee()
	{
		return FEE;
	}
	
	public void setDepartment(String d)
	{
		department = d;
	}
	public void setCourseNum(String n)
	{
		courseNumber = n;
	}
	public void setNumCredits(int c)
	{
		numCredits = c;
	}
}
