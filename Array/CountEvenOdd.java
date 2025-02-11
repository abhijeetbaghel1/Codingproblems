import java.util.Scanner;

public class CountEvenOdd {


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

            int even=0;
            int odd=0;
            System.out.println(" even array elements are :");

            for(int i=0;i<n;i++)
            {

                if(arr[i]%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
            System.out.println("number of even elements "+even);

            System.out.println("number of odd elements "+odd);
        }

    }


