# SOLID Principles

##### Table of Contents  :
  - [What are SOLID Principles ?](#solid_definetion)
  - [Background](#bg)

<a name="solid_definetion"></a>
## What are SOLID Principles ?
The SOLID Principles are five principles of Object-Oriented class design. They are a set of rules and best practices to follow while designing a class structure.
<br/>

<a name="bg"></a>
## Background:
The SOLID principles were first introduced by the famous Computer Scientist Robert J. Martin (a.k.a Uncle Bob) in his paper in 2000. But the SOLID acronym was introduced later by Michael Feathers.
<br/>
## Why we need SOLID ?
These five principles help us understand the need for certain design patterns and software architecture in general.
<br/>
"To create understandable, readable, and testable code that many developers can collaboratively work on."
<br/>
## What does SOLID refer to ??
  - **S**ingle Responsibility Principle
  - **O**pen-Closed Principle
  - **L**iskov Substitution Principle
  - **I**nterface Segregation Principle
  - **D**ependency Inversion Principle
  
![SOLID Priciples](https://www.technologylogs.com/wp-content/uploads/2020/12/Solid_principle.jpg)
<br/>
## 1-Single Responsibility Principle -S.R.P- :
Every class should have only one reason to modify on it . "Uncle Bob"

![S.R.P Model](https://miro.medium.com/max/1400/1*UhvaCg9qOCYZyDJZh180hQ.png)




## 2- Open Closed Principle -OCP- :
The Open-Closed Principle requires that classes should be open for extension and closed to modification.
<br/>
Modification means changing the code of an existing class, and extension means adding new functionality.


#### What this principle wants to say ?
We should be able to add new functionality without touching the existing code for the class. This is because whenever we modify the existing code, we are taking the risk of creating potential bugs. So we should avoid touching the tested and reliable (mostly) production code if possible.

#### How can I implement this principle in my code ?
  - Abstraction : abstract class Or interfaces.
  - Polymorphism.

![Open Close Principle Simulation](https://miro.medium.com/max/372/1*gZcKz9sqrZeaIA0NAfY3Rg.png)




## Liskov Substitution Principle:
The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.
<br/>
This means that, given that class B is a subclass of class A, we should be able to pass an object of class B to any method that expects an object of class A and the method should not give any weird output in that case.


#### Example :
![Liskov Substitution 1](https://miro.medium.com/max/1200/1*iV_TeHoEDE0TwhQEFj2fxA.png)
<br/>

