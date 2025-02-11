import java.util.*;
public class TakingInput {
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


        System.out.println("array elements are :");

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
