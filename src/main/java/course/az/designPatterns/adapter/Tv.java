package course.az.designPatterns.adapter;

public class Tv implements ElectricalDevices {

    private int volt;

    public Tv() {
        this.volt = 220;
    }
    @Override
    public int plugSocketAndRun() {

        System.out.println("Tv working ...");

        return volt;
    }
}
