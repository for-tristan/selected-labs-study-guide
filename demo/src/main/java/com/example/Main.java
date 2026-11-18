package com.example;



class student { // this is a class that represents a student 
    String name; // this student has a name
    int age; // this student has an age
    public String grade; // this student has a grade

    void study() { // this is a method that explains what the student (object) should preform
        System.out.println("All students are studying"); // this is the action that the student (object) should preform
            

    }
}


    class firstgrade extends student{ // this is a class is a child class that represents a 1st grade student (Inheritance)
      
        void simplemath(){ // this is a method that explains what the 1st grade student (object) should preform
            System.out.println("this grade students are learning simple math"); // this is the action that the 1st grade student (object) should preform
        }

    }

    class secondgrade extends firstgrade{ // this is a class is a child class that represents a 2nd grade student (Inheritance)
      
        void complexmath(){ // this is a method that explains what the 2nd grade student (object) should preform
            System.out.println("this grade students are learning complex math"); // this is the action that the 2nd grade student (object) should preform
        }

        secondgrade(String n , int a, String g){ // this is the constructor of the class secondgrade Parameterized constructor

            age = a;  // this is the age of the student
            name = n; // this is the name of the student
            grade = g; // this is the grade of the student

    }
}

    class teacher1{ // this is a class that represents a teacher1
    String name; // this teacher has a name
    int age; // this teacher has an age

    teacher1(){ // this is the constructor of the class teacher1 Default/no-argument constructor

        age = 36;  // this is the default age of the teacher
        name = "Mr. Smith"; // this is the default name of the teacher
    }


    public static String smith(){

        return "Mr. Smith is teaching"; // this is the default name of the teacher


    }

}



class teacher2{ // this is a class that represents a teacher2
    String name; // this teacher has a name
    int age; // this teacher has an age

    teacher2(String n , int a){ // this is the constructor of the class teacher2 Parameterized constructor

        age = a;  // this is the age of the teacher
        name = n; // this is the name of the teacher


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

    studying.study(); // call the method study() from the object studying

        teacher1.smith(); // call the static method smith() from the class teacher1
        teacher1 teacher1 = new teacher1(); // this is the object that we are gonna create using the class (blueprint) to call the method Smith() from the class teacher1
        System.out.println(teacher1.age); // print the age of the teacher
        System.out.println(teacher1.name); // print the name of the teacher
        System.out.println(teacher1.smith()); // print the return value of the static method smith() from the class teacher1


        teacher2 teacher2 = new teacher2("Ms. Williams", 35); // this is the object that we are gonna create using the class (blueprint) to call the method Smith() from the class teacher2

        System.out.println(teacher2.age); // print the age of the teacher
        System.out.println(teacher2.name); // print the name of the teacher

        firstgrade firstgrade = new firstgrade(); // this is the object that we are gonna create using the class (blueprint) to call the method simplemath() from the class firstgrade
        firstgrade.simplemath(); // call the method simplemath() from the object firstgrade
        firstgrade.study(); // call the method study() from the object firstgrade (Inheritance)



        
       
        secondgrade secondgrade = new secondgrade("Emily", 8, "Second Grade"); // this is the object that we are gonna create using the class (blueprint) to call the method complexmath() from the class secondgrade
        secondgrade.study(); // call the method study() from the object secondgrade (Inheritance)
        secondgrade.complexmath(); // call the method complexmath() from the object secondgrade
        secondgrade.simplemath(); // call the method simplemath() from the object secondgrade (Inheritance)


        System.out.println("Student Name: " + secondgrade.name); // print the name of the student
        System.out.println("Student Age: " + secondgrade.age); //
        System.out.println("Student Grade: " + secondgrade.grade); // print the grade of the student





    }   



    }


            

