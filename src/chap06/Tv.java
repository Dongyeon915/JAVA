package chap06;

public class Tv {
    String color;
    boolean power;
    int channel;

    public void power() {
        power = !power;
    }

    public void channelUp(){
        ++channel;
    }

    public void channelDown(){
        --channel;
    }

    class TvTest{

        public static void main(String[] args) {
            Tv tv = new Tv();
            tv.channel = 7;
            tv.channelDown();
            System.out.println(tv.channel);

            Tv[] tvs = new Tv[100];

            for (int i = 0; i < tvs.length; i++) {
                tvs[i] = new Tv();
                tvs[i].channel = i + 10;
            }
            for (int i = 0; i < tvs.length; i++) {
                tvs[i].channelUp();
                System.out.printf("tvs[%d].channel = %d%n",i,tvs[i].channel);
            }
        }
    }
}
