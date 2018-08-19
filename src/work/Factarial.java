package work;

public interface Factarial {
    int getResult(int numb);
}

class GetFactarial {

    public static void main(String[] args) {


        Factarial factarial = numb -> {

            int result = 1;
            for (int i = 1; i <= numb; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factarial.getResult(3));
    }
}
