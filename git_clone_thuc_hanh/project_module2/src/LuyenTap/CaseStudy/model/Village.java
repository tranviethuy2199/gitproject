package LuyenTap.CaseStudy.model;

public class Village extends Furama implements IFloor, KindOfRoom {

    @Override
    public String floor() {
        return "tầng ở tầng : ";
    }

    @Override
    public String KindOfRoom() {
        return "V.I.P";
    }
}
