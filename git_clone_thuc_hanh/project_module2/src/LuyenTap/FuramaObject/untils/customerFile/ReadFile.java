package LuyenTap.FuramaObject.untils.customerFile;

import LuyenTap.FuramaObject.model.Person.Customer;
import LuyenTap.StudentManager.model.Student;

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

    public static List<Customer> readCustomerFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Customer> customers = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            customers.add(new Customer(info[0],info[1],Integer.parseInt(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6]));
        }

        return customers;
    }
}
