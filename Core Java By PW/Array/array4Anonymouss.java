
/* Anoymous Array:- used only one time
   mulitipule value are adding
 * it is an araary without name that is called so Ex-int []={.......}
 */
class cel
{
    public int adding(int nums[])
    {
        int res=0;
        for(int n:nums)
        {
            res=res+n;
        }
        return res;
    }
}
public class array4Anonymouss
{
    public static void main(String[] args) 
    {
        cel obj = new cel();
        // int nums[]={2,4,6,8};       //with name
        int res=obj.adding(new int []{2,4,6,8});     //without name   // multipule vale are adding 
        System.out.println(res);
    }
}