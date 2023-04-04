package day18.predefinedclasses.stringclasses;

final class MyImmutableClass{
	final String name;
	final int empId;
	MyImmutableClass(String s1,int e1){
		name=s1;
		empId=e1;
	}	
	public String getName() {
		return name;
	}
	public int getEmpId() {
		return empId;
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyImmutableClass m1=new MyImmutableClass("Pune",123);
		System.out.println(m1.getName()+" "+m1.getEmpId());
//		m1.empId=105;
//		m1.name="ABC";
		MyImmutableClass m2=new MyImmutableClass("Mumbai",4656);
		System.out.println(m2.getName()+" "+m2.getEmpId());
	}

}
