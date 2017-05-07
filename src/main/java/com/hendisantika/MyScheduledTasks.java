/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendisantika;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hendisantika
 */
@Component
public class MyScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(MyScheduledTasks.class);

    private static final SimpleDateFormat dateFormat
            = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void sendMailToCustomers() {

        log.info("sendMailToCustomers Job ran at "
                + dateFormat.format(new Date()));

    }

    @Scheduled(cron = "0/10 * * * * *")
    public void runEvery10Sec() {
        log.info("Cron expression - Run every 10 second - " + dateFormat.format(new Date()));
    }
}
