package LuyenTap.CaseStudy.view;

import LuyenTap.CaseStudy.controller.StaffCheck;
import LuyenTap.CaseStudy.service.StaffInformation;

public interface View {
    public static void main(String[] args) {
        StaffCheck staffCheck = new StaffCheck();
        staffCheck.displayInformation();

    }
}
