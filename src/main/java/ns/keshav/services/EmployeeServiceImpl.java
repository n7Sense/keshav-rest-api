package ns.keshav.services;

import ns.keshav.dao.EmployeeDao;
import ns.keshav.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @author nSense
 */

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void save(Employee emp) {
        employeeDao.save(emp);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void delete(int employeeId) {
        employeeDao.delete(employeeId);
    }

    @Override
    public Employee findById(int employeeId) {
        return employeeDao.findById(employeeId);
    }
}
