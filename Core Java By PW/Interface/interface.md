1- Insterface 
 - it is allow a Abstarct methode  both Write Are same.(Same As a abstract class)
    (Interface  have a key word that have  no defination or no implimatation that is called  or unwanted data are hide  declrered interface )
 
 -  interface CAn not creat a object
 - Constarctor not particepat a interface.

 Methode:-(Public abstract )every Methode inside the inerface  Bydefult public & Abstarct
 Varibale:-(Public s6tatic Final ) Every Varibale in dide the Interface Bydefult Public Static Final

 -interface used "impliment" Key  
 - class  word not Write  a Directly write interface

 example
//class
interface Student

//variable
age=22;//by defult public static final So value pass 
{
    //methode
     void Show()//by defult public abstract
      {
        can not define bcz by defult public abstract  so that reason
      }
}


-All methode are Abstract methode
-interface can't be initilaze Means Object are Not Creat
-Methode are  Bydefult public & Abstarct
-No constractor interface
-interface used "impliment" Key  Word




2- Abstarct vs interface

abstarct
- Normal methode & Abstract Methode both  are  used Abstarct (if u need to used abstract) 
- Inside abstract class no need  to be  public & abstract
- every abstract not need to be  public statc final
- inside the abstract write a constractor (inside the abstract We take constractctuor call super )
- abstract used extend keyword


interface
- we do not crat a object
- inside Methode   Bydefult used public & Abstarct
- inside veriable bydefult  used public static final
- Not used  constractor 
-interface used "impliment" Key  Word
- interface implimenten multipule interface.
- interface can also extend another interface.

//..........Java 8..................................................................................................//
inner class 3 types methode:- class inside the class
- Static
- Memeber(non Static)
- Anonimoues(no name)

inner class
Inner class:- class inside the class is a inner class
- outer class not used a static
- inner classs used static


Interface 3 types
1-Single:-only one abstract methode 
2-Normal:- multiple absstrct  methode
3-Marker:-no abstrct  methode or Empty interface

Functional inerface:-
- That inerfance single / only one abstract methode that is called  functional interfance

Lamdaexprdession:-
- it is depends open a functional intterface.
(requre parmeter) -> sout();

Adv
- code optimize
- code short
- effecent

dis Adv
- only write functional interface
- You can not write lambda expression Every whear


Lamdaexprdession Write {} curly bracket:- used on 2case
case-1
{
  .............
  .....................
  return ;
}
- inside the implementation  you Write return statement used{}
//or
- if  you reterun key word mention you write {}

case -2
- inside the body more then one statement  
//or
-if u write multipule statemnet uesd a {}



//............................................................Summarey........................................................//

- interface used Specific requremnt
- interface refrence creat  but object not creat
- interface not implimtation
- interface all inside methode public & Abstract
- interface all varibale public static final
- java8:- inside the class body define/write  using "Defult" Keyword
- one class multipule implemnt possibule 
- one class multipule impliment possibule
- without inter face lambdar expesiion not write
-  Functional inter face only write lambada expression
-lamda expession  (parameter rewure) -> interface
//{} optional





