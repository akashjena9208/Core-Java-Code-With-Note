package Polymorphism;
//parent calss
class Aeroplane22
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
class Cargoplane3 extends Aeroplane22
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

class Passangerplane3 extends Aeroplane22
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

class FigterPlane3 extends Aeroplane22
{
    void takeoff()
    {
        System.out.println("FigterPlane  is take off ");
    }

    void fly()
    {
        System.out.println("FigterPlane  is  a fly");
    }
}

class airport
{
    public void poly(Aeroplane22 ref)
    {
        ref.takeoff();
        ref.fly();

        System.out.println("...............................................................");
    }
}

public class polymorphism_2 
{
    public static void main(String[] args) 
    {
        Cargoplane3 cp =new Cargoplane3(); // changed bcz type parent type 

        Passangerplane3 pp =  new Passangerplane3();

        FigterPlane3 fp = new FigterPlane3();
       /*  
        cp.takeoff();
        cp.fly();
        pp.takeoff();
        pp.fly();
        fp.takeoff();
        fp.fly();  
     */

    // Apply polymorephirsm 
    airport air =new airport();
    air.poly(pp);
    air.poly(cp);
    air.poly(fp);
// one is to many
    }
}
