import java.util.Arrays;
import java.util.Random;

public class ArrUtilits <E extends Comparable<E>> implements Array{


    private int size;
    private E[] arr;

    public ArrUtilits(int size) {
        this.size = 0;
        this.arr = (E[]) new Comparable[size];
    }

    void deleteEl(E element){
        if(binarySearch(element)){
            int i;
            for (i = 0; i < this.size; i++) {
                if(this.arr[i] == element){
                    break;
                }
            }
            for (int j = i; j < this.size - 1; j++) {
                this.arr[j] = this.arr[j + 1];
            }
            E[] arr2 = (E[]) new Object[this.size - 1];
            System.arraycopy(this.arr,0, arr2,0,this.size - 1);
            this.arr = arr2;
            this.size--;

        }
    }

    boolean addEl(E element) {
        E[] arr2 = Arrays.copyOf(this.arr, this.size + 1);
        this.size++;
        arr2[this.size - 1] = element;
        this.arr = arr2;
        return true;
    }

    boolean addSortedEl(E element) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i].compareTo(element) > 0){
                break;
            }
        }
        for (int j = this.size; j > i; j--) {
            this.arr[j] = this.arr[j-1];
        }
        this.arr[i] = element;
        this.size++;
        return true;
    }


//линейный поиск
    int simpleSearchEl(E element){
        for(int i = 0; i < this.size; i++){
            if (this.arr[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    boolean binarySearch(E element){
        int max = this.size - 1;
        int min = 0;
        int mid = (max + min) /  2;
        while(min <= max) {
            if (this.arr[mid].compareTo(element) == 0) {
                return true;
            } else {
                if (this.arr[mid].compareTo(element) < 0) {
                    min = mid + 1;
                } else {
                    max = mid - 1;
                }
            }
        }
        return false;
    }

    void displayArr(){
        System.out.println(Arrays.toString(this.arr));
    }

    @Override
    public String toString() {
        return "ArrUtilits{" +
                "size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    @Override
    public void add(Object value) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean remove(Object value) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void display() {

    }

    public void sortBubble(){
            int out, in;
            for (out = this.size - 1; out >= 1; out--) {
                for(in = 0; in < out; in++) {
                    if (this.arr[in].compareTo(this.arr[in+1]) > 0) {
                        change(in, in + 1);
                    }
                }
            }
        }

    private void change(int a, int b){
        E tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }


    public void sortSelect(){
        int out, in, mark;
        for(out = 0; out < this.size; out++){
            mark = out;
            for(in = out + 1; in < this.size; in++){
                if (this.arr[in].compareTo(this.arr[mark]) < 0){
                    mark = in;
                }
            }
            change(out, mark);
        }
    }

    public void sortInsert(){
        int in, out;
        for(out = 1;out < this.size; out++){
            E temp = this.arr[out];
            in = out;
            while(in > 0 && this.arr[in-1].compareTo(temp) >=0){
                this.arr[in] = this.arr[in-1];
                --in;
            }
            this.arr[in] = temp;
        }
    }
    E[] fillingArrWithRandNumbers(int range){

        this.arr = (E[]) new Integer[range];
        this.size = range;
        int min = 0;
        int max = range;
        for (int i = 0; i < this.size; i++) {
            Integer random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            this.arr[i] = (E) random_int;
        }
        return this.arr;
    }


}
