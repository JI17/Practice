package work.read_write;

import java.io.*;
import java.util.Arrays;

import static java.lang.System.in;

public class ReadText {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("result_email.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("lavaminedb.txt")));

        String s;
        while ((s = bufferedReader.readLine()) != null) {

            Arrays.stream(s.split(",")).filter(w -> w.matches("(.*)@(.*)")).forEach(w -> {
                try {
                    writer.write(w.substring(4, w.length() - 1) + "\n");
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        in.close();
    }
}