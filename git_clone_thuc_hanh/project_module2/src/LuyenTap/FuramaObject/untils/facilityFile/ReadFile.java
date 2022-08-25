package LuyenTap.FuramaObject.untils.facilityFile;

import LuyenTap.FuramaObject.model.FurumaResort.Resort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
    public static List<Resort> readFacilityFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Resort> resorts = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            resorts.add(new Resort(info[0],Double.parseDouble(info[1]),Integer.parseInt(info[2]),info[3]) {
            });
        }

       return resorts;
    }
}
