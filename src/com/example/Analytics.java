package com.example;

/**
 * Created by LunaFlores on 12/20/16.
 */
public interface Analytics {
    @Deprecated
    boolean addEvent(Event event) throws InterruptedException;

    boolean addEvent(Event2 event2) throws InterruptedException;

}
