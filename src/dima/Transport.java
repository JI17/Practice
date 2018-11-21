package dima;


import java.util.Objects;

public abstract class Transport {
    String destination;
    int number;
    int time;

    public Transport(String destination, int number, int time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    public Transport() {

    }

    abstract void typeTrans (Train[] train);

    abstract void sumTrain (Train[] train);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return number == transport.number &&
                time == transport.time &&
                Objects.equals(destination, transport.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, number, time);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", time=" + time +
                '}';
    }
}

