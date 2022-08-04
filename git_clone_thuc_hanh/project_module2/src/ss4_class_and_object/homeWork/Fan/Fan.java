package ss4_class_and_object.homeWork.Fan;

public class Fan {
//    int speed, radius, color, boolean button;
    private int speed ;
    private boolean button ;
    private double radius ;
    private String color ;

   public Fan (){
       this.speed = 1;
       this.button = false;
       this.radius = 5;
       this.String = yellow;
   }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.button = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }




}
