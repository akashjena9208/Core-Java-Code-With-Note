package com;
class studente
{
	String name;
	int age;
	
	public studente(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return name+" "+age;
		
	}
	
//	@Override
//	public void finalize()
//	{
//		System.out.println("Clean up Work Garabage collector before allowacting memory from heap");
//	}
	
	
	@Override
    public void finalize()
    {
        System.out.println("clean up work  by GC before de allocating memoery from heap");

    }
	
	
}
public class GarbageCollectionConcept {
	public static void main(String[] args) {
		System.out.println("Strat");
		studente e= new studente("Akash", 10);
		System.out.println(e);
		e=null;		// e=null;// elgibule for garbage collector
		System.gc();// invoking the garbage collector,
		// /*
        //  * -ineternally garbage collector call finalize methode
        //  * -finalize methode avilable object class
        //  * - help to cleanup
        //  */
		System.out.println("End");
	}
}
