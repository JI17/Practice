package dima;

public class Main {
    public static void main(String[] args) {

        Transport type = new TypeTransport();
        Train train = new Train();
        Train[] trains = Generate.trainGenerate();
        type.typeTrans(trains);
        train.toDestination(trains);
        train.sumTrain(trains);
    }
}
