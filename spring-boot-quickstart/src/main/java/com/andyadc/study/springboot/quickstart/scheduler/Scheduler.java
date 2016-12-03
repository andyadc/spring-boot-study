package com.andyadc.study.springboot.quickstart.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author andaicheng
 * @version 2016/12/1
 */
@Component
public class Scheduler {

    private static final Logger LOG = LoggerFactory.getLogger(Scheduler.class);

    @Scheduled(fixedRate = 20000)
    public void testTask() {
        LOG.info("每20秒执行一次...");
    }

    @Scheduled(cron = "10/5 * * * * ?")
    public void testCron() {
        LOG.info("每5秒执行一次...");
    }
}
