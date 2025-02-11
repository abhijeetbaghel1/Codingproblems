public class SumOFNAturalNUm {

    int sum(int n)
    {
        if (n==0)
            return 0;
        return n+sum(n-1);
    }

    public static void main(String[] args) {

        SumOFNAturalNUm obj=new SumOFNAturalNUm();
        int n=5;
        System.out.println("sum of first"+n+"natural number is "+obj.sum(n));
    }
}
