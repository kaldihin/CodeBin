package innerclasses.controller;

import innerclasses.controller.*;

import java.util.List;

public class GreenhouseControls extends Controller {
    public static boolean optionStatus = true;

    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is ON";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is OFF";
        }
    }

    private boolean aircycle = false;

    public class AirCycleOn extends Event {
        public AirCycleOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            aircycle = true;
        }

        @Override
        public String toString() {
            return "AirCycling is ON";
        }
    }

    public class AirCycleOff extends Event {
        public AirCycleOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            aircycle = false;
        }

        @Override
        public String toString() {
            return "AirCycling is OFF";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            if (optionStatus == true)
            water = true;
        }

        @Override
        public String toString() {
            if (optionStatus == true)
                return "Water is ON";
            else return "Option is absent";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            if (optionStatus == true)
            water = false;
        }

        @Override
        public String toString() {
            if (optionStatus == true)
                return "Water is OFF";
            else return "Option is absent";
        }
    }

    private String thermostat = "Day";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat uses Night mode";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat uses Day mode";
        }
    }

    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bam!";
        }
    }

    public class Restart extends Event {
        private List<Event> eventList;

        public Restart(long delayTime, List<Event> eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Reset of the System";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Shutdown";
        }
    }
}