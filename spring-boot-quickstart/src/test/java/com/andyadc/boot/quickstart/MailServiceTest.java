package com.andyadc.boot.quickstart;

import com.andyadc.boot.quickstart.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author andaicheng
 * @version 2017/6/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Startup.class})
public class MailServiceTest {

    @Autowired
    private MailService mailService;

    @Test
    public void testMailSend() {
        mailService.sendSimpleMail("andaicheng@qq.com", "mail", "this is from spring boot");
    }
}
