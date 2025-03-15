package Inheritance;

//speclizedr : Such methode have not a parrent class only have a child classs

class Aeroplane{

    public void takeoff()
    {
        System.out.println("Aeroplane is takr off");
    }

    public void fly() // it is a overriden
    {
        System.out.println("Aeroplane is fly");
    }
}

class cargoplane extends Aeroplane
{
    public void fly() 
    {
        System.out.println("cargo at lower");
        System.out.println("cargoplane is a override acooding to require that is change ");
    }
    void takeon()
   {
    System.out.println("Aeroplane after take on all are sleep"); // only have child class exist that not have a patret class
   }
}

class passangerplan extends Aeroplane
{
    public void fly() 
    {
        System.out.println("Aeroplane is fly at medium hight");
    }
    void food()
   {
    System.out.println("passanger wekup then he was eat");
   }
}



public class inheritance_10
{
    public static void main(String[] args) 
    {
       

        cargoplane cp =new cargoplane();
        cp.takeoff();
        cp.fly();
        cp.takeon(); // only have child class

        passangerplan pp =new passangerplan();
        pp.takeoff();
        pp.fly();
        pp.food();
    }
}

