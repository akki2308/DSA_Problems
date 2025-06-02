import java.util.*;

public class pair_with_target_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int target = 6;
        int left = 0, right = arr.length-1;

        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(left + " " + right);
                break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
