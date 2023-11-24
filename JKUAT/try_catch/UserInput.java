import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class UserInput {
    public static void main(String[] args) {
        int i = 8, j = 1, k = 0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("Enter a number: ");
            j = Integer.parseInt(input.readLine());
            k = i / j;
            System.out.println("Output: " + k);
            System.out.println("Bye.");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("IO Error.");
        }

        catch (ArithmeticException e)
        {
            System.out.println("Error: Can't divide by " + k + ".");
        }
        finally
        {
            input.close();
            System.out.println("Finally bye");
        }
    }
}
