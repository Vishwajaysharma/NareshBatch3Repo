package icici.loans.homeloans;

public class Student 
{
	
	    private String name;
	    private int age;
	    private String rollNumber;

	    // Constructor
	    public Student(String name, int age, String rollNumber) 
	    {
	        this.name = name;
	        this.age = age;
	        this.rollNumber = rollNumber;
	    }

	 
	    // Method to display student details
	    public void displayInfo() 
	    {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("----------------------");
	    }

}
