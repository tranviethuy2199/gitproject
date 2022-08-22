package ss15_IO_textFile.homework.CopyFileText.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\ss15_IO_textFile\\homework\\CopyFileText\\model\\SourceFile.txt");
        File copyFile = new File("src\\ss15_IO_textFile\\homework\\CopyFileText\\model\\new_SourceFile.txt");

//        FileReader fileReader = new FileReader(file);
        Files.copy(file.toPath(),copyFile.toPath());
        System.out.println(copyFile);
    }

//    private void countCharatec() {
//
//    }

}
