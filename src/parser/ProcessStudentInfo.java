package parser;

import databases.ConnectDB;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProcessStudentInfo {

	/*
	 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
	 * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and
	 * 'C' for 70 to 79.
	 *
	 * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map.
	 * Once map has all data, retrieve those data and out put to console.
	 *
	 * Do any necessary steps that require for below successful output.
	 * ......................................................
	 * Student (id= 1) "Ibrahim" "Khan"        		Grade= B
	 * Student (id= 2) "Asif" "Roni"          		Grade= A
	 * Student (id= 3) "Gumani" "Hose"              Grade= A
	 * Student (id= 4) "Sukanto" "Shaha"            Grade= B
	 * Student (id= 5) "MD" "Hossain"               Grade= C
	 * ......................................................
	 *
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and to retrieve data.
	 *
	 */

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String pathSelenium = System.getProperty("user.dir") + "/src/parser/selenium.xml";
		String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";
		String tag = "id";
		ConnectDB connect = new ConnectDB();
		Map<String, List<Student>> list = new LinkedHashMap<String, List<Student>>();


		List<Student> seleniumStudents = new ArrayList<Student>();
		List<Student> qtpStudents = new ArrayList<Student>();


		XmlReader xmlReader = new XmlReader();


		seleniumStudents = xmlReader.parseData(tag, pathSelenium);


		qtpStudents = xmlReader.parseData(tag, pathQtp);


		list.put("Selenium Students", seleniumStudents);


		list.put("QTP Students", qtpStudents);


		for (Map.Entry<String, List<Student>> value : list.entrySet()) {
			List<Student> students = list.get(value.getKey());
			System.out.println("\n" + value.getKey() + " Students");
			for (Student s : students) {
				String id = s.getId();
				String firstname = s.getFirstName();
				String lastname = s.getLastName();
				String grade = s.getScore();
				System.out.println("Student (id=" + id + ") '" + firstname + "'  '" + lastname + "       \t'Grade= " + grade);
			}

			//connectToSqlDB.insertDataFromArrayListToMySql(seleniumStudents, "qtp","studentList");

			List<Student> stList = connect.readStudentListFromMongoDB("QTP");
			for (Student st : stList) {
				System.out.println(st.getFirstName() + " " + st.getLastName() + " " + st.getScore() + " " + st.getId());
			}


			List<Student> st1List = connect.readStudentListFromMongoDB("Selenium");
			for (Student st : st1List) {
				System.out.println(st.getFirstName() + " " + st.getLastName() + " " + st.getScore() + " " + st.getId());
			}
		}
	}
}