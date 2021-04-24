import computer.Computer;
import computer.Laptop;
import computer.PC;

public class MainApp {

    public static void main(String[] args) {


        Computer officeComputer = new PC("Office computer", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 50);


        officeComputer.volumeUp();

        System.out.println(officeComputer.getVolumeLevel());

        officeComputer.volumeUp(65);
        System.out.println(officeComputer.getVolumeLevel());

        officeComputer.volumeUp(66);
        System.out.println(officeComputer.getVolumeLevel());


        officeComputer.volumeDown(110);
        System.out.println(officeComputer.getVolumeLevel());

    }
}