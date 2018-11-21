package dima;


import java.util.Objects;

public class Train extends TypeTransport {
    int obshiy;
    int plackart;
    int kupe;
    int lux;

    public Train(String destination, int number, int time, int obshiy, int plackart, int kupe, int lux) {
        super(destination, number, time);
        this.obshiy = obshiy;
        this.plackart = plackart;
        this.kupe = kupe;
        this.lux = lux;
    }

    public Train() {
        super();
    }

    public void toDestination(Train[] train) {
        String destinationParis = "Paris";
        for (int i = 0; i < train.length; i++) {
            if (train[i].destination.equals(destinationParis)) {

                System.out.println(train[i]);
            }
        }
        for (int i = 0; i < 120; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    void typeTrans(Train[] train) {

    }

    @Override
    void sumTrain(Train[] train) {
        super.sumTrain(train);
        int obshiySum = 0;
        int plackartSum = 0;
        int kupeSum = 0;
        int luxSum = 0;
        for (int i = 0; i < train.length; i++) {
            obshiySum += train[i].obshiy;
            plackartSum += train[i].plackart;
            kupeSum += train[i].kupe;
            luxSum += train[i].lux;
        }
        System.out.println("Общее количество мест: " + obshiySum + " общих, " + plackartSum + " плацкарт, "
                + kupeSum + " купе, " + luxSum + " люкс;");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Train train = (Train) o;
        return obshiy == train.obshiy &&
                plackart == train.plackart &&
                kupe == train.kupe &&
                lux == train.lux;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), obshiy, plackart, kupe, lux);
    }

    @Override
    public String toString() {
        return "Train{" +
                " destination='" + destination + '\'' +
                ", number=" + number +
                ", time=" + time +
                ", obshiy=" + obshiy +
                ", plackart=" + plackart +
                ", kupe=" + kupe +
                ", lux=" + lux +
                '}';
    }

}
