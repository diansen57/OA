package com.imooc.oa.biz;

import com.imooc.oa.entity.Employee;

import java.util.List;


public interface EmployeeBiz {
    void save(Employee employee);

    void update(Employee employee);

    void delete(String sn);

    Employee get(String sn);

    List<Employee> getAll();
}
