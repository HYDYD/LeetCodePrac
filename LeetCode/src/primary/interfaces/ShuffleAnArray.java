package primary.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HYDYD.
 * 2019/6/18 17:53
 */
public class ShuffleAnArray {
    int[] origin, res;

    public ShuffleAnArray(int[] nums) {
        origin = nums;
        res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        for (int i = 0; i < origin.length; i++) {
            res[i] = origin[i];
        }
        return res;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        List<Integer> list = new ArrayList<>();
        for (int i :
                res) {
            list.add(i);
        }
        for (int i = 0; i < res.length; i++) {
            int index = (int) Math.random() * list.size();
            res[i] = list.remove(index);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        ShuffleAnArray s = new ShuffleAnArray(nums);
        System.out.println(s.reset());
        System.out.println(s.shuffle());
    }
}
