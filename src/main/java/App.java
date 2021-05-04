import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Employee firstEmpployee = service.createEmployee("zhenya", 1, 1);
        Employee secondEmployee = service.createEmployee("artem", 2, 2);
        DepartmentService departmentService = new DepartmentService();
        Department development = departmentService.createDepartment("development", 1);
        Department sales = departmentService.createDepartment("sales", 2);
    }
}
