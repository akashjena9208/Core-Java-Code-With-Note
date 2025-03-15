1-Constructor:- Object creation time initilizes the code You used construtor
            -Same name is a class name 
            -no returent type like:-(int ,string....)
            -Public not mendotory.
 -A constructor in Java Programming is a block of code that initializes (constructs) the state and value during object creation.



2-Default Constructor:- 
 * -object craeat time constractor call as progamer you can't include constractor.
 * -behind the seen automatically java compiler DEfault Constor creat and call .
 * - it is zero constractor
  
  -2nd  time  object  craet  you both craet all constructor java .
  
  
3-Default Constructor
● For every java class constructor concept is applicable.
● If we don't write any constructor, then the compiler will generate a default constructor.

4-Constuctor
● If we write at least one constructor then the compiler won't generate any default
constructor, so we say every java class will have a compiler generated default
constructor or programmer written constructor but not both simultaneously.


5-Constructor Overloading/ConstructorChaining
- writiing multipule constractor differnt parametter.
-A class can contain more than one constructor and all these constructors have the same name they differ only in the type of argument, hence these constructors are considered as "Overloaded constructor". 


6-super() / This():- one constractor another constractor call 
super() :-call parent class
 this():-call same class
    i. The first line inside the constructor can be super()or this().

    ii. If we are not writing anything then compiler will automatic  generate super().

Difference b/w super(),this()?

super(),this()

● These are constructor calls
● These are used to invoke super class and current class constructor directly
● We should use only inside the constructor that to first line otherwise we get compile time error.


Acces Modifier :- it is used Varibale,Class,Methode,Contrarctor
1-Public:-
- it is used same class  Acess
- Outside the class same package(Same folder Same Package) Acess
- outSide the Package child class(Same PAckage Another Folder) Acess
- No reltionship Access
ex:- public void disp 

2-Protect:-
- it is used same class  Acess
- Outside the class same package(Same folder Same Package) Acess
- outSide the Package child class(Same PAckage Another Folder) Acess

3-default:- 
- it is used same class  Acess
- Outside the class same package(Same folder Same Package) Acess
not write anything 
ex:- void disp

4-Privat:-
- it is used same class  Acess

