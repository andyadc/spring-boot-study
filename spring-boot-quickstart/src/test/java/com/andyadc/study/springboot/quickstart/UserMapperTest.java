package com.andyadc.study.springboot.quickstart;

import com.andyadc.study.springboot.quickstart.dao.UserMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author andaicheng
 * @version 2016/11/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Startup.class})
public class UserMapperTest {

    private static final Logger LOG = LoggerFactory.getLogger(UserMapperTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetById() {
        LOG.info("{}", userMapper.selectById(1L));
    }

    @Before
    public void before() {
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @After
    public void after() {
        LOG.info("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
