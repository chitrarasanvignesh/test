package STATIC;

//SingleTon is a Design pattter that ensure that a class can only have one object.To create a singleton class , 
//a class must implement the following properties:
//Create Private Constructor of the Class to  RESTICT Object Creation outside of the class.


//Java program implementing Singleton class
//With using getInstance() method
//class 1
//Helper Class

 class SingleTon {
	 // Static variable referance of single_instance of type Singleton
	 private static final SingleTon Instance = new SingleTon  ();
	 private SingleTon() {
		 public static SingleTon getInstance() {
			 return Instance;
		 }
	 }

}
 public class UseSingleton {
	 public static void main(String[] args) {
		 singleton s1 = new Singleton();
		 Singleton s2 = new Singleton();
		 if(s1 == s2) {
			 System.out.println("has");
		 }
	 }
 }
