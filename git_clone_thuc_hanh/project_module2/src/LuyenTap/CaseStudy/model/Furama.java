package LuyenTap.CaseStudy.model;

public class Furama {
    private int area;
    private int money;
    private int amountPeople;
    private String HowToRent;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getHowToRent() {
        return HowToRent;
    }

    public void setHowToRent(String howToRent) {
        HowToRent = howToRent;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "area=" + area +
                ", money=" + money +
                ", amountPeople=" + amountPeople +
                ", HowToRent='" + HowToRent + '\'' +
                '}';
    }
}
