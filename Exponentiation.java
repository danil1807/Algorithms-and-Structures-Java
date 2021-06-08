public class Exponentiation {
    private float result;
    private int count = 2;


    public float calc(float number, int exp){

        if (exp < 0) {
            int positiveExp = exp * -1;
            return 1 / calc(number, positiveExp);
        }

        else if (exp == 0){
            return 1f;
        }
        else {
            if (exp == 1) {
                return number;
            }


            if (this.count == 2){
                this.result = number;
            }
            float result1 = number * result;
            this.result = result1;


            if (count >= exp) {
                return result;
            }
            count++;
            return calc(number, exp);
        }
    }

    public static void main(String[] args) {
        Exponentiation exponentiation = new Exponentiation();
        System.out.println(exponentiation.calc(110,-3));

    }
}
