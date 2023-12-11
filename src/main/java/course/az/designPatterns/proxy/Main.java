package course.az.designPatterns.proxy;

public class Main {
    public static void main(String[] args) {

        ManagerProxy managerProxy = new ManagerProxy("Ali", "1234");

        try {
            String info = managerProxy.getInfo();
            System.out.println(info);

        }catch (Exception e){
            System.out.println("Access denied");
        }
    }
}
