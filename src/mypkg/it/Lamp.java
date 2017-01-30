package mypkg.it;

public class Lamp implements ElectricityConsumer {

    void lightON(){
        System.out.println("лампа зажглась");
    }


    @Override
    public void electricictyON() {
        lightON();
    }
}
