


class printNUmbersWithRecursion {

    void PrintNumber(int n) {
        if (n == 0)
            return;

        System.out.println("before recursion " + n);
        PrintNumber(n - 1);
        System.out.println("After recursion " + n);
    }


    public static void main(String[] args) {
        int n = 5;
        printNUmbersWithRecursion obj = new printNUmbersWithRecursion();

        obj.PrintNumber(n);


    }

}

