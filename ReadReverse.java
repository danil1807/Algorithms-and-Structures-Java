public class ReadReverse {
    public final static String TEXT_TO_REVERT = "As a side note: Variables that are declared final and are mutable can still be changed; however, the variable can never point at a different object.";

    private char[] text;
    private StackImpl stack;


    public void reverse(String text){
        int size = countSymbs(text);
        this.text = text.toCharArray();
        this.stack = createStack(size);
            for (int i = 0; i < this.text.length; i++) {
                this.stack.push(this.text[i]);
            }
        while(!this.stack.isEmpty()){
            System.out.print(this.stack.pop());
        }
    }
    public int countSymbs(String text){
        int size = text.length();
        return size;
    }

    public StackImpl createStack(int size){
        StackImpl <Character> stack = new StackImpl<>(size);
        return stack;
    }

    public static void main(String[] args) {
        ReadReverse rr = new ReadReverse();
        rr.reverse(TEXT_TO_REVERT);
    }
}
