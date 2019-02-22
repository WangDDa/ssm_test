package com.itheima.service;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsService {
    public Items findById(Integer id);
}
