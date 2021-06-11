 public interface TreeInt<E extends Comparable<? super E>> {

        enum TraverseMode {
            IN_ORDER,
            PRE_ORDER,
            POST_ORDER,
        }

        boolean add(E value);

        boolean contains(E value);

        boolean remove(E value);

        boolean isEmpty();

        int size();

        void display();

        void traverse(TraverseMode mode);

}
