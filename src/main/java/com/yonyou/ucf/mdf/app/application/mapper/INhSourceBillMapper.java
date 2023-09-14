package com.yonyou.ucf.mdf.app.application.mapper;


import com.yonyou.ucf.mdf.app.application.po.NhSourceBillPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface INhSourceBillMapper {
    void insertNhSourceBill(NhSourceBillPO nhSourceBillPO);

}
