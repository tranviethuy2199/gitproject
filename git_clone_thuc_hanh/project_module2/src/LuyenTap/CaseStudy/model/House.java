package LuyenTap.CaseStudy.model;

public class House extends Furama implements IFloor, KindOfRoom {
    @Override
    public String floor() {
        return "tầng ở tầng :";
    }

    @Override
    public String KindOfRoom() {
        return "Nomarl room , no smoking";
    }
}
