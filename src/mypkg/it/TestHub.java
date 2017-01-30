package mypkg.it;


import static java.lang.System.out;

public class TestHub {

    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        switcher.addElectricityListener( ()-> out.println("TV switchon and you may see a news"));
        switcher.addElectricityListener( ()-> out.println("fire!!!") );


        switcher.switchOn();
    }
}
