package Opps;
// METHODEOVER LODING- MULTIPULE METHODE HAVE SAME METHODE NAME or differnt  methode name  BUT DIFFERNT ARGUMENT/type of parameter have different
class cal{
    public int multiplication(int n1,int n2){
        int res=n1*n2;
        return res;
    }
    public int add(int n1,int n2,int n3){
        int rest=n1+n2+n3;
        return rest;
    }
}
public class methodeoverloading {
public static void main(String[] args) {
    cal obj=new cal();
    int res=obj.multiplication(5, 100);
    int rest=obj.add(10, 70, 20);

    System.out.println(res);
    System.out.println(rest);
    
}
    
}
