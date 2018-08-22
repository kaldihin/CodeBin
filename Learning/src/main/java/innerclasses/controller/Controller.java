package innerclasses.controller;

import java.util.*;

public class Controller {
    private List<Event> eventList = new LinkedList<Event>();
    Iterator<Event> iterEv = eventList.iterator();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (iterEv.hasNext())
            for (Event e : new LinkedList<Event>(eventList))
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
                iterEv.next();
    }
}
