/**
 * 
 */
package com.mycompany.section2;

/**
 * @author Sabrina
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyGenInterface<Integer, String> mgi1 = new MyGenClass<Integer, String>(1,"yourName");
		MyGenInterface<Integer, Integer> mgi2 = new MyGenClass<Integer,Integer>(1, 2017);
		Integer i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);
		
		System.out.println("The mgi1 key is: ");
		System.out.println(mgi1.getKey());
		System.out.println("The mgi1 value is: ");
		System.out.println(mgi1.getValue());
		System.out.println("The mgi2 key is: ");
		System.out.println(mgi2.getKey());
		System.out.println("The mgi2 value is: ");
		System.out.println(mgi2.getValue());
		
		System.out.println("i1 is: ");
		System.out.println(i1);
		System.out.println("f1 is: ");
		System.out.println(f1);

	}

}
