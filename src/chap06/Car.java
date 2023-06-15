package chap06;

public class Car {
    private String color;
    private String gearType;
    private int door;

    public Car(){
        this("white","auto",4);
    }

    public Car(String color){
        this(color,"auto",4);
    }

    public Car(String color,String gearType,int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    class CarTest2 {

        public static void main(String[] args) {
            Car car = new Car();
            Car car1 = new Car("Blue");
            System.out.println(car);
            System.out.println(car1);
        }
    }
}
