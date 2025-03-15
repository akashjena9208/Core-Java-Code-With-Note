package Inheritance;

//Overriding :- Parent to child inherinted and your need you change or modfiy  or override that is called overriden methode

/*
 * Override Methode In Child class:-
 * visibulit not decreesd  means parant public means child public
 * Same reternt type means parent void child void
 * Parametre same Parent and child
 */

 //parent
class Aeroplane9400{

    public void takeoff()
    {
        System.out.println("Aeroplane is takr off");
    }

    public void fly() // it is a overriden
    {
        System.out.println("Aeroplane is fly");
    }
}

//child
class cargoplane extends Aeroplane9400
{
    public void fly() // parant to child inheritand and your need you change 
    {
        System.out.println("cargo at lower");
        System.out.println("cargoplane is a override acooding to require that is change ");
    }
}
//child
class passangerplan extends Aeroplane9400
{
    public void fly() 
    {
        System.out.println("Aeroplane is fly at medium hight");
    }
}



public class inheritance_9
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

