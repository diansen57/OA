package com.imooc.oa.biz;

import com.imooc.oa.entity.Employee;

/**
 * @author Administrator
 */
@SuppressWarnings("AlibabaClassMustHaveAuthor")
public interface GlobalBiz {
    Employee login(String sn, String password);
    void changePassword(Employee employee);
}
