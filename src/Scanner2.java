import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n");
        n = scan.nextInt();

        int count, i;

        // count holds the factors count.
        count = 0;

        // for each number from 1 to n.
        i = 1;
        while (i <= n) {

            // if i is a factor of n i.e. reminder 0.
            if (n % i == 0) {
                // factor count incremented.
                count++;
            }

            // increment i, to take the next number.
            i++;
        }
    }
}

        // If only two factors found, it is prime else not.
