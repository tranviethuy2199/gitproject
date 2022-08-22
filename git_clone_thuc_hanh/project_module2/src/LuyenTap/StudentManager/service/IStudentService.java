package LuyenTap.StudentManager.service;

import java.io.IOException;

public interface IStudentService {

    void displayAllStudent() throws IOException;

    void addStudent() throws IOException;

    void removeStudent();

    void findStudent();

}
