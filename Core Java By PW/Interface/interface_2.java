package Interface;

// interface implimenten multipule interface.
//interface can also extend another interface.
//

interface one
{
    // we can not define a class bcz of interface methode are automatticaly public & abstract
    void doo();
}

interface two 
{
    void abc();
}
// interface two extends one  //interface can also extend another interface
// {
//     void show();
// }

 class three implements one,two
// in this case methode are define inside the class not creat inside the inerface/absrstrct  so 
// in interface used multipule interface 
{
    public void doo()
    {
        System.out.println("inerface one  methode");
    }
     public void abc()
     {
        System.out.println("interface two mwthode");
     }

    
}


public class interface_2 
{
    public static void main(String[] args) 
    {
        three obj =new three();
         obj.doo();
         obj.abc();
    }


}
