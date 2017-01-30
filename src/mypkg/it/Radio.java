package mypkg.it;


public class Radio implements ElectricityConsumer {

    void playMusic(){
        System.out.println("radio plays music");
    }

    @Override
    public void electricictyON() {
        playMusic();
    }
}
