import java.util.Scanner;

public class OddEven {
    
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

      
            System.out.println(" odd elements of the array elements are :");

            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==1)
                System.out.println(arr[i]);
            }

            System.out.println(" even elements of the array elements are :");

            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                    System.out.println(arr[i]);
            }
        }
    }


