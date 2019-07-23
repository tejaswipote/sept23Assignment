package packageDemo;

import java.util.*;

public class MainSort {

	static Scanner sc = new Scanner(System.in);

//Method for printing Array element
	
	

//Method for reading Array element
	static int[] readArray() {

		// int a[]= {1,2,5,4,3,8}; //initialized array in program itself

		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter Element of array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		return a;
	}

	public static void main(String[] args) {

		int arr[] = readArray();// reads array element

		ISort iSort;

		// Read Choice of sorting
		System.out.println("Enter Your Choice");
		System.out.println("1:QuickSort");
		System.out.println("2:SelectionSort");
		int choice = sc.nextInt();

		switch (choice) {
		case ISort.QUICKSORT:
			iSort = new QuickSort();
			iSort.sort(arr);
			break;

		case ISort.SELECTIONSORT:
			iSort = new SelectionSort();
			iSort.sort(arr);
			break;

		default:
			System.out.println("Enter correct value");
		}
	
	}

}
