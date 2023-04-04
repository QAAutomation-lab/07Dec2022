package day20.collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		
	//	ArrayList al1=new ArrayList();
			//or
		List l1 = new ArrayList();
		System.out.println("Is list empty: "+l1.isEmpty());
		l1.add(123);//Auto boxing(int to Integer object) ---> Auto upcasting (Integer object to Object object)
		l1.add("Pune");//Auto upcasting (String object to Object object)
		l1.add(true);//Auto boxing ---> auto upcasting
		l1.add(null);
		System.out.println("Elements count in list: "+l1.size());
		System.out.println("list elements are: "+l1);
		l1.add("Pune");
		System.out.println("Elements count in list: "+l1.size());
		System.out.println("list elements are: "+l1);
		l1.add(2, "Bangalore");//Auto upcasting (String object to Object object)
		System.out.println("Elements count in list: "+l1.size());
		System.out.println("list elements are: "+l1);
		System.out.println("*****************************");
		List l2 = new ArrayList();
		l2.add("Java");
		l2.add("Selenium");
		l2.add("Manaual");
		System.out.println("List2 elements count: "+l2.size());
		System.out.println("List2 elements are: "+l2);
		System.out.println("===================================");
		l2.addAll(1,l1);
		System.out.println("List2 elements count: "+l2.size());
		System.out.println("List2 elements are: "+l2);
		System.out.println("########################################");
		System.out.println("print element present in index 5: "+l2.get(5));
		System.out.println("print element present in index 1: "+l2.get(1));
		System.out.println("print element present in index 6: "+l2.get(6));
		System.out.println("print element present in index 2: "+l2.get(2));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(int i=0;i<l2.size();i++) {
			System.out.println("Element at "+i+": "+l2.get(i));
		}
		System.out.println("*******************************************");
		for(Object obj:l2) {
			System.out.println(obj);
		}
	}
}
