
package STATIC;

public class Students {
int rollno;//Instance Variable
String name;
static String college = "ITS";//Static Variable
//Constructor
public Students(int r , String n) {
	rollno = r;
	name = n;
}
//Method to dispaly the Value
public void display() {
	System.out.println(rollno+" "+name+" "+college);
}
}
// Test Class To Show the Value Of Object

