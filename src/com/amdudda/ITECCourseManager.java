package com.amdudda;

public class ITECCourseManager {

    public static void main(String[] args) {
	// write your code here
        // lab 6
        // new course
        ITECCourse itConcepts = new ITECCourse("Info Tech Concepts",
                1100,30,"T3050");
        // enroll some students
        itConcepts.addStudent("Max");
        itConcepts.addStudent("Nancy");
        itConcepts.addStudent("Orson");
        // print out the course info
        itConcepts.writeCourseInfo();

/*  -- old code from class, can ignore
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance",
                1310, 20, "t3010");

        //Add some students.
        //TODO check that we have not exceeded the max number for the class

        maintenanceCourse.addStudent("Anna A.");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        // write out course info
        maintenanceCourse.writeCourseInfo();


        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30, "t3000");

        // add some students.
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        // write out course info
        datacomCourse.writeCourseInfo();

        // new course
        ITECCourse javaCourse = new ITECCourse("Java Programming", 2545, 24, "t3040");

        // add some students
        javaCourse.addStudent("Gus");
        javaCourse.addStudent("Harry");
        javaCourse.addStudent("Izzy");
        javaCourse.addStudent("Anna D.");  // add myself too, since I'm taking the class. ;-)

        // write out course info
        javaCourse.writeCourseInfo();

        // drop harry from java course and verify code works as expected
        javaCourse.removeStudent("Harry");
        javaCourse.writeCourseInfo();

        //Test the add students method with a sample class//This class has a max of 3 students
        ITECCourse smallCourse = new ITECCourse("Small Course", 1111, 3, "t3050");
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        //We shouldn't add this student � what happens?
        smallCourse.addStudent("Marigold");

        // let's drop Kirby and then try adding marigold.
        smallCourse.removeStudent("Kirby");
        smallCourse.addStudent("Marigold");

        //Try to fetch smallCourse's name
        String smallCourseName = smallCourse.getName();
        System.out.println(smallCourseName);
        // and try changing its name
        smallCourse.setName("Very Small Course");
        // check our work
        System.out.println(smallCourse.getName());
*/

    } // end main
}  // end ITECCourseManager
