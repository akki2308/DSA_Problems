import java.util.*;

public class remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        int i = 0;
        int j = 1;
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        for(int k = 0; k <= i; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
