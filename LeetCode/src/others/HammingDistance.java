package others;

/**
 * Created by HYDYD.
 * 2019/7/2 11:37
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        //输出整数二进制下差别1的个数
        return Integer.bitCount(x^y);
    }
}
