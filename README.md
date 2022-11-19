# SOLID Principles

##### Table of Contents  :
  - [What are SOLID Principles ?](#solid_definetion)
  - [Background](#bg)
  - [Why SOLID](#why_solid)
  - [SOLID Refer to](#solid_def)
  - [Single Responsibility Priciple](#s)
  - [Open Closed Priciple](#o)
  - [Liskov Substitution Priciple](#l)
  - [Interface Segregation Priciple](#i)
  - [Dependency Inversion Priciple](#d)
  - [Resources](#resources)

<a name="solid_definetion"></a>
## What are SOLID Principles ?
The SOLID Principles are five principles of Object-Oriented class design. They are a set of rules and best practices to follow while designing a class structure.
<br/>

<a name="bg"></a>
## Background:
The SOLID principles were first introduced by the famous Computer Scientist Robert J. Martin (a.k.a Uncle Bob) in his paper in 2000. But the SOLID acronym was introduced later by Michael Feathers.
<br/>

<a name="why_solid"></a>
## Why we need SOLID ?
These five principles help us understand the need for certain design patterns and software architecture in general.
<br/>
"To create understandable, readable, and testable code that many developers can collaboratively work on."
<br/>

<a name="solid_def"></a>
## What does SOLID refer to ??
  - **S**ingle Responsibility Principle
  - **O**pen-Closed Principle
  - **L**iskov Substitution Principle
  - **I**nterface Segregation Principle
  - **D**ependency Inversion Principle
  
![SOLID Priciples](https://www.technologylogs.com/wp-content/uploads/2020/12/Solid_principle.jpg)
<br/>

<a name="s"></a>
## 1-Single Responsibility Principle -S.R.P- :
Every class should have only one reason to modify on it . "Uncle Bob"

![S.R.P Model](https://miro.medium.com/max/1400/1*UhvaCg9qOCYZyDJZh180hQ.png)



<a name="o"></a>
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



<a name="l"></a>
## 3- Liskov Substitution Principle:
The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.
<br/>
This means that, given that class B is a subclass of class A, we should be able to pass an object of class B to any method that expects an object of class A and the method should not give any weird output in that case.


#### Example :
![Liskov Substitution 1](https://miro.medium.com/max/1200/1*iV_TeHoEDE0TwhQEFj2fxA.png)
<br/>


<a name="i"></a>
## 4- Interface Segregation Principle
Segregation means keeping things separated, and the Interface Segregation Principle is about separating the interfaces.
<br/>
The principle states that many client-specific interfaces are better than one general-purpose interface. Clients should not be forced to implement a function they do no need.


#### Examples
![Interface Segregation 1](https://blog.ndepend.com/wp-content/uploads/ISP.png)


<a name="d"></a>
## 5- Dependency Inversion Principle
The Dependency Inversion principle states that our classes should depend upon interfaces or abstract classes instead of concrete classes and functions.
<br/>
Most of time we apply this principle with Open Close Principle , because they are related to each of them.


#### Example :
![DI Example](https://media-exp1.licdn.com/dms/image/C5612AQFFFjbboRXvhw/article-cover_image-shrink_600_2000/0/1647405323448?e=2147483647&v=beta&t=RAPpylzq5sBfKXy4kwiPZlI2DUzJktln3xQQmEQW6CI)

#### how to implement this priciple in your code ?
  - By adding new layer,module,or class and make it abstract "dosen't contain any concrete code".
  - Make this class mutual between high level module and low level module.
  - One Class -mostly- the High Level Class will contain this abstract class as Data Member on it.
  - The other class -mostly- the Low Level Class will inherit from this abstract class and impement its methods.
By using this approach we separate the high level code away from low level code and make our project modules independant from each other.


<a name="resources"></a>
## Resources for study:

 - [Freecodecamp Article](https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/)
 - [Semi Colon Academy Introduction Video](https://youtu.be/I6FBMVhmhTo)
 - [Eng Mohammed Reda Playlist](https://youtube.com/playlist?list=PLnqAlQ9hFYdflFSS4NigVB7aSoYPNwHTL)
 - [Eng Omar Ahmed Playlist **Recommended**](https://youtube.com/playlist?list=PLwWuxCLlF_uevri_OpofVLXkRRFnZ7TSV)
 - Head First OO Book **highly recommended**



