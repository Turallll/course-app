package course.az.designPatterns.adapter;

public class Main {
    public static void main(String[] args) {

        Socket socket = new Socket();

        Tv tv = new Tv();

        SamsungPhone samsungPhone = new SamsungPhone();

        socket.takeElectric(tv);
        PhoneAdapter phoneAdapter = new PhoneAdapter(samsungPhone);
        socket.takeElectric(phoneAdapter);
    }
}
