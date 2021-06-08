import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private int maxCapacity;
    private int capacity;
    private int value;
    private int index = 0;
    private int tries = 0;
    private int thingsInTheBP = 0;
    private int count = 0;

    public Backpack(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
/**
ДОБАВИТЬ ВАРИАНТ НЕ ТОЛЬКО ПО ПОРЯДКУ!

 */

    public void addAnother(ArrayList<Smth> arr){
        if(placeRemaining() >= arr.get(index).weight){
            putIntoBP(arr);
            index++;
            display();
            if (index == arr.size()){
                return;
            }
            addAnother(arr);
        }
        else {
//            if (thingsInTheBP > 1){
//                checkForBounds(arr);
//                takeBack(arr);
//                addAnother(changeExceptFirst(arr));
//            }
            if (count >= arr.size() - 1){
                return;
            }
            addAnother(changeExceptFirst(arr));
        }

    }
    public void putIntoBP(ArrayList<Smth> arr){
        this.capacity = capacity + arr.get(index).weight;
        this.value = value + arr.get(index).price;
        thingsInTheBP++;
    }
    public void checkForBounds(ArrayList<Smth> arr){

    }

    public void takeBack(ArrayList<Smth> arr){
        this.capacity = 0;
        this.value = 0;
        index = 0;
        thingsInTheBP--;
    }

    public void addThings(ArrayList <Smth> arr){

        this.capacity = capacity + arr.get(index).weight;
        if (this.capacity > maxCapacity){
            this.capacity = capacity - arr.get(index).weight;
//            result();
            if (this.tries >= arr.size() - 1){
                this.tries = 0;
                ArrayList<Smth> newArr = changeSecondToFirstFirstToLast(arr);
                addThings(newArr);
            }
            addThings(changeExceptFirst(arr));
        }
        else if (this.capacity == maxCapacity){
          // result();
        }
        this.value = value + arr.get(index).price;
        index++;
        if (index == arr.size() || count >= arr.size() - 1) {
            return;
        }
        addThings(arr);
    }


    public ArrayList <Smth> checkIfNeedChange(ArrayList<Smth> arr){
        if (this.tries >= arr.size() - 1){
            this.tries = 0;
            return changeSecondToFirstFirstToLast(arr);
        } else{
            return arr;
        }
    }

    public ArrayList<Smth> changeSecondToFirstFirstToLast(ArrayList <Smth> arr){
        Smth temp = arr.get(0);
        for (int i = 0; i < arr.size() - 1; i++) {
            arr.set(i, arr.get(i + 1));
        }
        arr.set(arr.size() - 1, temp);
        //count++;
        return arr;
    }

    public ArrayList<Smth> changeExceptFirst(ArrayList <Smth> arr){
        Smth temp = arr.get(1);
        for (int i = 1; i < arr.size() - 1; i++) {
            arr.set(i, arr.get(i + 1));
        }
        arr.set(arr.size() - 1, temp);
        count++;
        thingsInTheBP = 0;
        return arr;
    }

    public boolean isFull(){
        return this.capacity == this.maxCapacity;
    }

    public void resetBp(){
        this.capacity = 0;
        this.value = 0;
        this.index = 0;
    }


    public int placeRemaining(){
        return this.maxCapacity - this.capacity;
    }

    public void display(){
        //count++;
        System.out.println(toString());
    }



    @Override
    public String toString() {
        return "Backpack{" +
                "maxCapacity=" + maxCapacity +
                ", capacity=" + capacity +
                ", value=" + value +
                ", index=" + index +
                ", tries=" + tries +
                ", thingsInTheBP=" + thingsInTheBP +
                ", count=" + count +
                '}';
    }
}
