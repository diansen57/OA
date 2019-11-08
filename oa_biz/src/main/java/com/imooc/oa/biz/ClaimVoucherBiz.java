package com.imooc.oa.biz;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.ClaimVoucherItem;
import com.imooc.oa.entity.DealRecord;

import java.util.List;

/**
 * @author Administrator
 */
public interface ClaimVoucherBiz {
    /**
     * 保存
     * @param claimVoucher
     * @param items
     */
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    /**
     *
     * @param id
     * @return
     */
    ClaimVoucher get(int id);//根据id,查询报销单
    List<ClaimVoucherItem> getItems(int cvid);//查询报销单明细
    List<DealRecord> getRecords(int cvid);//查询处理记录

    List<ClaimVoucher> getForSelf(String sn);//根据申请人查询

    List<ClaimVoucher> getForDeal(String sn);//根据处理人查询

    void update(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    void submit(int id);

    void deal(DealRecord dealRecord);
}
