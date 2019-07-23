package packageDemo;

public class QuickSort implements ISort {
	// Overrided method sort for quicksort implementation
	@Override
	public void sort(int[] arr) {
		long start=System.nanoTime();
		System.out.println("Using Quick sort....");

		int size = arr.length;
		for (int i = 0; i < size - 1; i++)
			for (int j = 0; j < size - i - 1; j++)
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		long end=System.nanoTime();
	final	long total=end-start;
	ISort.printArray(arr);	
	System.out.println(" Execution time :"+total);
	}
	
}

