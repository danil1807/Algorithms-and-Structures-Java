import java.util.ArrayList;

public class Prioritization {


    public static void main(String[] args) {


        Smth s1 = new Smth(50, 7);
        Smth s2 = new Smth(60, 11);
        Smth s3 = new Smth(30, 10);
        Smth s4 = new Smth(40, 4);
        Smth s5 = new Smth(7, 6);
        Smth s6 = new Smth(8, 4);
        Smth s7 = new Smth(12, 9);
        Smth s8 = new Smth(13, 7);
        Smth s9 = new Smth(17, 10);
        Smth s10 = new Smth(22, 20);

        ArrayList <Smth> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
//        arrayList.add(s5);
//        arrayList.add(s6);
//        arrayList.add(s7);
//        arrayList.add(s8);
//        arrayList.add(s9);
//        arrayList.add(s10);

        Backpack bp = new Backpack(100);
            bp.addThings(arrayList);
        bp.display();




    }

}
