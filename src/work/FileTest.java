package work;

import java.io.*;

public class FileTest {

    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("Str");
        bufferedWriter.newLine();
        bufferedWriter.write("Str");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
    }
}
