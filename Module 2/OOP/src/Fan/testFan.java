package Fan;

public class testFan {
    public static void main(String[] args) {
        int LOW = 1;
        int MED = 2;
        int HIGHT = 3;

        Fan fan1 = new Fan();
        fan1.setSpeed(HIGHT);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.speed + " " + fan1.radius + " " + fan1.color + " " + fan1.on);

        Fan fan2 = new Fan();
        fan2.setSpeed(MED);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.speed + " " + fan2.radius + " " + fan2.color + " " + fan2.on);
    }
}
