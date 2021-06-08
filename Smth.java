public class Smth {
    public int weight;
    public int price;

    public Smth(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    private float koefficient;
    private Smth thing;

    public void calc(Smth thing){
        koefficient = (float) thing.price / thing.weight;
    }
}
