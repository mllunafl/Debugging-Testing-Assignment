package com.example;

/**
 * Created by LunaFlores on 12/20/16.
 */
public interface Analytics {
    boolean addEvent(Event event) throws InterruptedException;
}
