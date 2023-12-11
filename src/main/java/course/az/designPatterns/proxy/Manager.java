package course.az.designPatterns.proxy;

public class Manager implements CompanySecurityInfo{

    @Override
    public String getInfo() {
        return "this info for manager";
    }
}
