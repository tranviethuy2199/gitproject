package LuyenTap.FuramaObject.untils.nhanVienFile;

import LuyenTap.FuramaObject.model.Person.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();
        return strings;
    }

    public static List<NhanVien> readNhanVienFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<NhanVien> nhanViens = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            nhanViens.add(new NhanVien(info[0],info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6],info[7],info[8]));
        }

        return nhanViens;
    }
}
