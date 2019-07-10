package primary.competition;

import java.util.Scanner;

/**
 * Created by HYDYD.
 * 2019/6/30 19:21
 */
public class ValueOfK {
//    public static int value(int num, LinkedList<Integer> nums, int k){
//            if (k > num || num - 1 - k < 0) return -1;
//        return nums.get(num - 1 - k);
//    }
//
//    public static void main(string[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        LinkedList<Integer> nums = new LinkedList<>();
//        for (int i = 0; i < num; i++) {
//            nums.add(scanner.nextInt());
//        }
//        int k = scanner.nextInt();
//        System.out.println(value(num, nums, k));
//    }

    public static int minCandy(int n, int[] scores){
        int res = 1;
        int round = 1;
        int count = 0;
        int person = 0;
        int min = scores[0];
        while (person <= n) {
            for (int i = 1; i < n; i++) {
                if (scores[i] < min){
                    min = scores[i];
                    scores[i] = 101;
                    res = 1;
                }
                if (min == scores[i]) res++;
            }
            count += res*round;
            person += res;
            res = 1;
            min = scores[0];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        System.out.println(minCandy(n, scores));
    }
}
