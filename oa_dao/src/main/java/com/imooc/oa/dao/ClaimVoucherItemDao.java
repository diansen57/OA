package com.imooc.oa.dao;

import com.imooc.oa.entity.ClaimVoucherItem;

import java.util.List;

/**
 * @author Administrator
 */
@SuppressWarnings("AlibabaClassMustHaveAuthor")
public interface ClaimVoucherItemDao {
    void save(ClaimVoucherItem claimVoucherItem);

    void update(ClaimVoucherItem claimVoucherItem);

    void delete(int id);

    List<ClaimVoucherItem> selectByClaimVoucher(int vid);
}
