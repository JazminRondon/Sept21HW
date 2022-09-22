Variables and Object Chapter 3
-variables need a type a name
-primitive(8 types) & non-primitives types 
-pg 54. There is no such think as an object variable, only an object reference variable (pointer)
-you can’t stuff an object into a variable
-objects only live in the garbage collectible heap
-dot operator (.),”use the thing before the dot to get me the thing after the dot.”
	-ex: myDog.bark();           object referenced by the variable is myDog to invoke the bark method 
-Book c =new Book();
 Book b = new Book();
declare a variable   create an object link the object and the reference 
-An array variable is a pointer to an array object 
-pg 59. Every element in an array is just a variable 
-an array is just an object, even though it’s an array of primitives 
-elements in a Dog array are just Dog reference variables 

How Objects Behave Chapter 4
-state(instance variable) affects behavior(methods), behavior affects state- represented by instance variables and methods 
-pg 72. class describes what an object knows and what an object does 
-parameters/arguments for the values passed into a method
	-A method uses parameters. A caller passes arguments
-every method is declared with a return type unless it has a void return type 
-pg 79. Getters and Setters 
--Encapsulation (data hiding)
-pg 80. Instant variable reachable/exposed with the dot operator 
	Avoid this by forcing everyone to call a setter method, protect from unacceptable change 
-achieve encapsulation by declare the variables in the class as private and providing getter and setter methods to modify and view variables values 
-pg 85. Instance variables are declared inside a class. Local variables are declared within method
-only instance variables get a default variable 
- .equal() method to know if two objects are equal

Serious Polymorphism 
-marking class as abstract stops it from being instantiated 
-stop anyone from saying “new” on that type (stop any code from ever creating an instance of that type 
-Concrete classes are those that are specific enough to be instantiated
	-means it’s OK to make objects of that type 
-abstract class means the class must be extended; abstract method means the method must be overridden 
-an abstract method has no body
	-just declare it with a semi colon. Ex:      public abstract void eat();
-pg 203. you can’t have an abstract method in a non-abstract class 
-pg 208. Class Object is the superclass of everything 
