package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) throws Exception {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.*/

		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

		System.out.println("Lowest number from the array is :"+LowestNumber.lowestNumber(array));

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(LowestNumber.lowestNumber(array));

		List list =  arrList;

		//Connect to MySql Database
		ConnectDB connectDB = new ConnectDB();

		//Create table in the database
		connectDB.insertDataFromStringToMySql("list","lowestNumber","number");


		//Read data from database
		List<String> numbers = connectDB.readDataBase("lowestNumber", "number");
		for(String st:numbers){
			System.out.println(st);
		}
	}

	public static int lowestNumber(int [] array){

		int lowest = Integer.MAX_VALUE;

		for (int value : array) {
			if (lowest > value) {
				lowest = value;
			}
		}

		return lowest;	}

}
