package com.example;


// Example of a good design (Single Responsibility Principle) 
class customer{

void addcustomer(){


}

}


class customerDB{

    void SaveToDatabase(){


    }

}


class customerReport{

    void printCustomerReport(){


    }


}


// open / closed principle design
abstract class shape{

    abstract void draw();
}

class rectangle extends shape{

    void draw(){

        System.out.println();
    }
}

class square extends shape{

void draw(){

        System.out.println();


}

}


// Liskov Substitution Principle design example

class bird {

        void layEggs(){

            System.out.println("laying eggs");
            
        }

}


interface flying{

    void fly();
}


class spparow extends bird implements flying{

public void fly(){

System.out.println("this bird can fly");

}

}

class penguine extends bird{



}



// example of Interface Segregation Principle design

interface work{

    void work();

}



interface eat{

    void eat();

}


class employee implements eat, work{


public void eat(){

        System.out.println("eating");

}


public void work(){

        System.out.println("Working");


}

}




class robot implements work{


    public void work(){

        System.out.println("Working");


    }


}


// Dependency Inversion Principle good design example


interface deliveryservice{

void deliver();

}




class deliveryguy implements deliveryservice{

 public void deliver(){



 }

}




class deliveryrobot implements deliveryservice{

 public void deliver(){
 }


}







class delivercompany{

    private deliveryservice service;

     delivercompany(deliveryservice service) {
        this.service = service;
    }

    void startdelivery(){


        service.deliver();
    }

   
    }










public class part2 {
    public static void main(String[] args) {
        
        deliveryservice service = new deliveryguy();


        delivercompany company = 

        new delivercompany(service);

        company.startdelivery();






    }
}




class Animal { 
    
    public String sound() {
        
        return "Some sound";
    
    }

}
class Dog extends Animal {
    
    @Override public String sound() { 
        
        return "Bark"; 
    
    } }
class Cat extends Animal {
    
    
    
    @Override public String sound() {
        
        return "Meow"; 
    
    } 
}


 Animal[] animals = {

new Dog(), new Cat(), new Animal()};

 }