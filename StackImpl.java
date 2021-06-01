public class StackImpl<E extends Object> implements Stack{

    private int maxSize;
    private E[] stack;
    private int top;

    public StackImpl(int size) {
        this.maxSize = size;
        this.stack = (E[]) new Object[maxSize];
        this.top = -1;
    }

    @Override
    public boolean isFull() {
        return (this.top == maxSize - 1);
    }

    @Override
    public boolean isEmpty() {
        return (this.top == -1);
    }

    @Override
    public void push(Object el) {
        this.stack[++this.top] = (E) el;
    }

    @Override
    public Object pop() {
        return this.stack[this.top--];
    }

    @Override
    public Object peek() {
        return this.stack[this.top];
    }
}
