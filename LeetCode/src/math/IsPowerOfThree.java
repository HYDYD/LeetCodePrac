package math;

/**
 * Created by HYDYD.
 * 2019/6/22 19:11
 */

/**
 *给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 */
public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int n = 15;
        IsPowerOfThree isPowerOfThree = new IsPowerOfThree();
        System.out.println(isPowerOfThree.isPowerOfThree(n));
    }
}
