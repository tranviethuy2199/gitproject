package LuyenTap.FuramaObject.service.Interface;

import java.io.IOException;

public interface IBookingService {
    void addBooking() throws IOException;

    void displayAllBooking();

    void createConstracts();

    void diplayConstracts();

    void editConstracts();
}
