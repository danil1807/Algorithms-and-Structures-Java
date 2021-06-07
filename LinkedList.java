import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList<E> implements Iterable<E> {
    private Link first;
    private Link last;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(E data) {
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public Link delete(){
        if(isEmpty()){
            return null;
        }
        Link temp = first;
        first = first.next;
        return temp;
    }

    public StringBuilder display(){
        Link current = first;
        StringBuilder sb = new StringBuilder("[");
        while (current != null){
            sb.append(current.display() + " -> ");
            current = current.next;
        }
        sb.setLength(sb.length() - 4);//удаление последней стрелки.
        sb.append("]");
        return sb;
    }


    private class LinkedListIterator implements ListIterator<E>{

        private final LinkedList<E> list;
        private Link<E> current;
        private Link<E> previous;


        public LinkedListIterator(LinkedList<E> list) {
            this.list = LinkedList.this;
            reset();
        }

        @Override
        public void remove() {
            if(previous == null){
                list.first = current.next;
                reset();
            } else{
                previous.next = current.next;
                if(!hasNext()){
                    reset();
                } else{
                    current = current.next;
                }
            }
        }

        @Override
        public void reset() {
            current = list.first;
            previous = null;
        }

        @Override
        public void insertBefore(E value) {
            Link <E> newItem = new Link<>(value);
            if (previous == null){
                newItem.next = list.first;
                first = newItem;
                reset();
            }
            else{
                newItem.next = previous.next;
                previous.next = newItem;
                current = newItem;
            }
        }

        @Override
        public void insertAfter(E value) {
            Link <E> newItem = new Link<>(value);
            if (list.isEmpty()){
                list.first = newItem;
                current = newItem;
            }
            else{
               newItem.next = current.next;
               current.next = newItem;
               next();
            }
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            E nextValue = current.getData();
            previous = current;
            current = current.next;
            return nextValue;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator(this);
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }
}