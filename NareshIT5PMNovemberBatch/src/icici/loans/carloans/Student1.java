package icici.loans.carloans;

public class Student1 
{
	private int no;
	private String name;
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) 
	{
		Student1 obj = new Student1();
		obj.no=100;
		System.out.println(obj.no);
		obj.name="kiran";
		System.out.println(obj.name);
	}

}
