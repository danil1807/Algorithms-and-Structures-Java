public interface Queue {
    public boolean isFull();
    public boolean isEmpty();
    public int size();
    public void insert(Object o);
    public Object remove();
    public Object peek();
}
