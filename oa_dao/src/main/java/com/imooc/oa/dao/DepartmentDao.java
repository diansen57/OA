package com.imooc.oa.dao;

import com.imooc.oa.entity.Department;
import org.springframework.stereotype.Repository;


import java.util.List;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Repository("DepartmentDao")
public interface DepartmentDao {
    void save(Department department);

    void update(Department department);

    void delete(String dsn);

    Department select(String dsn);

    List<Department> selectAll();
}
