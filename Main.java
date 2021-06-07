/*
    3. Реализовать цикл forEach для простого связанного списка
    4*. Реализовать Deque на основе двунаправленного списка
 */

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> nums = new LinkedList<>();
        nums.insert(1);
        nums.insert(2);
        nums.insert(3);
        nums.insert(4);

        ListIterator <Integer> iterator = (ListIterator<Integer>) nums.iterator();
        iterator.reset();
        iterator.insertAfter(15);
        iterator.next();
        iterator.insertBefore(11);







        displayAll(nums);
        System.out.println(nums.display());
    }
    private static void displayAll(LinkedList<Integer> list){
        for(Integer value : list){
            System.out.println(value);
        }
    }
}
