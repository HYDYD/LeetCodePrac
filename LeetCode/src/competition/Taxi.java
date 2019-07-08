package competition;

/**
 * Created by HYDYD.
 * 2019/6/23 11:28
 */
public class Taxi {
    public boolean carPooling(int[][] trips, int capacity) {
        if (trips.length < 2) if (trips[0][0] > capacity) return false;
        int last = trips.length - 1;
        int res = 0;
        while (res < last){
            if (trips[res+1][1] < trips[res][1]) return false;
            if (trips[res][0] > capacity) return false;
            if (trips[res+1][1] < trips[res][2]) if (trips[res][0] + trips[res+1][0] > capacity) return false;
            if (trips[res+1][0] > capacity) return false;
            res++;
        }
        return true;
    }

    public static void main(String[] args) {
        int c = 16;
        int[][] trips = {{7,5,6},{6,7,8},{10,1,6}};
        Taxi t = new Taxi();
        System.out.println(t.carPooling(trips, c));
    }
}
