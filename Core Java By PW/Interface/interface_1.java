package Interface;
//class A
interface A
{
    //variable 
     public static final int num=19;//by defult public static final So value pass 
    //  public abstract void Show()
    //  {
    //     can not define
    //  }
     //by defultpublic abstract  so can not define 
    public abstract void Show(); 
    

}

public class interface_1 
{
    public static void main(String[] args) 
    {
        // static key word uswd object not create
        // System.out.println(A); not exicuted bcz call interface  
        System.out.println(A.num);

    }
}

