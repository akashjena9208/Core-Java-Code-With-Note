package Interface;
/*
 * Anonimoues:- Anonemoues object used or creat one time
 */
interface car
{
    void dri();
}

// class BMW  implements car
// {
//     public void dri() 
//     {
//         System.out.println("Driving................");
//     }
// }
public class interface_6 
{
    public static void main(String[] args)  // it is a anonimoues inner class
    {
        // this is not creat a ineterface object it is creat a car object
        car c= new car() 
        {
            public void dri() 
                {
                    System.out.println("Driving................");
                } 
        };
        c.dri();
    }
}
