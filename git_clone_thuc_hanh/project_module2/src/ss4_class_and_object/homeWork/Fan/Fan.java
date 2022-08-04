package ss4_class_and_object.homeWork.Fan;

public class Fan {
    //    int speed, radius, color, boolean button;
    private int speed;
    private boolean button;
    private double radius;
    private String color;

       public Fan (){
       this.speed = 1;
       this.button = false;
       this.radius = 5;
       this.color = "yellow";
   }
    public Fan(int speed, boolean button, double radius, String color) {
        this.speed = speed;
        this.button = false;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.getButton()) {
            return "Fan{" +
                    "speed=" + this.getSpeed() +
                    ", radius=" + this.getRadius() +
                    ", color='" + this.getColor() + '\'' +
                    "fan is on" +
                    '}';
        } return "Fan{" +
                "speed=" + this.getSpeed() +
                ", radius=" + this.getRadius() +
                ", color='" + this.getColor() + '\'' +
                "fan is off" +
                '}';
    }

}


