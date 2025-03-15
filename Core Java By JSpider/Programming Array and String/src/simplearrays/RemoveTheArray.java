//package simplearrays;
//
//import java.util.Scanner;
//
//public class RemoveTheArray {
//	 public static void main(String[] args) {
//		// to read size of an array
//		 int [] ar=ArrayOperation.readarray();
//		 Scanner sc= new Scanner(System.in);
//		 System.out.println("Enter The Index");
//		 int index=sc.nextInt();
//		 
//		 isRemove(ar,index);
//		 sc.close();
//	}
//	 
//	 public static void isRemove(int ar[],int index)
//	 {
//		 int br[]=new int[ar.length -1];
//		 if(index< 0 ||index>br.length )
//		 {
//			 System.out.println("Inavlaid Index");
//		 }
//		 else 
//		 {
//			 for(int i=0;i<br.length;i++)
//			 {
//				 if(i<index)
//				 {
//					 br[i]=ar[i];
//				 }
//				 else
//				 {
//					 br[i]=ar[i+1];
//				 }
//			 }
//		 }
//		 
//		 ArrayOperation.dispaly(br);
//	 }
//
//}
