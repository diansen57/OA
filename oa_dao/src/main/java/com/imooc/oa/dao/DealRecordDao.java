package com.imooc.oa.dao;

import com.imooc.oa.entity.DealRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Repository("DealRecordDao")
public interface DealRecordDao {
    void save(DealRecord dealRecord);

    List<DealRecord> selectByClaimVoucher(int cvid);
}
