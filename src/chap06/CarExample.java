package chap06;

public class CarExample {

    private String color;
    private String gearType;
    private int door;


    public CarExample(){
        this("white","auto",5);
    }

    public CarExample(CarExample c){
        this.color = c.color;
        this.gearType = c.gearType;
        this.door = c.door;
    }

    public CarExample(String color,String gearType,int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    class TestCarExample {

        public static void main(String[] args) {
            CarExample carExample = new CarExample();
            CarExample carExample1 = new CarExample(carExample);
        }
    }

}
