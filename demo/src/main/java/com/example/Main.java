package com.example;


interface schoolsignup{

    void name();
    void age();
    void number();
    void grade();
    

}

class signin implements schoolsignup{

public void name(){


}

public void age(){


}

public void number(){


}

public void grade(){


}


}

abstract class janitor { // this is an abstract class that represents a school


    abstract void dirty(); // this is an abstract method that explains what the student (object) should preform


        void clean(){

            System.out.println(" the janitor1 cleans the classes ");

        }

        
}

    class mess extends janitor {


        @Override
        void dirty(){
            System.out.println(" the mess makes the hallways dirty ");
        }


}

class dirt extends janitor{

@Override 

void dirty(){

    System.out.println("the dirt makes the hallways dirty");
}

}




class person { // this is a class that represents a person
        String name;
        int age;


    person(){ // this is the constructor of the class person Default/no-argument constructor

      System.out.println("this is a person");


    }
}

class student extends person { // this is a class that represents a student 



    public String grade; // this student has a Public grade


    {
        System.out.println("this is a student");
    }

    static {

        System.out.println("This is a static block that will be executed when the class is loaded"); // this is a static block that will be executed when the class is loaded
    }

    void study() { // this is a method that explains what the student (object) should preform
        System.out.println("All students are studying"); // this is the action that the student (object) should preform
            

    }

    void grades() { // this is a method that explains what the student (object) should preform
        System.out.println("these students are getting grades"); // this is the action that the student (object) should preform
            

    }
            // preforming method overloading to create multiple methods with the same name but different parameters
    int grade(int math, int science){ // this is the first method that explains what the student (object) should preform

        return math + science; // this is the action that the student (object) should preform

    }

    int grade(int math , int science, int english){ // this is the second method that explains what the student (object) should preform

        return math + science + english; // this is the action that the student (object) should preform



}

    double grade(double math , double science, double english, double AP){ // this is the third method that explains what the student (object) should preform

        return math + science + english + AP; // this is the action that the student (object) should preform

    }

    static int grade(int math , int science, int english, int AP, int history){ // this is the fourth method that explains what the student (object) should preform

        return math + science + english + AP + history; // this is the action that the student (object) should preform

    }


    student(){

        super();
        System.out.println("this is a school");

    }

}


    class firstgrade extends student{ // this is a class is a child class that represents a 1st grade student (Inheritance)
      
        void simplemath(){ // this is a method that explains what the 1st grade student (object) should preform
            System.out.println("this grade students are learning simple math"); // this is the action that the 1st grade student (object) should preform
        }

        @Override // preforming method overriding to change the behavior of the method grades() from the parent class student
        void grades() { // this is a method that explains what the 1st grade student (object) should preform
            System.out.println("first grade students are getting grades"); // this is the action that the 1st grade student (object) should preform
                

        }

    }



    class secondgrade extends firstgrade{ // this is a class is a child class that represents a 2nd grade student (Inheritance)
      
        void complexmath(){ // this is a method that explains what the 2nd grade student (object) should preform
            System.out.println("this grade students are learning complex math"); // this is the action that the 2nd grade student (object) should preform
        }

        secondgrade(String n , int a, String g){ // this is the constructor of the class secondgrade Parameterized constructor

            name = n;
            age = a;
            grade = g;

    }

      @Override  // preforming method overriding to change the behavior of the method grades() from the parent class firstgrade
         void grades() { // this is a method that explains what the 2nd grade student (object) should preform
               System.out.println("second grade students are getting grades"); // this is the action that the 2nd grade student (object) should preform
            

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
        firstgrade.grades(); // call the method grades() from the object firstgrade (Inheritance)


        
       
        secondgrade secondgrade = new secondgrade("Emily", 8, "Second Grade"); // this is the object that we are gonna create using the class (blueprint) to call the method complexmath() from the class secondgrade
        secondgrade.study(); // call the method study() from the object secondgrade (Inheritance)
        secondgrade.complexmath(); // call the method complexmath() from the object secondgrade
        secondgrade.simplemath(); // call the method simplemath() from the object secondgrade (Inheritance)
        secondgrade.grades(); // call the method grades() from the object secondgrade (Inheritance)


        System.out.println("Student Name: " + secondgrade.name); // print the name of the student
        System.out.println("Student Age: " + secondgrade.age); //
        System.out.println("Student Grade: " + secondgrade.grade); // print the grade of the student

        student grade = new student(); // this is the object that we are gonna create using the class (blueprint) to call the method grade() from the class student
        
        System.out.println(grade.grade(90, 80)); // call the first method grade() from the object grade
        System.out.println(grade.grade(90, 80, 70)); // call the second method grade() from the object grade
        System.out.println(grade.grade(90.33, 80.11, 70.32, 60.23)); // call the third


        student.grade(13, 14, 15, 16, 17); // call the fourth static method grade() from the class student without creating an object of the class student

        mess mess = new mess();
        dirt dirt = new dirt();
        mess.clean();
        mess.dirty();
        dirt.dirty();



    }   



    }


            

