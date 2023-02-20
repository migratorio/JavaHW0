/**
* Пусть дан произвольный список целых чисел, удалить из него четные числа.
*/

import java.util.ArrayList;
import java.util.Random;
 
public class Task02 {
    public static void main(String[] args) {
        var n = 20;
        Random rnd = new Random();
        ArrayList<Integer> myList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            myList.add(rnd.nextInt(100));
        }
        System.out.println("Исходный массив: ");
        System.out.println(myList);
        myList.removeIf(x -> (x % 2 == 0));
        System.out.println("Отфильтрованный массив: ");
        System.out.println(myList);
 
    }
}