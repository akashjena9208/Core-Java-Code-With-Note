package Io;
import java.io.*;

public class io_4 
{
    public static void main(String[] args) throws IOException
    {
        // ......................Writting operation................................................
        // file write time file Write & File closed
       
        File dir=new File("io");
       

        File file=new File(dir, "pw.txt");
        file.createNewFile();

       FileWriter fw=new FileWriter(file, true);    // bydefult nature overriding  not chage 

    //    fw.write("java");
    // bydefult nature overriding 
       fw.write("java");
       fw.write("\n"); //enter  means one by one , next liine 
       fw.write(65);  // Asic value store
       fw.write("\n");
       fw.write(97);
       fw.write("\n");
       char ch[]={'j', 'a', 'v', 'a'};
       fw.write(ch);
       fw.write("\n");

      //resosed closed/flush then data store

       fw.flush();   // in a futer data add a this file
       //fw.close();   // resosed closed then data store, data not add in futer

       System.out.println("open pw.txt to see result");

        
        
    }
    
}

