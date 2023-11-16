import java.util.Scanner;

public class Test2 {
    public static void main(String[] args)
    {
        int N, i, result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positve integer: ");
        N = input.nextInt();
        input.close();

        if (N < 0)
            System.out.println("Error: " + N + " is not a positive integer!");
        for (i = N; i > 0; i--)
        {
            if (N % 2 == 0)
                result = N / 2;
            else
                result = (N * 3) + 1;
        }
        System.out.println("Result: " + result);
    }
}
