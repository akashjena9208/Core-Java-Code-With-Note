// package Array;

class calc1{
    public int add(int num[])
    {
        int res=0;
        for(int n:num)
        {
            res=res+n;
        }
        return res;
    }
}
public class anonymousarray {
    public static void main(String[] args) {
        calc1 obj=new calc1();
        //  int num[]={2,4,6,8,10};
         int res=obj.add( new int[]{2,4,6,8,10});
         
         System.out.println(res);
        

        
    }
    
}
