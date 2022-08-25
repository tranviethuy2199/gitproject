package LuyenTap.FuramaObject.untils.nhanVienFile;

import LuyenTap.FuramaObject.model.Person.NhanVien;

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
    public static void writeNhanVienFile(String path, List<NhanVien> nhanViens) throws IOException {
        String data = "";
        for (NhanVien nhanVien : nhanViens) {
            data += nhanVien.toString();
            data += "\n";
        }

        writeFile(path, data);
    }
}
