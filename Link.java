public class Link<E> {
    protected Link next;
    private Link prev;
    private E data;

    public Link(E data) {
        this.data = data;
    }


    public StringBuilder display(){
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.data);
        sb.append("]");
        return sb;
    }

    public E getData() {
        return data;
    }
}
