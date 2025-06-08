import java.util.*;

public class prefixarray {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,5};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i =1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
// Print entire prefix array
        System.out.print("Prefix Sum Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }

    }
}
