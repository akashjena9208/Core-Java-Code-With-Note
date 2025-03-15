package Polymorphism;
//parent calss
class Aeroplane2
{
    void takeoff()
    {
        System.out.println("Aeroplane is take off ");
    }

    void fly()
    {
        System.out.println("Aeroplane is  a fly");
    }
}
//child class
class Cargoplane2 extends Aeroplane2
{
    void takeoff()
    {
        System.out.println("Cargoplane  is take off ");
    }

    void fly()
    {
        System.out.println("Cargoplane  is  a fly");
    } 
}
//child class
class Passangerplane2 extends Aeroplane2
{
    void takeoff()
    {
        System.out.println("Passangerplane  is take off ");
    }

    void fly()
    {
        System.out.println("Passangerplane  is  a fly");
    }
}

public class polymorphism_1 
{
    public static void main(String[] args) 
    {
        // object creat time object mange a refrence craet that time refrence varibale type same as a object but only one case that is change 
        //that type parrent class type
        // same refrence or parant type 
        Cargoplane2 cp =new Cargoplane2(); 
        // cp.takeoff();
        // cp.fly();

        Passangerplane2 pp = new Passangerplane2();
        // pp.takeoff();
        // pp.fly();

    
        Aeroplane2 ref;
    
        ref=cp; // capacity that hold the cargoplne object
        ref.takeoff();
        ref.fly();
        System.out.println("....................................................................................");


        ref=pp;
        ref.takeoff();
        ref.fly();
    }
}
