package work.SerializationTest;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "tempFile";

        UserChild user = new UserChild();
        user.setLifeLevel(55);
        Sord sord = new Sord();
        sord.level = 5;
        user.sord = sord;
        user.childLevel = 65;

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
        UserChild newUser = (UserChild) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.getLifeLevel());
        System.out.println(newUser.sord);
        System.out.println(newUser.childLevel);
    }
}
