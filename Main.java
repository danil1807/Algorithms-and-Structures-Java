import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tree> trees = new ArrayList<>();
        //Tree <Integer> tree1 = new Tree<>();
        for (int i = 0; i < 10; i++) {
            Tree <Integer> tree = new Tree<>();
            trees.add(tree);
        }


        for (Tree tree : trees){
            while(tree.getTreHeight() <= 6) {
                int random = (int) ((Math.random() * (50)) - 25);
                tree.add(random);
            }
            System.out.println(Tree.isBalanced(tree));
           // tree.display();
        }

    }
}
