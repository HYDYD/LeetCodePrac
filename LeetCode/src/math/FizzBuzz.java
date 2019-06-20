package math;

/**
 * Created by HYDYD.
 * 2019/6/20 19:01
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * <p>
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * <p>
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * <p>
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        if (n < 1) return null;
        List<String> list = new ArrayList<>();
        if (n == 1) {
            list.add("1");
            return list;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                list.add("Fizz");
                continue;
            }
            if (i % 3 != 0 && i % 5 == 0) {
                list.add("Buzz");
                continue;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FIzzBuzz");
                continue;
            }
            list.add(String.valueOf(i));
        }
        return list;
    }
}
