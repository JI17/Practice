package dima;

public class Generate {
    public static Train [] trainGenerate(){
        Train train1 = new Train("Warsaw", 1112, 11, 15, 20, 10, 3);
        Train train2 = new Train("Moscow", 1114, 5, 5, 35, 14, 1);
        Train train3 = new Train("Moscow", 1116, 12, 21, 3, 13, 0);
        Train train4 = new Train("Warsaw", 1121, 18, 11, 35, 7, 0);
        Train train5 = new Train("Moscow", 1132, 15, 0, 11, 3, 6);
        Train train6 = new Train("Warsaw", 1145, 8, 14, 18, 17, 8);
        Train train7 = new Train("Paris", 1145, 8, 14, 18, 17, 8);

        Train[] trains = new Train[7];
        trains[0] = train1;
        trains[1] = train2;
        trains[2] = train3;
        trains[3] = train4;
        trains[4] = train5;
        trains[5] = train6;
        trains[6] = train7;

        return trains;
    }
}
