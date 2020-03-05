package com.epam.collections;

public class Collections{
	private Object[] objectArr=new Object[10];
	public int length() {
		return objectArr.length;
	}
	private int count=0;
	
	public void add(Object object) {
		if(count==objectArr.length) {
			increaseLength();
		}
		objectArr[count]=object;
		count++;
	}
	public Object get(int index) {
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException("index "+index+"  out of bound");
			
		}
		return objectArr[index];
	}
	public void increaseLength() {
		int newcapacity=objectArr.length*2;
		Object[] nextArray=new Object[newcapacity];
		for(int i=0;i<objectArr.length;i++) {
			nextArray[i]=objectArr[i];
		}
		objectArr=nextArray;
	}
	public void print() {
		System.out.print("[  ");
		for(int i=0;i<count;i++) {
			System.out.print(objectArr[i]+"  ");
		}
		System.out.print("]");
	}
	
	public int size() {
		return count;
	}
	
	public void delete(int index) {
		System.out.print("Element at index " +index +" is "+objectArr[index] +" has been removed");
		if(index<0 || index>=size()) {
			throw new IndexOutOfBoundsException("index "+index+" out of bound");

		}
		while(index<size()-1) {
			objectArr[index]=objectArr[index+1];
			index++;
		}
		objectArr[index]=null;
		count--;

	}
	
}