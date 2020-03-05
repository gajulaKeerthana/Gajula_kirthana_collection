package com.epam.collections;
import java.util.Scanner;
public class MainMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Collection!!");
		boolean n = true;
		Collections collection = new Collections();
		char alphabet;
		for(alphabet = 'A'; alphabet <= 'J'; alphabet++)
	      {
	         collection.add(alphabet);
	      }
		System.out.println("the collection is");
		collection.print();
		System.out.println();
		while(n) {
			System.out.println("1. Adding an element\n2. Retrieve an element\n3. Deleting an element\n4. Display collection\n");
			char choice = sc.next().charAt(0);
			char rep;
			switch(choice) {
				case '1':
					System.out.println("Enter number of elements to be added:");
					int no = sc.nextInt();
					System.out.println("Enter the elements to be added:");
					for(int i = 0; i < no; i++)
					{
					String ele = sc.next();
					collection.add(ele);
					}
					collection.print();
					System.out.println("Want to continue? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thank you!");
						break;
					}
				case '2':
					System.out.println("Enter the index :");
					int index2add = sc.nextInt();
					Object ele = collection.get(index2add);
					System.out.println("The element at index "+ index2add +" is:"+ ele);
					System.out.println("Want to continue? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thank you!");
						break;
					}
				case '3':
					System.out.println("Enter the index :");
					int index2del = sc.nextInt();
					collection.delete(index2del);
					System.out.println();
					System.out.println("Updated collection");
					collection.print();
					System.out.println("Want to continue? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thank you!");
						break;
					}
				case '4':
					collection.print();
					System.out.println("Want to continue? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thank you!");
						break;
					}
				default:
					System.out.println("INVALID INPUT");
			}
		}
	}
}
