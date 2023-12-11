package course.az.designPatterns.adapter;

public class PhoneAdapter implements ElectricalDevices {

    private Phone phone;

    public PhoneAdapter(Phone phone) {
        this.phone = phone;

    }

    @Override
    public int plugSocketAndRun() {
        return phone.charge();
    }
}
