package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        /*
		* Demonstrate how to use Map that includes storing and retrieving elements.
		* Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		* Use For Each loop and while loop with Iterator to retrieve data.
		*
	    * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		*/


        //implementation here


        //connect to database
		ConnectDB ct = new ConnectDB();
		Map<String, String> personalInfo = new HashMap<>();
		personalInfo.put("first name", "Jaspreet");
		personalInfo.put("last name", "Kaur");
		personalInfo.put("cellphone", "3472516194");
		personalInfo.put("email address", "Jassiharsh@gmail.com");

		System.out.println(personalInfo.get("cellphone"));
		for(Map.Entry entry: personalInfo.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());

		List<String> citiesOfUSA = new ArrayList<>();
		citiesOfUSA.add("NYC");
		citiesOfUSA.add("Chicago");
		citiesOfUSA.add("Houston");
		List<String> citiesOfCanada = new ArrayList<>();
		citiesOfCanada.add("Vancouver");
		citiesOfCanada.add("montreal");
		citiesOfCanada.add("ottawa");
		List<String> citiesOfEngland = new ArrayList<>();
		citiesOfEngland.add("London");
		citiesOfEngland.add("Birmingham");
		citiesOfEngland.add("Bradford");

		Map<String, List<String>> map = new HashMap<>();
		map.put("USA:", citiesOfUSA);
		map.put("Canada:", citiesOfCanada);
		map.put("England:", citiesOfEngland);

		System.out.println(map.get("USA"));
		for(Map.Entry entry: map.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());
	}
}








