## refer to the main.java for the code detailed explanation  

an object represents two things

Attributes : which is the information about the object

methods : which is what the object does or can preform 

OOP in java is built around 

- classes 
- objects
- encapsulation
- inheritance
- polymorphism
- abstraction

---

### Classes 

is a blueprint of an object more like a general information about that object and a description about it, it also describes what an object should contain 


--- 

### Objects

An object is an instance of a class. which means Classes are the blueprint and objects are the actual living things inside that blueprint 

You can also create multiple objects from the same class


--- 

### methods 

A method is a block of code that preforms a specific action when called 

and theres two types of methods 

- Standard Library Methods
- User-Defined Methods

### whats the difference between the two 

- void does not return a value 

- int means the method returns an integer inside the static method


See example in Main.java


---

### Constructors

A constructor is a special method used to initialize an object when it is created inside the Class

theres 2 types 

- Default/no-argument constructor

- Parameterized constructor



Constructor rules
1. The constructor name must be identical to the class name.
2. It has no return type, not even void.
3. It executes automatically when an object is created.
4. It can accept parameters.
5. Constructors can be overloaded.

---

### Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

Term        |	 Meaning
Superclass  |	 Parent class
Subclass    |    Child class
extends	    |    Keyword used for class inheritance
IS-A        |  	 Relationship between parent and child

- Single Inheritance

 One child inherits from one parent.

- Multilevel Inheritance

 A chain of inheritance.

- Hierarchical Inheritance

 Multiple children inherit from the same parent.

## Access modifiers in inheritance

Java has 4 access levels 

1. Private Accessible only inside the class where it is declared.

2. Public Accessible from anywhere, subject to normal Java visibility rules.

3. Protected Accessible inside the same package and through inheritance outside the package.

4. Default Accessible inside the same package. No modifier is written.

---

### Polymorphism

polymorphism has many forms.

In Java, it allows the same method name or reference type to work with different implementations
so theres

- Method Overloading

- Method Overriding



### 1. Method Overloading

method overloading is creating multiple methods with the same name but different parameters

> see Main.java



### 2. Method Overriding

Method overriding happens when a child class provides its own implementation of a method already defined in its parent class.

> see Main.java




### Polymorphic referencing

You can call methods available through the reference, and the overridden instance method is called.

---



### Static Methods and Static Blocks

### 1. Static methods 

the static methods belongs to the class and its not an object 

- static methods can directly access static members

- They cannot directly access instance members.

- they cannot use ``` super```

- they cannot use ``` this``` which refers to an object meanwhile static methods belong to the class itself


### 2. Static Initialization Block

A static block initializes static data.

The static block executes when the class is initialized, before the main method in this example.


### 3. Instance Initialization Block (IIB)


An instance initialization block executes whenever an object is created.



---


### Abstraction

Abstraction means hiding unnecessary implementation details and showing only the essential functionality to the user.

- abstract class is created using ``abstract`` keyword.


Important abstract class rules
- Cannot create an object directly from it.
- Can contain abstract methods.
- Can contain normal methods.
- Can contain constructors.
- Can contain variables and fields.
- A concrete child class must implement all inherited abstract methods.

### When should you use abstraction?
According to your lecture:
- When you cannot provide implementation for all methods in a base class.
- When you want child classes to provide their own implementations.
- When you want to hide unnecessary implementation details.


### Interfaces

An interface is a contract that defines capabilities a class must provide.


Feature                 	Abstract Class      	            Interface
Keyword                 	abstract class      	            interface
Inheritance                 keyword	extends     	            implements
Object creation            	Not directly possible           	Not directly possible
Constructors            	Yes                              	No
Normal methods          	Yes                               	Yes, using permitted method types
Abstract methods        	Yes                 	            Yes
Instance variables      	Yes                             	No; interface fields are constants
Multiple inheritance    	A class extends only one class	    A class can implement multiple interfaces

