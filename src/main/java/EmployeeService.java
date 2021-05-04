public class EmployeeService {

    public Employee createEmployee(String name, int id, int departmentId){
        Employee employee = new Employee();
        employee.setDepartmentId(departmentId);
        employee.setId(id);
        employee.setName(name);
        return employee;
    }

    public void updateEmployee(Employee employee, String name, int id, int departmentId){
        employee.setName(name);
        employee.setDepartmentId(departmentId);
        employee.setId(id);
    }
}
