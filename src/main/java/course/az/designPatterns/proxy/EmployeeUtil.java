package course.az.designPatterns.proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtil {

    public static List<Employee> getEmployeeList() {
        Employee employee = new Employee("Ahmad", "123", false);

        Employee employee1 = new Employee("Ali", "1234", true);

        Employee employee2 = new Employee("Vali", "12345", false);
        List<Employee> employees = new ArrayList<>();

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        return employees;
    }

    public static Map<String, Employee> getUsernameMap() {
        List<Employee> employeeList = getEmployeeList();

        Map<String, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employeeList) {
            employeeMap.put(employee.getUsername(), employee);
        }
        return employeeMap;
    }

    public static Employee getEmployeeByUsername(String username) {
        Map<String, Employee> usernameMap = getUsernameMap();

        Employee employee = usernameMap.get(username);

        return employee;
    }

    public static boolean isUserValid(String username, String password) {
        boolean isUserValid = false;
        Employee employee = getEmployeeByUsername(username);

        if (employee != null) {
             isUserValid = employee.getPassword().equals(password);
        }
        return isUserValid;
    }
}
