package date221121.HW6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Hw6_someset {
    TreeMap<Integer, String> someTreeMap = new TreeMap<>();
    
    public void addItem(Integer addId, String addStr) {
        if (someTreeMap.containsKey(addId)) { //проверяем совпадение ID
            System.out.println("Такой id уже существует. Заменить значение? Y/N:");
            Scanner scanYN = new Scanner(System.in);
            String rewriteStr = scanYN.nextLine().toLowerCase();
            if (rewriteStr == "y") someTreeMap.replace(addId, addStr);
            else System.out.println("Значение не было добалено");
            scanYN.close();
        }
        else someTreeMap.put(addId, addStr);
    }

    public void printSet() {
        Iterator<Map.Entry<Integer, String>> setIt = someTreeMap.entrySet().iterator();
        while (setIt.hasNext()) {
            Map.Entry<Integer, String> item = setIt.next();
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}

