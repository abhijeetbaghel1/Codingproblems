import java.util.*;
public class CopyArray {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);

        System.out.println(("enter the size of the array"));
        int n=obj.nextInt();
        int[] arr =new  int[n];
        int []dest=new int[n];

        System.out.println("enter "+n+"elements");

        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }



        for(int i=0;i<n;i++)
        {
            dest[i]=arr[i];
        }


        System.out.println("Element of dest array are");
        for(int i=0;i<n;i++)
        {
            System.out.println(dest[i]);
        }


    }
}
