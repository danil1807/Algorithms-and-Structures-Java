public class QueueImpl<E extends Object> implements Queue{

    private int maxSize;
    private E[] queue;
    private int front;
    private int rear;
    private int items;

    public QueueImpl(int size) {
        this.maxSize = size;
        this.queue = (E[]) new Object[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    @Override
    public boolean isFull() {
        return (this.items == this.maxSize);
    }

    @Override
    public boolean isEmpty() {
        return(this.items == 0);
    }

    @Override
    public int size() {
        return this.items;
    }

    @Override
    public void insert(Object o) {
        if (rear == maxSize - 1){
            rear = -1;
        }
        queue[++rear] =(E) o;
        items++;
    }

    @Override
    public Object remove() {
        E temp = queue[front++];
        if (front == maxSize){
            front = 0;
        }
        items--;
        return temp;
    }

    @Override
    public Object peek() {
        return queue[front];
    }
}
