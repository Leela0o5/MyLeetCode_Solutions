import java.util.Comparator;
import java.util.PriorityQueue;

public class Q215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> arr = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            arr.add(num);
        }
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = arr.remove();
        }
        return ans;
    }
}