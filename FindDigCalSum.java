import java.util.*;
public class FindDigCalSum
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    int size=s.nextInt();
    int ar[]=new int[size];
    for(int i=0;i<ar.length;i++)
    {
      ar[i]=s.nextInt();
    }
    for(int i=0;i<ar.lngth;i++)
    {
      System.out.println(ar[i]+"");
}
 int last=ar[ar.length-1];
 int temp=last;
 int sum=0;
 while(last!=0)
 {
   int rem=last%10;
   sum=sum+rem;
   last=last/10;
  }
System.out.println("Last digit is:  "+temp+"and sum is :  "+sum);
}
}
