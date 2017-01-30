package mypkg.it;


public class TestHub {

    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);


        switcher.switchOn();
    }
}
