package course.az.designPatterns.factory;

public class Main {
    public static void main(String[] args) {

        Phone s8 = PhoneFactory.getPhone("S8", "5000", 1, 2);
        s8.getModel();

        System.out.println(s8);
    }
}
