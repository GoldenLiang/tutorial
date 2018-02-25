package com.lc.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by lc on 16-2-15.
 */
@Component
public class TaskJob {
    @Scheduled(cron = "0 0 0 1 * ?")
    public void job() {
        TermContainer.update();
    }
}
