package day7.staticMethods;

public class Example6 {		
	static double addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return res;
	}
	static double addNumber(int num1,int num2) {
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return (num1+num2);
	}
	static double addNumber(double num1,int num2) {
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return (num1+num2);
	}
	static double addNumber(int num1,double num2) {
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return (num1+num2);
	}
	public static void main(String[] args) {
		//as all the above methods has return type, hence they will return some value
		
		System.out.println(addNumber());
		System.out.println(addNumber(25, 35));
		System.out.println(addNumber(55, 15.06));
		System.out.println(addNumber(2.56, 10));
		double res=addNumber(2.56, 10);
	}
}
/**
 * when we declare same method multiple times in the same class with different type of parameter 
 * then that this concept is known as method overloading
 *	rule of method overloading:
 *		1. diff in number of argument
 *		2. diff in type of argument
 *		3. diff in position of argument
 *
 *	static/non-static:
 *			way to access
 *			check return type is required or not
 *			check parameter is required or not
 */




