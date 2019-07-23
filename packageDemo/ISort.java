
package packageDemo;

// interface containing Sort method
interface ISort {

	int QUICKSORT = 1;
	int SELECTIONSORT = 2;


	void sort(int[] arr);
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}// TODO Auto-generated method stub
		
	}
}
