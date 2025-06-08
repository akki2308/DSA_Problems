import java.util.*;

public class prefix_l_to_r {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        int n = arr.length;

        // Step 1: Create prefix array of size n + 1
        int[] prefix = new int[n + 1];
        prefix[0] = 0;

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range (l and r, 0-based):");
            int l = sc.nextInt();
            int r = sc.nextInt();

            // Validate
            if (l < 0 || r >= n || l > r) {
                System.out.println("Invalid range");
                continue;
            }

            // Directly use prefix[r+1] - prefix[l]
            int sum = prefix[r + 1] - prefix[l];
            System.out.println("Sum = " + sum);
        }

        sc.close();
    }
}

