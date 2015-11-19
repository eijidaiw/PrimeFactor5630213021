
import java.util.ArrayList;

public class PrimeFactor {

    ArrayList<Integer> listPrimeNumber = new ArrayList<>();

    int numberPrime;
    int number;
    int check;

    public void getPrimeNumber(int input) {
        for (numberPrime = 2; numberPrime <= input; numberPrime++) {
            check = 0;
            for (number = 1; number < numberPrime; number++) {
                if (numberPrime % number == 0) {
                    check = check + 1;
                }
            }
            if (check == 1) {
                listPrimeNumber.add(numberPrime);
            }
        }
    }

    public String getPrimeFactor(int in) {
        String PrimeFactor = "";
        int input = in;
        while (input != 1) {
            for (int i = 0; i < listPrimeNumber.size(); i++) {
                if (input % listPrimeNumber.get(i) == 0) {
                    input = input / listPrimeNumber.get(i);
                    PrimeFactor = PrimeFactor + listPrimeNumber.get(i) + "";
                    break;
                }
            }
            if (input > 1) {
                PrimeFactor = PrimeFactor + "x";
            }
        }
        return PrimeFactor;
    }

}

class Main {

    public static void main(String[] args) {
        PrimeFactor a = new PrimeFactor();
        int input = Integer.parseInt(args[0]);
        a.getPrimeNumber(input);
        System.out.println("Prime Factor of "+input+" is "+a.getPrimeFactor(input));
    }
}
