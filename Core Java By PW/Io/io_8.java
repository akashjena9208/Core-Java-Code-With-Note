package Io;

import java.io.*;
public class io_8
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("io");
        File file=new File(dir, "pw.txt");

        
        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("Java");
        pw.print(100);
        pw.println('a');
        pw.println(50.5);
        pw.println(true);

        pw.close();
    
    }
    
}
