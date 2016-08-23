/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendisantika;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author hendisantika
 */
@Component
public class MyScheduledTasks {

    private static final SimpleDateFormat dateFormat
            = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    @Scheduled(fixedRate = 10000)
    public void sendMailToCustomers() {

        System.out.println("sendMailToCustomers Job ran at "
                + dateFormat.format(new Date()));

    }
}
