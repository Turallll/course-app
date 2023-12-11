package course.az.designPatterns.adapter;

public class Socket {

    public void takeElectric(ElectricalDevices electricalDevices) {
        int volt = electricalDevices.plugSocketAndRun();

        System.out.println(volt + " volt from Socket");
    }
}
