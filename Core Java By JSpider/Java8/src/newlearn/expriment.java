package newlearn;

//only one abstract method any number of static and default method is knows as FunctionalInterface method
@FunctionalInterface
public interface expriment {

	void add();
	
	default void mul()
	{
		
	}
}

@FunctionalInterface
  interface expariment2
 {
	abstract public void isokay();
 }


//@FunctionalInterface it is not a functional intreface
interface expariment3
{
	 void isokay();
	 void isok();
}

 

