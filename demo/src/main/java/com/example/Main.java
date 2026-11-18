package com.example;





class student { // this is a class that represents a student 
    String name; // this student has a name
    int age; // this student has an age

  public static String studying() { // this is a static method that explains what the student (class) should preform
    return "All students are studying"; 
}


    void study() { // this is a method that explains what the student (object) should preform
        System.out.println("all are studying"); // this is the action that the student (object) should preform
            

    }
}
class Main { 

public static void main(String[] args) {

// we can create multiple objects from the same class (blueprint) and set their properties (name and age) to different values.

    student studying = new student(); // this is the object that we are gonna create using the class (blueprint) to call the method study() from the class student


    student student1= new student(); // this is the student object that we are gonna create using the class (blueprint)
    student student2= new student(); // this is the second student object that we are gonna create using the class (blueprint)
    student student3= new student(); // this is the third student object that we are gonna create using the class (blueprint)


    student1.name = "John"; // set the name of the student from the class
    student1.age = 20; // set the age of the student from the class

    student2.name = "Jane"; // set the name of the student from the class
    student2.age = 22; // set the age of the student from the class

    student3.name = "Jack"; // set the name of the student from the class
    student3.age = 21; // set the age of the student from the class


    

    System.out.println("Student Name: " + student1.name); // print the name of the student
    System.out.println("Student Age: " + student1.age); // print the age of the student
    System.out.println("Student Name: " + student2.name); // print the name of the student
    System.out.println("Student Age: " + student2.age); // print the age of the student
    System.out.println("Student Name: " + student3.name); // print the name of the student
    System.out.println("Student Age: " + student3.age); // print the age of the student

    System.out.println(student.studying()); // call the static method studying() from the class student

    studying.study(); // call the method study() from the object studying

    }   



    }


            

