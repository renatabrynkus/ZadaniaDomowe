package computer;

public class Laptop extends Computer {

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public int volumeUp() {
        return volumeLevel +=5;
    }

    @Override
    public void switchOn() {
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level too low.");
        }
    }


    @Override
    public int volumeUp(int newVolume) {
        volumeLevel = volumeLevel + newVolume;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
            return volumeLevel;
        }

    @Override
    public int volumeDown() {
        volumeLevel -=5  ;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
        }

    @Override
    public int volumeDown(int newVolume) {
        volumeLevel = volumeLevel - newVolume;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
        }

    @Override
    public void switchOff(){
        System.out.println("Wyłączam laptop: " + name);
        state = false;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }
}
