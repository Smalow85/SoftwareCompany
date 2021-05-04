import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentService {
    public Department createDepartment(String name, int id){
        Department department = new Department();
        department.setName(name);
        department.setId(id);
        return department;
    }

    public void updateDepartment(Department department, String name, int id){
        department.setId(id);
        department.setName(name);
    }

    public void assignToDepartment(Employee employee, Department department){
        employee.setDepartmentId(department.getId());
        System.out.println(employee.getDepartmentId());
    }

    public Map<Employee, Department> getAllEmployees (List<Employee> employeeList, Department department){
        Map<Employee, Department> employeeMap = new HashMap<>();
        for (Employee employee : employeeList){
            if (employee.getDepartmentId() == department.getId()){
                System.out.println(employee);
                employeeMap.put(employee, department);
            }
        }
        return employeeMap;
    }
}
