package Io;

import java.io.*;
public class io_3 
{
    public static void main(String[] args)  throws IOException
    {
        File dir=new File("PWJAVA");
       System.out.println(dir.isDirectory());
        dir.mkdir(); // director creat

        System.out.println("dir is refering to directory PWJAVA :" + dir.isDirectory());

        File file=new File(dir, "pwskill.txt");   // dresctor inside file creat
        file.createNewFile();
        System.out.println("file is refering to pwskill.txt : " + file.isFile());



        //cheack how many

            int count =0;

            // //String s="Io";
            File f=new File("io");

            String str[]=f.list();

            for(String name: str)
            {
                count++;
                System.out.println(name);
            }
            System.out.println("No of files are "+ count);

            }

        }