
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=obj.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter elements of the array");
        for(int i=0;i<n;i++)
        {
             arr[i]=obj.nextInt();
        }


        int largest= Integer.MIN_VALUE;
        int seconlargest=Integer.MIN_VALUE;


        for(int i=0;i<n;i++)
        {

            if(arr[i]>largest)
            {
                seconlargest=largest;
                largest=arr[i];
            }
            if(arr[i]<largest && arr[i]>seconlargest)
            {
                seconlargest=arr[i];
            }

        }

        System.out.println("largest element "+largest);
        System.out.println("second  largest element "+seconlargest);

    }


}
