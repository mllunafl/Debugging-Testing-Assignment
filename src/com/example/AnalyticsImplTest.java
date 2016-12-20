package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

/**
 * Created by LunaFlores on 12/20/16.
 */
public class AnalyticsImplTest {
    AnalyticsImpl analytics = new AnalyticsImpl();
    Random random = new Random();

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    @Test
    public void testAddEvent() {
        try {
            analytics.addEvent((Event)null);
            fail("addEvent that is null should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {

        }
        try {
            Event event = new Event();
            analytics.addEvent(event);
            fail("addEvent that has an empty even should have thrown IllegalAgumentExcpetion");
        } catch (IllegalArgumentException e) {

        }
        try {
            Event event = new Event();
            event.setName("Good Name");
            event.setAction("PhoneCall");
            analytics.addEvent(event);
            fail("addEvent that has one empty parameter should have thrown IllegalAgumentExcpetion");
        } catch (IllegalArgumentException e) {

        }
        try {
            Event event = new Event();
            event.setAction("TextMessaging");
            event.setAl(LocalDate.now());
            analytics.addEvent(event);
            fail("addEvent that has one empty parameter should have thrown IllegalAgumentExcpetion");
        } catch (IllegalArgumentException e) {

        }
        try {
            Event event = new Event();
            event.setName("Good Name");
            event.setAl(LocalDate.now());
            analytics.addEvent(event);
            fail("addEvent that has one empty parameter should have thrown IllegalAgumentExcpetion");
        } catch (IllegalArgumentException e) {

        }
        try {
            Event event = new Event();
            event.setName("Good Name");
            event.setAction("Bad Action");
            event.setAl(LocalDate.now());
            analytics.addEvent(event);
            fail("Name can only be 1 of 4 should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {

        }

        Event event = new Event();
        event.setName("Good Name");
        event.setAction("Face2Face");
        event.setAl(LocalDate.now());
        analytics.addEvent(event);


    }

    @Test
    public void testAddEvent2() {
        try {
            analytics.addEvent((Event2)null);
            fail("addEvent that is null should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e){

        }

        try {
            Event2 event2 = new Event2();
            event2.setName("Good Name");
            event2.setAction(Action.TextMessaging);
            analytics.addEvent(event2);
            fail("No parameter can be null");
        } catch (IllegalArgumentException e){

        }

        try {
            Event2 event2 = new Event2();
            event2.setName("Good Name");
            event2.setAl(LocalDate.now());
            analytics.addEvent(event2);
            fail("No parameter can be null");
        } catch (IllegalArgumentException e){

        }

        try {
            Event2 event2 = new Event2();
            event2.setAction(Action.TextMessaging);
            event2.setAl(LocalDate.now());
            analytics.addEvent(event2);
            fail("No parameter can be null");
        } catch (IllegalArgumentException e){

        }


        Event2 event2 = new Event2();
        event2.setName("Good Name");
        event2.setAction(Action.Unknown);
        event2.setAl(LocalDate.now());
        analytics.addEvent(event2);
    }
}
