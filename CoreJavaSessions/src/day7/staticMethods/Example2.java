package day7.staticMethods;

public class Example2 {		
	static int addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return res;
	}
	static int addNumber(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		return res;
	}
	public static void main(String[] args) {
		Example2.addNumber();//it will execute method body and for each run it will give you same result but we won't be able to use its return value
		System.out.println("********1************");
		addNumber(10, 15);//it will execute method body but we won't be print to use its return value
		System.out.println("********2************");
		System.out.println("Result is:"+addNumber(20, 40));//it will execute method body and also print the return value in console
		System.out.println("********3************");
		int res=Example2.addNumber(20,40);//it will execute method body and stores the return value in the variable for future use
		System.out.println("Result of two numbers: "+res);
		int finalResult=res*10;
		System.out.println("Updated values is: "+finalResult);
		int x=finalResult+100;
		System.out.println(x);
	}
}
/**
 * WAP to check given number is prime or not
 * WAP to print even number for given range
 * WAP to check given number is palindrome or not
 * WAP to print the reverse number 
 */




