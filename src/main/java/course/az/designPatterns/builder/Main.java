package course.az.designPatterns.builder;

public class Main {
    public static void main(String[] args) {


        Home home1 = HomeBuilder.startBuild()
                .setCity("Baku")
                .setTown("Xetai")
                .setBalconyCount(0)
                .build();

        System.out.println(home1);

        //System.out.println(home2);
    }
}
