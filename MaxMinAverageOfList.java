/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import  java.util.Collections;
 
public class MaxMinAverageOfList {


    private static double getAverage(List<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
                
        return stats.getAverage();
    }
 
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        System.out.println("Среднее арифметическое: " + getAverage(list));
        System.out.println("Максимальное значение:  " + Collections.max(list));
        System.out.println("Минимальное значение:   " + Collections.min(list));
    }


    
}