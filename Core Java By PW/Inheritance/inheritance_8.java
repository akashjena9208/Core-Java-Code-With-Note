package Inheritance;


// inherit:- parrent class to child class  inherit & child class are does not modfy that so

//parant clasas
class Aeroplane420{

    public void takeoff()
    {
        System.out.println("Aeroplane is takr off");
    }

    public void fly()
    {
        System.out.println("Aeroplane is fly");
    }
}
//child class
class cargoplane extends Aeroplane420   //child classs can not  be  change
{

}

class passangerplan extends Aeroplane420
{
    
}



public class inheritance_8 
{
    public static void main(String[] args) 
    {
        cargoplane cp =new cargoplane();
        cp.takeoff();
        cp.fly();

        passangerplan pp =new passangerplan();
        pp.takeoff();
        pp.fly();
    }
}
