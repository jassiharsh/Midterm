package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Student student = new Student("Jaspreet", "Kaur", "Platinum", "002");

        try {
            Assert.assertEquals(student.getFirstName(), "Jaspreet");
            System.out.println("Test Passed getFirstName");
        } catch (AssertionError as) {
            System.out.println("Test Failed getFirstName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {
            Assert.assertEquals(student.getLastName(), "Jaspreet");
            System.out.println("Test passed lastName");
        } catch (AssertionError as) {
            System.out.println("Test Failed lastName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {
            Assert.assertEquals(student.getId(), "017");
            System.out.println("Test passed getId");
        } catch (AssertionError as) {
            System.out.println("Test Failed getId");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {
            Assert.assertEquals(student.getScore(), "Platinum");
            System.out.println("Test passed getScore");
        } catch (AssertionError as) {
            System.out.println("Test Failed getScore");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {
            Assert.assertEquals(student.toString(), "Student(id= 002)Jaspreet Kaur Grade = Platinum");
            System.out.println("Test passed toString");
        } catch (AssertionError as) {
            System.out.println("Test Failed toString");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }
    }
}