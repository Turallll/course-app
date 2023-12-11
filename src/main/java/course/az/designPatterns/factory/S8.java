package course.az.designPatterns.factory;

public class S8 implements Phone{

    private String model;
    private String battery;
    private int width;
    private int height;

    public S8(String model, String battery, int width, int height) {
        this.model = model;
        this.battery = battery;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getModel() {
        System.out.println(model);
        return null;
    }

    @Override
    public String getBattery() {
        System.out.println(battery);
        return null;
    }

    @Override
    public int getWidth() {
        System.out.println(width);
        return 0;
    }

    @Override
    public int getHeight() {
        System.out.println(height);
        return 0;
    }

    @Override
    public String toString() {
        return "S8{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
