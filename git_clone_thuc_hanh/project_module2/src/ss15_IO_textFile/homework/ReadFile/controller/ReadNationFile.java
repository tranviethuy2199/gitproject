package ss15_IO_textFile.homework.ReadFile.controller;

import java.io.*;

public class ReadNationFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss15_IO_textFile\\homework\\ReadFile\\model\\National.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

}
