package computer;

public class PC extends Computer {

    boolean isPlugIn;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        this.isPlugIn = false;
    }

    public int volumeUp() {
        return volumeLevel += 1;
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
        volumeLevel -=1  ;
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
    public void switchOn() {
        if (isPlugIn) {
            super.switchOn();
        } else {
            System.out.println("This PC is not plug in.");
        }
    }

    @Override
    public void switchOff(){
        System.out.println("Wyłączam PC: " + name);
        state = false;
    }


    public void setPlugIn(boolean newPlugIn) {
        isPlugIn = newPlugIn;
    }
}
