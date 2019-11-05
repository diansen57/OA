package com.imooc.oa.biz;

import com.imooc.oa.entity.Department;
import com.imooc.oa.entity.Employee;

import java.util.List;

public interface DepartmentBiz {
    void save(Department department);

    void update(Department department);

    void delete(String sn);

    Department get(String sn);

    List<Department> getAll();
}
