package mypkg.it;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    void addElectricityListener (ElectricityConsumer listener){
        listeners.add(listener);
    }

    void removeElectricityListener (ElectricityConsumer listener){
        listeners.remove(listener);
    }


    void switchOn(){
        System.out.println("ток подан...");
        for (ElectricityConsumer c : listeners){
            c.electricictyON();
        }

    }

}
