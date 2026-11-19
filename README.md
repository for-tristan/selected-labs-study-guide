# Object-Oriented Programming (OOP) in Java

> **Code Reference:** Refer to `part1.java` for the practical code examples.

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

You can create multiple objects from the same class, each with its own attribute values.

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

> **Code Reference:** See `part1.java` for examples of method declarations, return types, and method calls.

---

## 4. Constructors

A **constructor** is a special member of a class used to initialize an object when it is created.

There are two common types of constructors:

1. **Default / No-Argument Constructor:** A constructor that takes no parameters.
2. **Parameterized Constructor:** A constructor that accepts parameters to initialize an object with specific values.

### Constructor Rules

1. The constructor name must be identical to the class name.
2. It has no return type, not even `void`.
3. It executes when an object is created using `new`.
4. It can accept parameters.
5. Constructors can be overloaded.
6. If no constructor is declared, Java provides a default no-argument constructor.
7. If a constructor is declared manually, Java does not automatically provide the default constructor.

### The `super()` Keyword

`super()` is used to call the constructor of the parent class.

- It must be the first statement in a constructor.
- It allows the parent class to initialize its inherited attributes.
- If no constructor call is written, Java inserts `super()` automatically when a suitable no-argument parent constructor exists.

---

## 5. Encapsulation

**Encapsulation** means hiding the internal data of a class and controlling access to it.

It protects an object's attributes from being accessed or modified directly from outside the class.

This is commonly achieved using:

- `private` attributes.
- **Getter methods** to retrieve attribute values.
- **Setter methods** to modify attribute values.

### Important Notes

- `private` prevents direct access from outside the class.
- A getter returns the value of an attribute.
- A setter changes the value of an attribute.
- Setters can validate a value before accepting it.

---

## 6. Inheritance

**Inheritance** allows one class to acquire the accessible attributes and methods of another class.

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

## 7. Polymorphism

**Polymorphism** means "many forms."

In Java, polymorphism allows the same method name or reference type to work with different implementations.

There are two main types:

- Method Overloading (compile-time)
- Method Overriding (runtime)

### 7.1 Method Overloading

**Method overloading** happens when a class contains multiple methods with the same name but different parameter lists.

The differences can be in:

- Number of parameters.
- Types of parameters.
- Order of parameter types.

**Important Notes:**

- Changing only the return type does not create a valid overload.
- Overloading is resolved at compile time.
- Static methods can also be overloaded.

> **Code Reference:** See `part1.java` for examples of method overloading.

### 7.2 Method Overriding

**Method overriding** happens when a child class provides its own implementation of an instance method that is already defined in its parent class.

The overridden method must follow Java's method signature and return-type compatibility rules.

**Important Notes:**

- The method name and parameter list must match.
- The return type must be the same or compatible according to Java's rules.
- The child method cannot reduce the visibility of the parent method.
- `@Override` is used to indicate that a method overrides a parent method.
- Static methods are hidden, not overridden.

> **Code Reference:** See `part1.java` for examples of method overriding.

### 7.3 Polymorphic Referencing

Polymorphic referencing allows a parent class reference to point to a child class object.

When calling an overridden instance method through that reference, Java executes the implementation belonging to the actual object at runtime.

---

## 8. Static Methods and Initialization Blocks

### 8.1 Static Methods

A **static method** belongs to the class itself rather than to a specific object.

Important rules:

- Static methods can directly access other static members.
- They cannot directly access instance members.
- They cannot use the `this` keyword because `this` refers to the current object.
- They cannot use `super` as an instance-context reference.
- They can be called using the class name without creating an object.

### 8.2 Static Initialization Block

A **static initialization block** is used to initialize static data.

Important points:

- It executes when the class is initialized.
- It executes once per class initialization.
- It runs before the class is first actively used, which may be before `main()` starts.

### 8.3 Instance Initialization Block (IIB)

An **Instance Initialization Block (IIB)** is a block of code that executes whenever an object is created.

Important points:

- It executes every time a new object is created.
- It runs before the constructor body.
- It is useful for sharing initialization code between constructors.

---

## 9. Abstraction

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

- When you cannot provide an implementation for all methods in a base class.
- When you want child classes to provide their own implementations.
- When you want to hide unnecessary implementation details.

---

## 10. Interfaces

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

- Interface methods are implicitly `public abstract` by default unless they use another permitted method type.
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
| Encapsulation | Hides and protects internal data. |
| Inheritance | Allows a class to acquire members from another class. |
| Overloading | Same method name, different parameters. |
| Overriding | Child class provides a new implementation of a parent method. |
| Polymorphism | One interface or reference, multiple forms of behavior. |
| Static | Belongs to the class rather than an individual object. |
| Abstraction | Hides implementation details and exposes essential functionality. |
| Interface | A contract that defines what a class must implement. |

---

# SOLID Principles

> **Code Reference:** Refer to `part2.java` for practical examples of the SOLID principles.

## What Are SOLID Principles?

SOLID is a collection of five principles used to create better object-oriented software.

It makes the code:

- Easier to understand.
- Easier to maintain.
- Easier to extend.
- More reusable.
- Less dependent on specific classes.

### The Five SOLID Principles

- **S - Single Responsibility Principle**
- **O - Open/Closed Principle**
- **L - Liskov Substitution Principle**
- **I - Interface Segregation Principle**
- **D - Dependency Inversion Principle**

---

## 1. Single Responsibility Principle (SRP)

A class should have only one responsibility and one reason to change.

This does not mean a class cannot have multiple methods, but those methods should belong to the same responsibility.

**Main Idea:** Each class should focus on one responsibility.

---

## 2. Open/Closed Principle (OCP)

Software entities should be **open for extension but closed for modification**.

- **Open for Extension:** We can add new functionalities.
- **Closed for Modification:** We should not need to keep changing existing working code whenever we add a new feature.

**Main Idea:** Add new functionality through extension rather than repeatedly modifying existing code.

---

## 3. Liskov Substitution Principle (LSP)

A parent class should be replaceable with objects of its child classes without breaking the behavior of the program.

Meaning that a child class should behave correctly wherever its parent class is expected.

**Main Idea:** Child classes must respect the behavior and expectations of their parent classes.

---

## 4. Interface Segregation Principle (ISP)

Classes should not be forced to depend on methods they do not use.

Meaning that creating one huge interface containing many unrelated methods is a bad design. Create smaller interfaces instead.

**Main Idea:** Keep interfaces small and focused on specific responsibilities.

---

## 5. Dependency Inversion Principle (DIP)

High-level modules should not depend on low-level modules. Both should depend on abstractions.

Meaning that important business logic should not depend directly on specific implementation classes.

### Dependency Injection (DI)

Dependency Injection is a technique used to provide an object with its dependencies from outside rather than creating those dependencies inside the class.

For example, a company can receive a delivery service through its constructor instead of creating a specific delivery person or robot itself.

**Main Idea:** Depend on abstractions instead of concrete classes.

### DIP vs. DI

- **DIP** is a design principle that describes how dependencies should be structured.
- **DI** is a technique for supplying dependencies from outside a class.

---

## Quick Revision

| Principle | Key Idea |
|---|---|
| SRP | One responsibility and one reason to change. |
| OCP | Open for extension, closed for modification. |
| LSP | Child classes should replace their parent without breaking behavior. |
| ISP | Use smaller, focused interfaces. |
| DIP | High-level and low-level modules should depend on abstractions. |

---

# Design Patterns

> **Code Reference:** Refer to `part3.java` for practical examples of Singleton and Factory patterns.

## What Are Design Patterns?

A **Design Pattern** is a proven, reusable solution to a common software design problem.

It is not ready-made code that you copy and paste. Instead, it is a template or approach that you adapt to solve a recurring problem.

### Types of Design Patterns

There are three main categories:

| Category | Purpose | Examples |
|---|---|---|
| Creational | Deals with object creation. | Singleton, Factory |
| Structural | Deals with how classes and objects are combined. | Adapter, Decorator |
| Behavioral | Deals with communication and interaction between objects. | Observer, Strategy |

---

# 1. Singleton Design Pattern

The **Singleton Pattern** ensures that a class has only one instance and provides a global access point to that instance.

Meaning that no matter how many times we request the object, we always get the same instance.

### Main Components

1. **Private Constructor:** Prevents other classes from creating objects using `new`.
2. **Static Instance:** Stores the single object of the class.
3. **Static Accessor:** Provides access to the existing instance or creates it when needed.

### Important Singleton Concepts

- `private constructor`: Prevents direct object creation from outside the class.
- `static instance`: Stores the single shared object.
- `getInstance()`: Returns the existing instance or creates it if it does not exist.
- Two references pointing to the same Singleton instance refer to the same object.

### 1.1 Eager Singleton

**Eager Initialization** means the Singleton instance is created immediately when the class is initialized.

Important notes:

- The object is created before it is requested.
- It is created during class initialization.
- It is simple to implement.
- Java class initialization is thread-safe.

### 1.2 Lazy Singleton

**Lazy Initialization** means the Singleton instance is created only when it is requested for the first time.

Important notes:

- The object is not created until the first call to the accessor method.
- It avoids creating the object if it is never needed.
- The basic implementation shown in the lecture is not thread-safe.

### Eager vs. Lazy Singleton

| Eager | Lazy |
|---|---|
| Creates the instance immediately. | Creates the instance when requested. |
| Created during class initialization. | Created during the first accessor call. |
| Can create an object even if it is never used. | Avoids creating an unused object. |
| Static initialization is thread-safe in Java. | Basic implementation is not thread-safe. |

### Common Uses of Singleton

- Configuration management.
- Logging systems.
- Shared application settings.
- Caches.

**Main Idea:** Singleton controls how many instances of a class exist and provides one shared access point.

---

# 2. Factory Design Pattern

The **Factory Pattern** is a creational design pattern that handles object creation through a dedicated method or factory class.

Instead of creating objects directly in the main code, we ask the factory to create the object for us.

### Main Idea

The client requests an object from the factory, and the factory decides which concrete class should be created.

### Main Components

1. **Product:** The parent class or interface that represents the objects being created.
2. **Concrete Products:** The child classes that provide different implementations.
3. **Factory:** The class responsible for creating the objects.
4. **Client:** The code that requests objects from the factory.

### Example: Enemy Factory

In the lecture example, we have an abstract `Enemy` class and two different enemy types:

- `Turtle`
- `Bird`

Each enemy has its own values for:

- Name
- Damage
- Health

The `EnemyFactory` contains identifiers for the available enemy types and a `createEnemy()` method.

The factory checks the requested ID and creates the matching enemy object.

If the ID is not recognized, the lecture's factory returns `null`.

The main program requests enemies from the factory and calls their shared `showup()` method without needing to create the concrete enemy objects directly.

### Example: Sandwich Factory

The lecture also demonstrates a sandwich factory.

The parent `SandWich` class contains common sandwich information, such as its name and calories.

The concrete products are:

- `CheeseBurger`
- `ChickenBurger`

The `SandwichFactory` receives a sandwich ID and returns the matching sandwich object.

The client then calls the shared `prepare()` method.

### Advantages of Factory

- Centralizes object creation in one place.
- Hides the object creation process from the client.
- Reduces direct dependency on concrete classes.
- Makes it easier to introduce new object types.
- Keeps the main code cleaner and easier to maintain.

### Singleton vs. Factory

| Singleton | Factory |
|---|---|
| Ensures only one instance exists. | Creates objects based on a requested type. |
| Controls the number of instances. | Controls the object creation process. |
| Uses a private constructor and a static access point. | Uses a dedicated factory method or class. |
| Example: One shared instance. | Example: Creating a Turtle or Bird. |

**Main Idea:** Singleton controls how many instances of a class exist, while Factory controls how objects are created.
