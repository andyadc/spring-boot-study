package com.andyadc.boot.quickstart.dao;

import com.andyadc.boot.quickstart.domain.User;
import com.andyadc.boot.quickstart.repository.MyBatisRepository;

/**
 * @author andaicheng
 * @version 2016/11/28
 */
@MyBatisRepository
public interface UserMapper {

    User selectById(Long id);
}
