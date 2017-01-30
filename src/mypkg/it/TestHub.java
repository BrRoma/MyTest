package mypkg.it;


public class TestHub {

    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        switcher.consumer=lamp;


        switcher.switchOn();
    }
}
