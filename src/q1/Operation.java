package q1;

public interface Operation {
    int getResult(int v1, int v2);
}

class GetOperation {

    public static void main(String[] args) {

        Operation operation = (v1, v2) -> v1 * v2;
        System.out.println(operation.getResult(2, 4));
    }
}
