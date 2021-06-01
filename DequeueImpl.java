import java.util.Arrays;
import java.util.zip.DeflaterOutputStream;

public class DequeueImpl<E extends Object>{

    private int maxSize;
    private E[] dequeue;
    private int left;
    private int right;
    private int items;

    public DequeueImpl(int size) {
        this.maxSize = size;
        this.dequeue = (E[]) new Object[this.maxSize];
        this.left = this.maxSize / 2 - 1;
        this.right = this.maxSize / 2 - 1;
        this.items = 0;
    }
    public boolean isFull() {
        return (this.items == this.maxSize);
    }

    public boolean isEmpty() {
        return(this.items == 0);
    }

    public int size() {
        return this.items;
    }

    public void insertRight(Object o) {
        if (this.right == this.left){
            this.left = this.left - 1;
        }
        if(this.right == this.maxSize) {
            E[] copyDeq = (E[]) new Object[this.maxSize + 10];
            System.arraycopy(this.dequeue, 0, copyDeq, 0, maxSize);
            this.maxSize = this.maxSize + 10;
            this.dequeue = copyDeq;
        }
            this.dequeue[this.right++] = (E) o;
            items++;
    }

    public void insertLeft(Object o) {
        if (this.right == this.left){
            this.right = this.right + 1;
        }
        if(this.left == -1){
            E[] copyDeq = (E[]) new Object[this.maxSize + 10];
            System.arraycopy(this.dequeue, 0, copyDeq, 10, maxSize);
            this.left = maxSize - 1;
            this.right = this.right + 11;
            this.maxSize = this.maxSize + 10;
            this.dequeue = copyDeq;
        }
        this.dequeue[this.left--] = (E) o;
        items++;
    }

    public Object removeRight() {
        if(isEmpty()){
            return null;
        }
        E temp = this.dequeue[--this.right];
        this.dequeue[this.right] = null;
        items--;
        return temp;
    }

    public Object removeLeft() {
        if(isEmpty()){
            return null;
        }
        E temp = this.dequeue[++this.left];
        this.dequeue[this.left] = null;
        items--;
        return temp;
    }

    public Object peekRight() {
        return dequeue[this.right - 1];
    }

    public Object peekLeft() {
        return dequeue[this.left + 1];
    }

    @Override
    public String toString() {
        return "DequeueImpl{" +
                "dequeue=" + Arrays.toString(dequeue) +
                ", right=" + right +
                ", left=" + left +
                ", items=" + items +
                ", size=" + maxSize +
                '}';
    }
}
