package com.yonyou.ucf.mdf.app.application.mapper;


import com.yonyou.ucf.mdf.app.application.po.NhSourceBill;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface INhSourceBillMapper {
    void insertNhSourceBill(NhSourceBill nhSourceBill);

}
