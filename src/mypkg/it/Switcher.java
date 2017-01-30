package mypkg.it;


public class Switcher {

    public ElectricityConsumer consumer;

    void switchOn(){
        System.out.println("ток подан...");
        if (consumer!=null) consumer.electricictyON();

    }

    public ElectricityConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(ElectricityConsumer consumer) {
        this.consumer = consumer;
    }
}
