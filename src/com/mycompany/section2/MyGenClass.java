/**
 * 
 */
package com.mycompany.section2;

/**
 * @author Sabrina
 *
 */
public class MyGenClass<K, V> implements MyGenInterface<K, V> {

	private K key;
	private V value;
	
	public MyGenClass(K _key, V _value)
	{
		key = _key;
		value = _value;
	}
	public K getKey()
	{
		return key;
	}
	public V getValue()
	{
		return value;
	}
	
	
	/**
	 * @param args
	 */
}
