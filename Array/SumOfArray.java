import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);

        System.out.println(("enter the size of the array"));
        int n=obj.nextInt();
        int[] arr =new  int[n];

        System.out.println("enter "+n+"elements");

        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }

  int sum=0;
        System.out.println(" sum of the array elements are :");

        for(int i=0;i<n;i++)
        {
         sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
