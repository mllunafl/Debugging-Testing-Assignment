package com.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by LunaFlores on 12/20/16.
 */
public class AnalyticsImpl implements Analytics {
    static Random random = new Random();

    private static final Logger LOGGER = Logger.getLogger("com.example");
    Instant start = Instant.now();
    @Override
    @Deprecated
    public boolean addEvent(Event event)  {
        if (event == null) {
            throw new IllegalArgumentException("Parameter can not be null");
        }
        if (event.getName() == null || event.getAction() == null || event.getAl() == null) {
            throw new IllegalArgumentException("No parameter can not be null");
        }

        if(!(event.getAction().equals("Face2Face") || event.getAction().equals("PhoneCall")|| event.getAction().equals("TextMessaging")||event.getAction().equals("Unknown"))){
            throw new IllegalArgumentException("Name can only be 1 of 4");
        }
        System.out.println(event);

        if (random.nextInt(10) == 5) {
            throw new IllegalArgumentException("I hava a bug in my code");
        }
        try {
            Thread.sleep(random.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();

        LOGGER.info("Duration for method to run " + String.valueOf(Duration.between(start,end)));
        return false;
    }

    @Override
    public boolean addEvent(Event2 event2) {
        if (event2 == null) {
            throw new IllegalArgumentException("Parameter can not be null");
        }
        if (event2.getName() == null || event2.getAction() == null || event2.getAl() == null) {
            throw new IllegalArgumentException("No parameter can not be null");
        }

        System.out.println(event2);

        if (random.nextInt(10) == 5) {
            throw new IllegalArgumentException("I hava a bug in my code");
        }
        try {
            Thread.sleep(random.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();

        LOGGER.info("Duration for method to run " + String.valueOf(Duration.between(start,end)));

        return false;
    }
}
