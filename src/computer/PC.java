package computer;

public class PC extends Computer {

    boolean isPlugIn;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        this.isPlugIn = false;
    }

    @Override
    public void switchOn() {
        if (isPlugIn) {
            super.switchOn();
        } else {
            System.out.println("This PC is not plug in.");
        }
    }

    public void setPlugIn(boolean newPlugIn) {
        isPlugIn = newPlugIn;
    }
}
