// 1) Реализовать множество (set) с помощью TreeMap. 
// 2) Создать метод add, добавляющий элемент в ваше множество. 
// 3) Объявить и инициализировать компаратор с обратной (от большего к меньшему) логикой сортировки чисел. 
// 4) Объявить и инициализировать TreeSet использующий ваш компаратор. 
// 5) Добавить несколько элементов в сет и вывести в консоль.

package date221121.HW6;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Hw6_main {
    //1) и 2)
    public static void main(String[] args) {
        Hw6_someset someSet = new Hw6_someset();
        boolean moreItems = false;
        
        Scanner scanMore = new Scanner(System.in);
        System.out.println("Добавить элемент в someSet? Y/N:");
        if (scanMore.nextLine().toLowerCase().equals("y")) moreItems = true;
        //nSystem.out.println(moreItems);
        while (moreItems) {
            Scanner scanItem = new Scanner(System.in);
            System.out.print("Введите Id: ");
            Integer itemId = Integer.parseInt(scanItem.nextLine());
            System.out.print("Введите Str: ");
            String itemStr = scanItem.nextLine();
            someSet.addItem(itemId, itemStr); 
            System.out.println("Добавить элемент в someSet? Y/N:");
            if (scanMore.nextLine().toLowerCase().equals("y")) moreItems = true;  
            else moreItems = false;         
        }
        someSet.printSet();
        scanMore.close();

        //3), 4) и
        Comparator<Integer> compaInt = new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        };

        Set<Integer> trSet = new TreeSet<>(compaInt);
        trSet.add(5);
        trSet.add(8);
        trSet.add(15);
        trSet.add(3);
        trSet.add(7);
        System.out.println(trSet);
    }
}
