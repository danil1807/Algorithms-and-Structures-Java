import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.TimeUnit;

//1. Создать массив большого размера (миллион элементов).
//2. Написать методы удаления, добавления, поиска элемента массива.
//3. Заполнить массив случайными числами.
//4. Написать методы, реализующие рассмотренные виды сортировок, и проверить скорость выполнения каждой.
public class Main {
    public static void main(String[] args) {
        ArrUtilits <Integer> test1 = new ArrUtilits(5);
        ArrUtilits <Integer> test2 = new ArrUtilits(5);
        ArrUtilits <Integer> test3 = new ArrUtilits(5);

//        test.addSortedEl(1);
//        test.addSortedEl(200);
//        test.addSortedEl(10);
//        test.addSortedEl(443);
//        test.addSortedEl(6);
//
//
//        test.displayArr();
//
//        test.sortSelect();

        test1.fillingArrWithRandNumbers(10000);
        long start = System.nanoTime();
        test1.sortBubble();
        long finish = System.nanoTime();
        long result = finish - start;
        System.out.println("bubble: " + result);

        test2.fillingArrWithRandNumbers(10000);
        long start2 = System.nanoTime();
        test2.sortSelect();
        long finish2 = System.nanoTime();
        long result2 = finish2 - start2;
        System.out.println("select: " + result2);

        test3.fillingArrWithRandNumbers(10000);
        long start3 = System.nanoTime();
        test3.sortInsert();
        long finish3 = System.nanoTime();
        long result3 = finish3 - start3;
        System.out.println("insert: " + result3);




    }

}
