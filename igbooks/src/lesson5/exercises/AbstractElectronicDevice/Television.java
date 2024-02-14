package lesson5.exercises.AbstractElectronicDevice;

public class Television extends ElectronicDevice {

    public void turnOn() {
        changeChannel(1);
        initializeScreen();
        System.out.println("TV is turned on");
    }
    public void turnOff() {}
    
    public void changeChannel(int channel) {}
    public void initializeScreen() {}
}