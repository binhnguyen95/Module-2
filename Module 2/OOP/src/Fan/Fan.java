package Fan;

public class Fan {
    protected int speed = 1;
    protected boolean on = false;
    protected double radius = 5;
    protected String color = "blue";


    protected int getSpeed() {
        return this.speed;
    }

    protected void setSpeed(int speed) {
        this.speed = speed;
    }


    protected void setOn(boolean on) {
        this.on = on;
    }

    protected double getRadius() {
        return this.radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected String getColor() {
        return this.color;
    }
    protected void setColor(String color) {
        this.color = color;
    }

}
