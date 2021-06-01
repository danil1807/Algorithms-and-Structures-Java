/*
1. -Реализовать рассмотренные структуры данных в консольных программах.
2. -Создать программу, которая переворачивает вводимые строки (читает справа налево).
3. -Создать класс для реализации дека.
 */

public class Main {
    public static void main(String[] args) {
//
        System.out.println("____________________Stack implementation_____________________");
        StackImpl<Integer> stack1 = new StackImpl<>(10);
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.isFull());
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);


        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
//
        System.out.println("__________________Queue implementation____________________");
        QueueImpl<Integer> queue = new QueueImpl<>(10);
        queue.insert(1);
        queue.insert(3);
        queue.insert(4);
        queue.insert(6);

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

       //
        System.out.println("_____________Text reverse________________");

        ReadReverse rr = new ReadReverse();
        rr.reverse(ReadReverse.TEXT_TO_REVERT);

        System.out.println("\n");
        //
        System.out.println("_______________Dequeue implementation: _____________________");
            DequeueImpl <Integer> dequeue = new DequeueImpl<>(10);
            dequeue.insertRight(10);
            dequeue.insertRight(11);
            dequeue.insertRight(12);
            dequeue.insertRight(13);
            dequeue.insertRight(14);
            dequeue.insertRight(10);
            dequeue.insertRight(20);
            dequeue.insertLeft(7);

            System.out.println(dequeue.removeLeft());
            System.out.println(dequeue.removeRight());

            System.out.println(dequeue.peekLeft());
            System.out.println(dequeue.peekRight());

            System.out.println(dequeue.toString());






    }
}
