package com.example;

import java.time.LocalDate;

/**
 * Created by LunaFlores on 12/20/16.
 */
public class Event {
    private String name;
    private String action;
    private LocalDate al;

    public Event() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDate getAl() {
        return al;
    }

    public void setAl(LocalDate al) {
        this.al = al;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (name != null ? !name.equals(event.name) : event.name != null) return false;
        if (action != null ? !action.equals(event.action) : event.action != null) return false;
        return al != null ? al.equals(event.al) : event.al == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (al != null ? al.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", action='" + action + '\'' +
                ", al=" + al +
                '}';
    }
}
