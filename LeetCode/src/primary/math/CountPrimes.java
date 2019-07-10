package primary.math;

/**
 * Created by HYDYD.
 * 2019/6/21 12:41
 */

/**
 * 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class CountPrimes {
    /**
     * 采用厄拉多筛选法
     * 具体操作：先将 2~n 的各个数放入表中，然后在2的上面画一个圆圈，然后划去2的其他倍数；
     * 第一个既未画圈又没有被划去的数是3，将它画圈，再划去3的其他倍数；
     * 现在既未画圈又没有被划去的第一个数 是5，将它画圈，并划去5的其他倍数……依次类推，一直到所有小于或等于 n 的各数都画了圈或划去为止。
     * 这时，表中画了圈的以及未划去的那些数正好就是小于 n 的素数。
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        boolean []flagArray = new boolean[n];
        for (int i=2; i<n; i++){
            flagArray[i] = true;
        }

        for (int i=2; i<n; i++){
            if (flagArray[i]){
                for (int k=2; k*i<n; k++){
                    flagArray[k*i] = false;
                }
            }
        }

        int result = 0;
        for (int i=2; i<n; i++){
            if (flagArray[i]){
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(n));
    }

}
