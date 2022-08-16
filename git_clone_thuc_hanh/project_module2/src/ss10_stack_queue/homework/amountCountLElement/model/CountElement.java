package ss10_stack_queue.homework.amountCountLElement.model;

import java.util.Map;
import java.util.TreeMap;

public class CountElement {
    public static void countDisplay() {
        String str = "gion la la gion la khong gion";
        String strLow = str.toLowerCase();
        String[] strings = strLow.split(" ");
        Map<String, Integer> treeMap = new TreeMap<>();
        for (String key : strings) {
            if (treeMap.containsKey(key)) {
                Integer value = treeMap.get(key);
                value++;
                treeMap.replace(key, value);
            } else {
                treeMap.put(key, 1);
            }
        }
        System.out.println(treeMap);
    }
}
