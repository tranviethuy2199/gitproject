package LuyenTap.FuramaObject.untils.facilityFile;

import LuyenTap.FuramaObject.model.FurumaResort.Resort;
import LuyenTap.FuramaObject.model.Person.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {
    private static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeFacilityFile(String path, List<Resort> resorts) throws IOException {
        String data = "";
        for (Resort resort : resorts) {
            data += resorts.toString();
            data += "\n";
        }

        writeFile(path, data);
    }
}
