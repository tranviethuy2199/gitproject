package LuyenTap.CaseStudy.service;


import LuyenTap.CaseStudy.model.Staff;

public class StaffInformation implements IStaff {
   static Staff[] staff;
   static int amount;

  public StaffInformation() {
      staff = new Staff[100];
      amount = 10;
   }
   public StaffInformation(int amount) {
      if (amount > 0 ){
          StaffInformation.amount = amount;
      }else {
          StaffInformation.amount = 0;
      }
   }
}
