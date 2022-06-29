package STATIC;

public class TestStaticMethod {
	public static void main(String[] args) {
		//creating object
		StudentsMethod.change();
		StudentsMethod s1 = new StudentsMethod(111,"Karan");
		StudentsMethod s2 = new StudentsMethod(123,"ramu");
		StudentsMethod s3 = new StudentsMethod(132,"jaya");
		//calling display method
		s1.display();
		s2.display();
		s3.display();
		
	}

}
