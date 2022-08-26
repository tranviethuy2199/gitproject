package LuyenTap.FuramaObject.untils.customerFile;

import LuyenTap.FuramaObject.model.Person.khachHang;

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
    public static void writeCustomerFile(String path, List<khachHang> customers) throws IOException {
        String data = "";
        for (khachHang customer : customers) {
            data += customer.toString();
            data += "\n";
        }

        writeFile(path, data);
    }

}
