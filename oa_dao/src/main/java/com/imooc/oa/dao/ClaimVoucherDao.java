package com.imooc.oa.dao;

import com.imooc.oa.entity.ClaimVoucher;

import java.util.List;

/**
 * @author Administrator
 */
public interface ClaimVoucherDao {
    void save(ClaimVoucher claimVoucher);

    void update(ClaimVoucher claimVoucher);

    void delete(int vid);

    ClaimVoucher select(int vid);

    List<ClaimVoucher> selectByCreateSn(String csn);

    List<ClaimVoucher> selectByNextSn(String ndsn);
}
