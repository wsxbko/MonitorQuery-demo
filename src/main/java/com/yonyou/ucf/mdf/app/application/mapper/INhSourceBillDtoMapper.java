package com.yonyou.ucf.mdf.app.application.mapper;

import com.yonyou.ucf.mdf.app.application.dto.NhSourceBillDto;
import com.yonyou.ucf.mdf.app.application.req.NhSourceBillRequest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface INhSourceBillDtoMapper {
    List<NhSourceBillDto> searchNhSourceBillList (NhSourceBillRequest nhSourceBillRequest);

    int countTotal(NhSourceBillRequest nhSourceBillRequest);

}
