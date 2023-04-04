package day18.predefinedclasses.scannerclass;

class Demo {
	void display() {
		System.out.println("Demo class display method");
	}

	void callMe(int num) {
		System.out.println("Demo class callMe method");//
	}

	Demo() {
		System.out.println("Demo class cons..");
	}
}

public final class StaticReference {

	static Demo ref=new Demo();
	static int age=25;
	public static void main(String[] args) {
		// access Demo class non-static member
		Demo d1 = new Demo();
		d1.display();
		d1.callMe(123);		
		System.out.println(StaticReference.age);		
		StaticReference.ref.display();
		StaticReference.ref.callMe(123);
	//classname.staticrefvariable.methodname();
		
		System.out.println("Hello");
	//classname.staticrefvariable.method();
		System.err.println("I am error msg");
		

	}

}
