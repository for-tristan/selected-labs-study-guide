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

## Access modifiers in inheritance

Java has 4 access levels 

1. Private Accessible only inside the class where it is declared.

2. Public Accessible from anywhere, subject to normal Java visibility rules.

3. Protected Accessible inside the same package and through inheritance outside the package.

4. Default Accessible inside the same package. No modifier is written.
