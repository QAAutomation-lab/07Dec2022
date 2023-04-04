package day5.loops;

public class ForLoop01 {

	public static void main(String[] args) {

		for (int i = 1; i <=5; i++) {
			System.out.println("Hello");
			System.out.println("Hello Good Evening");
			System.out.println("Hi");
			System.out.println("Hi Good Evening");
			System.out.println("Bye");
			System.out.println("============Ends of "+i+" iteration===============");
		}
		System.out.println("+++++ Print number from 1 to 50 ++++++");
		for(int i=1;i<=50;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n++++++Print number form 30 to 1 ++++++");
		for(int i=30;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println("\n++++++Print number form a to z ++++++");
		for(char c1='a';c1<='z';c1++) {
			System.out.print(c1+",");
		}
		System.out.println("\n++++++Print number form Z to A ++++++");
		for(char c1='Z';c1>='A';c1--) {
			System.out.print(c1+",");
		}
		System.out.println("\n*************************************");
		for(int i=1;i<=50;i++)
		{
			if(i%2==0) {
				System.out.println("Even number is "+i);
			}
		}
		//TODO: write a program to print prime number between 1 to 30
		
		//TODO: write a program to print vowels between a to k
	}
}
