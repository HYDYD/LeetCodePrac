package others;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HYDYD.
 * 2019/7/2 18:54
 */
public class ReverseBits {
    public int reverseBits1(int n) {
        int result = 0;
        for (int i = 0; i <= 32; i++) {
            // 1. 将给定的二进制数,由低到高位逐个取出
            // 1.1 右移 i 位,
            int tmp = n >> i;
            // 1.2  取有效位
            tmp = tmp & 1;
            // 2. 然后通过位运算将其放置到反转后的位置.
            tmp = tmp << (31 - i);
            // 3. 将上述结果再次通过运算结合到一起
            result |= tmp;
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1000", "test01");
    }
}
