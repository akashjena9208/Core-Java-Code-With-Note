package com;
//ctp
class A1
{
	public  int add(int a,int b){
        return (a+b);
    }
}

class A2 extends A1
{
	@Override
	public  int add(int a,int b){
        return (a-b);
    }
}
public class A3 {
	
	public static void main(String[] args) {
		A1 obj= new A2();
		System.out.println(obj.add(30, 20));
		A2 obj1=(A2) obj;
		System.out.println(obj1.add(30, 20));
	}

}
