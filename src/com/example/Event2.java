package com.example;

import java.time.LocalDate;

/**
 * Created by LunaFlores on 12/20/16.
 */
public class Event2 {
    private String name;
    private Action action;
    private LocalDate al;

    public Event2() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
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

        Event2 event2 = (Event2) o;

        if (name != null ? !name.equals(event2.name) : event2.name != null) return false;
        if (action != event2.action) return false;
        return al != null ? al.equals(event2.al) : event2.al == null;
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
        return "Event2{" +
                "name='" + name + '\'' +
                ", action=" + action +
                ", al=" + al +
                '}';
    }
}
