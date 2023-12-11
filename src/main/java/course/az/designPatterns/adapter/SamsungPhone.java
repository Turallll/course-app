package course.az.designPatterns.adapter;

public class SamsungPhone implements Phone {

    private int chargeVolt;

    public SamsungPhone(){
        this.chargeVolt = 5;
    }
    @Override
    public int charge() {
        System.out.println("Phone charging ...");
        return chargeVolt;
    }
}
