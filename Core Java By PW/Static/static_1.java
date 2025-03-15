// package Static;


public class static_1
{
    static int age;         // satic varibale ................auto exicuted
        

    static{                 //static block...................auto exicuted ...........................1
        age=22;
        System.out.println("Satatic block -first");
        System.out.println(age);

    }
    static void disp()   //static methode.... diretly not exicuted you call the methode.......................3
    {
        System.out.println("Static methode main methode ke baad job hum call korenge");
    }
    public static void main(String[] args) 
    {
         //...........................................2

        System.out.println("main methode bad mai");
        disp(); // main methode not exicuted bcz of static keyword ............................calling
        
    }
    
}


//  Sataic key word object you creat or not creat  but it is a run code bcz used of"static" keyword