package com.zyx.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyx.pay.entity.Pay;
import org.springframework.stereotype.Repository;

@Repository
public interface PayMapper extends BaseMapper<Pay> {

    void add(Pay pay);
}
