package course.az.designPatterns.proxy;

public class ManagerProxy implements CompanySecurityInfo {

    private Manager manager;

    private String username;
    private String password;

    public ManagerProxy(String username, String password) {
        this.manager = new Manager();
        this.username = username;
        this.password = password;
    }

    private boolean isManager() {
        boolean isManager = false;
        boolean userValid = EmployeeUtil.isUserValid(username, password);
        if (userValid) {
            Employee employee = EmployeeUtil.getEmployeeByUsername(username);
            isManager = employee.isManager();
        }
        return isManager;
    }

    @Override
    public String getInfo() throws Exception{
        boolean manager1 = isManager();
        if (manager1){
            return manager.getInfo();
        }else {
            throw new IllegalAccessException("");
        }
    }
}
