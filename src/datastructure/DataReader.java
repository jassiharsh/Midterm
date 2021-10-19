package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("C:\\Users\\jassi\\OneDrive\\Desktop\\PIIT\\Test.text");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			br = new BufferedReader(fr);
			String str = " ";
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}



