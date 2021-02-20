package demo;


import java.util.HashMap;
import java.util.Map;

public class HashMapTraverse {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 10, 20, 30, 25, 30, 35, 20, 10};
    HashMapTraverse.numberFreq(numbers);
    }

    public static void numberFreq(int[] num) {
        HashMap<Integer, Integer> sstring = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            Integer freg = sstring.get(num[i]);
            if (sstring.get(num[i]) == null) {
                sstring.put(num[i], 1);
            } else {
                sstring.put(num[i], ++freg);



                for (Map.Entry freqs : sstring.entrySet()) {
                    System.out.println("Frequency of " + freqs.getKey() + " : " + freqs.getValue());
                }

            }

        }


    }
}
