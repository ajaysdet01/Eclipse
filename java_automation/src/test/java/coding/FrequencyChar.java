package coding;

import java.util.*;

public class FrequencyChar {

    public static void main(String[] args) {

        String name = "madam";
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char ch : name.toCharArray()) {
            if (freqMap.containsKey(ch)) {
                int count = freqMap.get(ch);
                freqMap.put(ch, count + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
