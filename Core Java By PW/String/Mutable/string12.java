package String.Mutable;

public class string12
{
    public static void main(String[] args) {
     
     StringBuffer Str=new StringBuffer();
     System.out.println(Str.capacity()); // empty capacity minmum=16;
     Str.append("asdfghjklqwertyu");
     System.out.println(Str.capacity());
     Str.append("p");
     System.out.println(Str.capacity()); // maxim=16; new capacity=(current capacity+1)*2//(16+1)*2=32
     // how many charter you can add
     System.out.println(Str.length());// how many charter are presant
 
 
 
     StringBuffer Sb=new StringBuffer("Sachin"); // you adda 6 later 16+6=22
     System.out.println(Sb.capacity());
     System.out.println(Sb.charAt(1));
     // System.out.println(Sb.setCharAt(1, "A"));
     Sb.setCharAt(1, 'A');
     System.out.println(Sb); // change a to A
 
 
     StringBuffer sb= new StringBuffer(150);  // you add a number you add a capacity 150,default 16 are not count
     System.out.println(sb.capacity());
     sb.append("java"); //java 4 later
     System.out.println(sb.capacity());  //capacity 150
 
     sb.trimToSize(); // resize the string you did that capapcity thata are given and all are remove
     System.out.println(sb.capacity());
     System.out.println(sb);
 
     // sb.reverse();
     System.out.println(sb.reverse());
 
 
 
 
    }
 }
 
