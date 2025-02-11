import java.util.Scanner;

public class InsertElement {


        public static void main(String[] args) {

            Scanner obj=new Scanner(System.in);

            System.out.println(("enter the size of the array"));
            int n=obj.nextInt();
            int[] arr =new  int[n+1];

            System.out.println("enter "+n+"elements");

            for(int i=0;i<n;i++)
            {
                arr[i]=obj.nextInt();
            }

            System.out.println("enter the number to insert");


            int num=obj.nextInt();

            System.out.println("enter the position ");

            int pos=obj.nextInt();


            if(pos>n+1||pos<=0)
            {
                System.out.println("invalid  position");
            }
            else
            {
                for(int i=n;i>=pos;i--)
                {
                    arr[i]=arr[i-1];
                }
                arr[pos-1]=num;
                n++;

                System.out.println("array element after insertion:");
                for(int i=0;i<n;i++)
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }


