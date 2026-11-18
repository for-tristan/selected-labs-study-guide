# Object-Oriented Programming (OOP) in Java

> **Code Reference:** Refer to `part1.java` for detailed code explanations and practical examples.

## What Is an Object?

An object represents two main things:

- **Attributes:** Information or data about the object.
- **Methods:** Actions or behaviors that the object can perform.

Object-Oriented Programming (OOP) in Java is built around six main concepts:

1. Classes
2. Objects
3. Encapsulation
4. Inheritance
5. Polymorphism
6. Abstraction

---

## 1. Classes

A **class** is a blueprint or template used to create objects.

It provides general information about an object and describes what an object should contain, including its attributes and methods.

Think of a class as a design or plan that defines how objects should be structured and behave.

---

## 2. Objects

An **object** is an instance of a class.

This means:
- A class is the blueprint.
- An object is the actual instance created from that blueprint.

You can also create multiple objects from the same class, each with its own attribute values.

---

## 3. Methods

A **method** is a block of code that performs a specific action when called.

There are two main types of methods:

- **Standard Library Methods:** Predefined methods provided by Java.
- **User-Defined Methods:** Methods created by the programmer.

### Return Types

A method's return type determines what kind of value it gives back after execution.

- `void`: The method does not return a value.
- `int`: The method returns an integer.
- Other types, such as `String`, `double`, and `boolean`, can also be used as return types.

**Code Reference:** See `part1.java` for examples of method declarations and calls.

---

## 4. Constructors

A **constructor** is a special member of a class used to initialize an object when it is created.

There are two common types of constructors:

1. **Default / No-Argument Constructor:** A constructor that takes no parameters.
2. **Parameterized Constructor:** A constructor that accepts parameters to initialize an object with specific values.

### Constructor Rules

1. The constructor name must be identical to the class name.
2. It has no return type, not even `void`.
3. It executes automatically when an object is created using `new`.
4. It can accept parameters.
5. Constructors can be overloaded.

---

## 5. Inheritance

**Inheritance** allows one class to acquire the attributes and methods of another class.

It promotes code reusability and establishes a relationship between classes.

### Inheritance Terminology

| Term | Meaning |
|---|---|
| Superclass | Parent class |
| Subclass | Child class |
| `extends` | Keyword used for class inheritance |
| IS-A | Relationship between a parent and child class |

### Types of Inheritance in Java

**1. Single Inheritance**

One child class inherits from one parent class.

**2. Multilevel Inheritance**

A chain of inheritance where a class inherits from another child class.

**3. Hierarchical Inheritance**

Multiple child classes inherit from the same parent class.

> **Note:** Java does not support multiple inheritance through classes. However, a class can implement multiple interfaces.

### Access Modifiers in Inheritance

Java provides four access levels that control where class members can be accessed.

| Modifier | Accessibility |
|---|---|
| `private` | Accessible only inside the class where it is declared. |
| `public` | Accessible from anywhere, subject to normal Java visibility rules. |
| `protected` | Accessible within the same package and through inheritance outside the package. |
| `default` | Accessible only within the same package. No modifier is written. |

---

## 6. Polymorphism

**Polymorphism** means "many forms."

In Java, polymorphism allows the same method name or reference type to work with different implementations.

There are two main types:

- Method Overloading (compile-time)
- Method Overriding (runtime)

### 6.1 Method Overloading

**Method overloading** happens when a class contains multiple methods with the same name but different parameter lists.

The differences can be in:
- Number of parameters.
- Types of parameters.
- Order of parameter types.

> **Code Reference:** See `part1.java` for examples of method overloading.

### 6.2 Method Overriding

**Method overriding** happens when a child class provides its own implementation of a method that is already defined in its parent class.

The overridden method must follow Java's method signature and return-type compatibility rules.

> **Code Reference:** See `part1.java` for examples of method overriding.

### Polymorphic Referencing

Polymorphic referencing allows a parent class reference to point to a child class object.

For example, a parent reference can refer to an instance of one of its subclasses.

When calling an overridden instance method through that reference, Java executes the implementation belonging to the actual object at runtime.

---

## 7. Static Methods and Initialization Blocks

### 7.1 Static Methods

A **static method** belongs to the class itself rather than to a specific object.

Important rules:

- Static methods can directly access other static members.
- They cannot directly access instance members.
- They cannot use the `this` keyword because `this` refers to the current object.
- They cannot use the `super` keyword because `super` refers to the parent-class portion of the current object.
- They can be called using the class name without creating an object.

### 7.2 Static Initialization Block

A **static initialization block** is used to initialize static data.

Important points:

- It executes when the class is initialized.
- It executes only once per class initialization.
- It runs before the `main()` method when that class is initialized as part of starting the program.

### 7.3 Instance Initialization Block (IIB)

An **Instance Initialization Block (IIB)** is a block of code that executes whenever an object is created.

Important points:

- It executes every time a new object is created.
- It runs before the constructor body.
- It is useful for sharing initialization code between constructors.

---

## 8. Abstraction

**Abstraction** means hiding unnecessary implementation details and showing only the essential functionality to the user.

In Java, abstraction can be achieved using:

- Abstract Classes
- Interfaces

### Abstract Classes

An abstract class is declared using the `abstract` keyword.

### Important Abstract Class Rules

- You cannot create an object directly from an abstract class.
- It can contain abstract methods (methods without an implementation).
- It can contain normal methods with implementations.
- It can contain constructors.
- It can contain variables and fields.
- A concrete child class must implement all inherited abstract methods unless it is also declared abstract.

### When Should You Use Abstraction?

According to the lecture:

- When you cannot provide an implementation for all methods in a base class.
- When you want child classes to provide their own implementations.
- When you want to hide unnecessary implementation details.

---

## 9. Interfaces

An **interface** is a contract that defines capabilities a class must provide.

A class uses the `implements` keyword to implement an interface and provide implementations for its required abstract methods.

### Abstract Class vs. Interface

| Feature | Abstract Class | Interface |
|---|---|---|
| Keyword | `abstract class` | `interface` |
| Inheritance keyword | `extends` | `implements` |
| Object creation | Cannot be instantiated directly | Cannot be instantiated directly |
| Constructors | Yes | No |
| Normal methods | Yes | Yes, using permitted method types |
| Abstract methods | Yes | Yes |
| Instance variables | Yes | No; fields are constants (`public static final`) |
| Multiple inheritance | A class can extend only one class | A class can implement multiple interfaces |

### Important Interface Notes

- Interface methods are implicitly `public abstract` by default unless they are declared as permitted alternative method types.
- Interface variables are implicitly `public static final`.
- A class can implement multiple interfaces.
- Interfaces support abstraction by defining what a class must do without necessarily defining how it does it.

---

## Quick Revision

| Concept | Key Idea |
|---|---|
| Class | Blueprint for creating objects. |
| Object | An instance of a class. |
| Method | A block of code that performs an action. |
| Constructor | Initializes an object when it is created. |
| Inheritance | Allows a class to acquire members from another class. |
| Overloading | Same method name, different parameters. |
| Overriding | Child class provides a new implementation of a parent method. |
| Polymorphism | One interface or reference, multiple forms of behavior. |
| Static | Belongs to the class rather than an individual object. |
| Abstraction | Hides implementation details and exposes essential functionality. |
| Interface | A contract that defines what a class must implement. |

---

**Reference:** `part1.java` contains the practical code examples used to understand these OOP concepts.


# SOLID Principles


### 1. What are Solid principles

SOLID is a collection of five principles used to create better object-oriented software.

it makes the code 

- easier to understand 
- easier to maintain
- easier to extend 
- more reusable
- less dependant on specific classes

###  S - Single Responsibility
### O - Open/Closed
### L - Liskov Substitution
### I - Interface Segregation
### D - Dependency Inversion
---


### Single Responsibility Principle

A class should have only one responsibility and one reason to change
which doesnt mean a class cant have multiple methods but it should belong to the same responsibility.


### Open/Closed Principle

Software entities should be open for extension but closed for modification.

open for extension where We can add new functionalities 
closed for modifications where we shouldnt need to keep changing the existing working code



### Liskov Substitution 

is when a parent class should be replaceable with objects of its own child class without breaking the behavior 

meaning that A child class should behave correctly wherever its parent class is expected.


### Interface Segregation Principle

Classes should not be forced to depend on methods they dont use 

meaning that creating one huge interface containing many methods is a bad design create smaller ones instead 


### Dependency Inversion Principle

high level modules should not depend on low level modules both should depend on abstractions 


