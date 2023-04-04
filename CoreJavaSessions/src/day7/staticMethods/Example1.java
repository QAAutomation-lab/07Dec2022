package day7.staticMethods;

public class Example1 {
	
	public static void display() {
		System.out.println("Hi, I am shailesh");
		System.out.println("You are learning Core-Java");
		System.out.println("My contact number is 9764975157");
	}	
	static void showDetails(String name,char grade,int num) {
		System.out.println("Hi, I am "+name);
		System.out.println("Your grade is "+grade);
		System.out.println("My contact number is "+num);
	}
	
	static void addNumber() {
		int num1=20,num2=30,res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		System.out.println("Result is : "+res);
	}
	static void addNumber(int num1,int num2) {
		int res;
		res=num1+num2;
		System.out.println("Number1 is : "+num1);
		System.out.println("Number1 is : "+num2);
		System.out.println("Result is : "+res);
	}
	public static void main(String[] args) {
		display();//we can run this method multiple times, but you will get same result for each run
		//System.out.println(display());// as this won;t return any value hence we can;t write it inside println()
		showDetails("Pune", 'A', 986656);
		showDetails("Mumbai", 'B', 123456);
		showDetails("Delhi", 'C', 98562);
		System.out.println("*****************");
		addNumber();
		Example1.addNumber();
		System.out.println("******************");
		addNumber(15, 25);
		Example1.addNumber(55, 45);
	}
}





