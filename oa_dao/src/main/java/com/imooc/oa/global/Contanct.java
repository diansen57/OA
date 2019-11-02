package com.imooc.oa.global;

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public class Contanct {

    public final static String POST_STAFF = "员工";
    public final static String POST_FM = "部门经理";
    public final static String POST_GM = "总经理";
    public final static String POST_CASHIER = "财务";

    /**
     * 用于实现下拉列表
     *
     * @return
     */
    public static List<String> getPosts() {
        List<String> list = new ArrayList<>();
        list.add(POST_STAFF);
        list.add(POST_FM);
        list.add(POST_GM);
        list.add(POST_CASHIER);
        return list;
    }

    public static List<String> getItems() {
        List<String> list = new ArrayList<>();
        list.add("交通");
        list.add("餐饮");
        list.add("住宿");
        list.add("办公");
        return list;
    }

    //报销单状态
    public final static String CLAIMVOUCHER_CREATE = "新创建";
    public final static String CLAIMVOUCHER_SUBMIT = "已提交";
    public final static String CLAIMVOUCHER_APPROVED = "已审核";
    public final static String CLAIMVOUCHER_BACK = "已打回";
    public static final String CLAIMOUCHER_TERMINATED = "已终止";
    public static final String CLAIMOUCHER_RECHERCK = "待复核";
    public static final String CLAIMOUCHER_PAID = "已打款";


    public static final double LIMIT_CHECK = 5000.00;

    //处理方式
    public static final String DEAL_CREATE = "创建";
    public final static String DEAL_SUBMIT = "提交";
    public final static String DEAL_UPDATE = "修改";
    public static final String DEAL_BACK = "打回";
    public static final String DEAL_REJECT= "拒绝";
    public static final String DEAL_PASS= "通过";
    public static final String DEAL_PAID= "打款";

}
