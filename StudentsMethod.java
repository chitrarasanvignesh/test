package STATIC;
// java program
public class StudentsMethod {
 int rooNo;
 String name;
 static String college = "ITS";
 //static method to change the value of static variable
 static void change() {
	college = "asd";
 }
 //Constructor to initialize the variable
 StudentsMethod(int r ,String n){
	 rooNo=r;
	 name =n;
 }
 //method to display values
  void display() {
	 System.out.println(rooNo+" "+name+" "+college);
 }
}
