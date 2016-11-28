package com.andyadc.study.springboot.quickstart.dao;

import com.andyadc.study.springboot.quickstart.domain.User;
import com.andyadc.study.springboot.quickstart.repository.MyBatisRepository;

/**
 * @author andaicheng
 * @version 2016/11/28
 */
@MyBatisRepository
public interface UserMapper {

    User selectById(Long id);
}
