package array;

public class A1 {
 public static void main(String[]arge) {
	 int[] a=new int[5];
	 System.out.println(a.length);//5
	 
	 a[0]=15;
	 a[1]=30;
	 a[2]=40;
	 a[3]=50;
	 a[4]=60;
	 
	 System.out.println(a[2]);
	 System.out.println(a[4]);
	 System.out.println(a[0]);
	 System.out.println(a[5]);//AIOOBE
	 System.out.print("Java Program");
	 System.out.print("Java Program");
 }
}

