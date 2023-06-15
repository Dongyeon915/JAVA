package chap06;

class Data{
    int x;
}

public class PrimitiveParamEx {


    public void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        chang(d);

    }

    public static void chang(Data d){
        d.x = 100000;
    }
}
