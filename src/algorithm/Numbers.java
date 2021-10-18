package algorithm;

import databases. ConnectDB;

import java.util.List;
import java.util.Random;

/*
 *Created by Jaspreet Kaur 10/18/2021
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {

		int[] num = new int[10];

		storeRandomNumbers(num);

		ConnectDB connectDB = new ConnectDB();

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;

		System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
		connectDB.insertDataFromArrayToMySql(num, "selection_sort", "SortingNumbers");
		System.out.println("Data showing form database :");
		List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
		printValue(numbers);
		int n = num.length;
		randomize(num, n);
		System.out.println("********************===================*********************=======================***************");


		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

		connectDB.insertDataFromArrayToMySql(num, "insertion_sort", "SortingNumbers");
		System.out.println("Data showing form database :");
		List<String> numbersi = connectDB.readDataBase("insertion_sort", "SortingNumbers");
		printValue(numbersi);
		int ni = num.length;
		randomize(num, ni);
		System.out.println("********************===================*********************=======================***************");


		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");

		connectDB.insertDataFromArrayToMySql(num, "bubble_sort", "SortingNumbers");
		System.out.println("Data showing form database :");
		List<String> numbersb = connectDB.readDataBase("bubble_sort", "SortingNumbers");
		printValue(numbersb);
		int nb = num.length;
		randomize(num, nb);
		System.out.println("********************===================*********************=======================***************");


		algo.mergeSort(num);
		long mergSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergSortExecutionTime + " milli sec");

		connectDB.insertDataFromArrayToMySql(num, "merge_sort", "SortingNumbers");
		System.out.println("Data showing form database :");
		List<String> numbersm = connectDB.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbersm);
		int nm = num.length;
		randomize(num, nm);
		System.out.println("********************===================*********************=======================***************");


		algo.quickSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");

		connectDB.insertDataFromArrayToMySql(num, "quick_sort", "SortingNumbers");
		System.out.println("Data showing form database :");
		List<String> numbersq = connectDB.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbersq);
		int nq = num.length;
		randomize(num, nq);
		System.out.println("********************===================*********************=======================***************");


		algo.heapSort(num);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");

		connectDB.insertDataFromArrayToMySql(num, "heap_sort", "SortingNumbers");
		System.out.println("Data showing form database :");
		List<String> numbersh = connectDB.readDataBase("heap_sort", "SortingNumbers");
		printValue(numbersh);
		int nh = num.length;
		randomize(num, nh);
		System.out.println("********************===================*********************=======================***************");


		algo.bucketSort(num);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " Numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");

		connectDB.insertDataFromArrayToMySql(num, "bucket_sort", "SortingNumbers");
		System.out.println("Data showing form database :");
		List<String> numbersck = connectDB.readDataBase("bucket_sort", "SortingNumbers");
		printValue(numbersck);
		int nck = num.length;
		randomize(num, nck);
		System.out.println("********************===================*********************=======================***************");


		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " Numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");

		connectDB.insertDataFromArrayToMySql(num, "shell_sort", "SortingNumbers");
		System.out.println("Data showing form database :");
		List<String> numbersl = connectDB.readDataBase("shell_sort", "SortingNumbers");
		printValue(numbersl);
		int nl = num.length;
		randomize(num, nl);
		System.out.println("********************===================*********************=======================***************");


	}

	public static void storeRandomNumbers(int[] num) {
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(10);
		}
	}

	public static void randomize(int arr[], int n) {
		Random r = new Random();

		for (int i = n - 1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void printValue(List<String> array) {
		for (String st : array) {
			System.out.println(st + " ");
		}
	}
}