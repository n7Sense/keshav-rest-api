package ns.keshav.controller;

import ns.keshav.domain.Employee;
import ns.keshav.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author nSense
 */

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    @GetMapping(value = "list")
    public List<Employee> index()  throws SQLException {
        return employeeService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String save(@RequestBody Employee employee   ) throws SQLException {
        employeeService.save(employee);
        return "CCREATE: Success";
    }

    @RequestMapping(method = RequestMethod.GET, value ="read/{employeeId}")
    public Employee showById(@PathVariable int employeeId) throws SQLException {
        return employeeService.findById(employeeId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String update(@RequestBody Employee employee) throws SQLException {
        employeeService.update(employee);
        return "UPDATE: success";
    }

    @RequestMapping(method = RequestMethod.POST, value = "delete/{employeeId}")
    public String delete(@PathVariable int employeeId) throws SQLException {
        employeeService.delete(employeeId);
        return "DELETE: success";
    }
}
