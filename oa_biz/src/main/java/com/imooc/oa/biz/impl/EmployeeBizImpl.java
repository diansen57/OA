package com.imooc.oa.biz.impl;

import com.imooc.oa.biz.EmployeeBiz;
import com.imooc.oa.dao.EmployeeDao;
import com.imooc.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Service("employeeBiz")
public class EmployeeBizImpl implements EmployeeBiz {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    @Override
    public void delete(String sn) {
        employeeDao.delete(sn);
    }

    @Override
    public Employee get(String sn) {
        Employee employee = employeeDao.select(sn);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> list = employeeDao.selectAll();
        return list;
    }
}
