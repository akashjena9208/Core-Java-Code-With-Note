package Io;

import java.io.*;

public class  io_2

{
    public static void main(String[] args) throws IOException
    {
        
        File file1=new File("pw.txt");
                            //-argumrnt pass
                            //-File & Director pass

        System.out.println(file1.exists());//false
        //no-file so false


        //physicall file creat 
        file1.createNewFile();
        System.out.println(file1.exists()); // true

        //..........Directory...............

        // File dir=new File("PW");
        // System.out.println(dir.exists()); //false

        // dir.mkdir();   //Director Create

        // System.out.println(dir.exists()); //true
        
    }
    
}

