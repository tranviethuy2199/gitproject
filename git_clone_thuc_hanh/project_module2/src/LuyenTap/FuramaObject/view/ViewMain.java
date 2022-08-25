package LuyenTap.FuramaObject.view;

import LuyenTap.FuramaObject.controller.FurumaController;

import java.io.IOException;

public class ViewMain {
    public static void main(String[] args) throws IOException {
        FurumaController furumaController = new FurumaController();
        furumaController.generalManagement();
    }
}
