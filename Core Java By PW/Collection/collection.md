 Data/ information  Store a Java Program in 2 way
 1-Varibale 
 example int mark=10;
 2-Array:- maximum number of data store 
          -int mark[]=10;

dis adv:- size are fixed 
-only homogenious data can be store 
- same type of data store large value
- no inbulit methode used

Collection:-
- set of Interface & class
- Store a data a large amout & data are add,retrive& manipulated the data inforamtion
- inbulit methode are used
- Homogenious data (Similar type of data)& Hetrogenious(mixed type of) Data  b e store
- Dynamic Size (not fixed Size)
- collection store data ,data will be store a object
-The Collection Framework(1.2V) is a set of interfaces, implementations, and algorithms 
that provide a standardized way to work with groups of objects. It was introduced to 
simplify the process of storing, manipulating, and processing collections of data in Java 
applications

List Interface
- List interface is the child interface of Collection interface.
- It inhibits a list type data structure in which we can store the ordered collection of objects
- It can have  duplicate values.
- List interface is implemented by the classes 
                -ArrayList,
                -LinkedList, 
                -Vector,
                -Stack.




1-Array list
- inside the util package all class are avilabale
- Array list are Hetrogenious Data Store(mixed type of data)
-Array list used Store rareend (end of store) & grow the size 
- array list are duplicate allow 
- System atically  addding 
- array list store Homogenious & Hetrogenious of  data store
- Arraylist implement a list interface.

The ArrayList class implements the List interface. 
● It uses a dynamic array to store the duplicate element of different data types. 
● The ArrayList class maintains the insertion order and is non-synchronized.
● The elements stored in the ArrayList class can be randomly accessed

List[parent] al = new Arratlist();


2-LinkedList:-
- Linked list followed by the Dobuly linl list data structure
- Linklist  impliment both list & Deque 
- Dupplicate allow
- Inseration & Deletion operation perfom any given position Very effeciently with out effect The memory.
- Same methode as a Arraylist & Extra 
● LinkedList implements the List and Deque interface.
● It uses a doubly linked list internally to store the elements. 
● It can store the duplicate elements. 
● It maintains the insertion order and is not synchronized. 
● In LinkedList, the manipulation is fast because no shifting is required.

3-ArrayDeque
- index base  acessing Not allow(middle mai not add)
- Araay Deque  Double endque
- Arraydeque implment linkdlist
- Arraydeque implent Deque
- Deque extend Queue 

● ArrayDeque class implements the Deque interface. 
● It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from 
both the ends.
● ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions

Queue
- one side insertion or Deletion

ArrayDeque 
- ArrayDeque internaly Double ended  Queue
- itg is a lightwight 
- inseraton & deltion  forntend or readed
- dupilicate allow

5-PriorityQueue
- min heap (left side small,right side big)
- order of insertion not presure
- null value not add
- Anoter type of data not used
- dupicate value allow
● The PriorityQueue class implements the Queue interface. 
● It holds the elements or objects which are to be processed by their priorities. 
PriorityQueue doesn't allow null values to be stored in the queue.

6-TreeSet
- < left
- > right
- in order(lvr) then fatch
- tree set  impliMENT SET
- behind sean bst used
● TreeSet class implements the Set interface that uses a tree for storage. 
● TreeSet also contains unique elements. 
● However, the access and retrieval time of TreeSet is quite fast. 
● The elements in TreeSet stored in ascending order


7-HashSet
- object add & collection add
- indx add not avi;lable
-  duplicate vale nit allow
- all value are unique
- Hash followed by hasing 
- inside hashing hash tabel are their
- data store je se ki collision nehi ho sekta hai 
- 1 biuggay 1 value 
- deafult value 16 
- load factor 0.75 or 75% (inside hash table 75% full automatically incrised  & buggy double )
HashSet class is used to create a collection that uses a hash table for storage. It inherits 
the AbstractSet class and implements Set interface.
The important points about HashSet class are:
● HashSet stores the elements by using a mechanism called hashing.
● HashSet contains unique elements only.
● HashSet allows null value.
● HashSet class is non synchronized.
● The initial default capacity of HashSet is 16, and the load factor is 0.75



8-LinkedHashSet
- linkhash is a child calass of a hash set
- sub class of hashset
LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface. It 
inherits the HashSet class and implements the Set interface.
The important points about the LinkedHashSet class are:
● LinkedHashSet class contains unique elements only like HashSet.
● provides all optional set operations and permits null elements.
● is non-synchronized.
● maintains insertion order









