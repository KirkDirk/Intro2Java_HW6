// Реализовать множество (set) с помощью TreeMap. 
// Создать метод add, добавляющий элемент в ваше множество. 
// Объявить и инициализировать компаратор с обратной (от большего к меньшему) логикой сортировки чисел. 
// Объявить и инициализировать TreeSet использующий ваш компаратор. 
// Добавить несколько элементов в сет и вывести в консоль.

package date221121.HW6;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Hw6_main {
    public static void main(String[] args) {
        Hw6_someset someSet = new Hw6_someset();
        boolean moreItems = false;
        
        Scanner scanMore = new Scanner(System.in);
        System.out.println("Добавить элемент в someSet? Y/N:");
        if (scanMore.nextLine().toLowerCase().equals("y")) moreItems = true;
        System.out.println(moreItems);
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
    }
}
