public interface Array<E extends Object> {

        void add(E value);

        E get(int index);

        boolean remove(E value);

        E remove(int index);

        int indexOf(E value);

        boolean contains(E value);

        int size();

        boolean isEmpty();

        void display();

        void sortBubble();
        void sortSelect();
        void sortInsert();



    }
