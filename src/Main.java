public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        if(!fan.isOn()){
            System.out.println(fan);
        }

        Fan fan1 = new Fan();
        fan1.setFAST();
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setMEDIUM();
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2);
    }

}