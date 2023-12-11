package course.az.designPatterns.factory;

public class PhoneFactory {


    public static Phone getPhone(String model,String battery,int width,int weight){

        Phone phone ;
        if ("S8".equalsIgnoreCase(model)){
            phone = new S8(model,battery,width,weight);
        }else if("Note8".equalsIgnoreCase(model)){
            phone = new Note8(model,battery,width,weight);
        }else {
            throw new RuntimeException("model don't have");
        }
        return phone;
    }
}
