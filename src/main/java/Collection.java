import java.util.Collections;
import java.util.PriorityQueue;

public class Collection {
    public static int deque(int Arr[], int intNumber, int subArraySize) {
        int output = 0;

        int i = 0;
        while (i < intNumber - subArraySize) {
            int initInput = 0;
            PriorityQueue<Integer> map = new PriorityQueue<Integer>();
            int j = i;
            while (j < i + subArraySize) {
                if (!map.contains (Arr[j])) {
                    map.addAll(Collections.singleton(Arr[i]));
                    initInput++;
                }
                j++;
            }
            if (initInput > output) {
                output = initInput;
            }
            i++;
        }
        return output;
    }
}
