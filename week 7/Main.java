public class Main {

    public static void main(String[] args) {

        Appliance washingMachine = new WashingMachine("LG");
        Appliance microwave = new Microwave("Panasonic");

        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println();

        microwave.displayBrand();
        microwave.turnOn();
        microwave.operate();
        microwave.turnOff();
    }
}