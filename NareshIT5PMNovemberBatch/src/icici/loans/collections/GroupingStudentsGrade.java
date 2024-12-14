package icici.loans.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingStudentsGrade 
{

	public static void main(String[] args) 
	{
		Map<String, List<String>> gradeStudents = new HashMap<String, List<String>>();
		gradeStudents.put("Grade 10", new ArrayList<String>());
		gradeStudents.put("Grade 11", new ArrayList<String>());
		
		gradeStudents.get("Grade 10").add("Alice");
		gradeStudents.get("Grade 10").add("Bob");
		gradeStudents.get("Grade 10").add("Ravi");
		gradeStudents.get("Grade 11").add("Charlie");
		
		System.out.println("Students grouped by grade : " + gradeStudents);
	}

}
