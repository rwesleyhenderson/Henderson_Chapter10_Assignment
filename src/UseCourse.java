/*
 * Robert Henderson
 * 01/23/2021
 * Chapter 10 Assignment
 */


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UseCourse
{
	private static String department;
	private static String courseNum;
	private static int credits;
	static ArrayList<String> courseList = new ArrayList<String>();
	
	public static void main(String[] args)
	{
		Scanner input = null;
	
		try
		{
			input = new Scanner(System.in);
			String quit = "n";
			String deptMsg = "Please enter the Department: ";
			String courseNumMsg = "Please enter the Course Number: ";
			String creditNumMsg = "Please enter the number of credits: ";

			do
			{
				System.out.print(deptMsg);
				department = input.next().toUpperCase();
				input.nextLine();
				
				System.out.print(courseNumMsg);
				courseNum = input.next();
				input.nextLine();
				
				System.out.print(creditNumMsg);
				credits = Integer.parseInt(input.next());
				input.nextLine();
				
				if(department.equals("BIO") | department.equals("CHM") | department.equals("CIS") | department.equals("PHY"))
				{
					LabCourse course = new LabCourse(department, courseNum, credits);
					course.display();
					
					//the following is just something i made to gather output from the stream to collect into an arraylist to output later
					//not part of assignment, just for fun
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					PrintStream ps = new PrintStream(baos);
					PrintStream old = System.out;
					System.setOut(ps);
					course.display();
					System.out.flush();
					System.setOut(old);
					String list = baos.toString();
					courseList.add(list);
				}
				else
				{
					CollegeCourse course = new CollegeCourse(department, courseNum, credits);
					course.display();
					
					//the following is just something i made to gather output from the stream to collect into an arraylist to output later
					//not part of assignment, just for fun
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					PrintStream ps = new PrintStream(baos);
					PrintStream old = System.out;
					System.setOut(ps);
					course.display();
					System.out.flush();
					System.setOut(old);
					String list = baos.toString();
					courseList.add(list);
				}
				
				
				
				System.out.print("Enter another course?(y/n): ");
				quit = String.valueOf(input.next().charAt(0));
				System.out.println();

			}while("y".equalsIgnoreCase(quit));
			
			
			//for fun, display stream collected arraylist here
			for(String str:courseList)
			{
				System.out.println(str);
			}
			
		} finally {
			if (input != null) 
			{
				input.close();
			}
		}	
	}
}
