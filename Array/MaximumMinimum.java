import java.util.*;
public class MaximumMinimum {
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


          int max=arr[0];
        int min=arr[0];


        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
               max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }

        }

        System.out.println("max element is "+max);

        System.out.println("min element is "+min);
    }
}
