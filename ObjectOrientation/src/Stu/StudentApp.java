package Stu;

public class StudentApp {
	public static void main(String[] args) {
		
	Student s1 = new Student();
	Student s2 = new Student();

	s1.eat();
	s1.sleep();

	s1.id =1;
	s1.name="Abhi";
	

	s2.id =2;
	s2.name="Anu";
	

	System.out.println(s1.id+" "+s1.name);
	System.out.println(s2.id+" "+s2.name);

	}

}
