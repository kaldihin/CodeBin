package innerclasses.controller;

import innerclasses.controller.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.LinkedList;

class Optioned extends GreenhouseControls {

    public class OptionSwitcher extends Event {
        private int counter = 0;

        OptionSwitcher(long delayTime) {

            super(delayTime);

        }

        public void switcher() {
            if (counter % 2 == 0)
                optionStatus = false;
            else optionStatus = true;
            counter++;
        }

        @Override
        public void action() {

        }

        @Override
        public String toString() {

            if (optionStatus == false)
            return "Option OFF";
            else return "Option ON";
        }
    }
}

public class GreenhouseController {
    public static void main(String[] args) throws IOException {
        args = new String[1];
        args[0] = "5000";
        Optioned gc = new Optioned();
        Optioned.OptionSwitcher ss = gc.new OptionSwitcher(900);
        gc.addEvent(gc.new Bell(900));
        ss.switcher();
        ss.switcher();
        LinkedList<Event> e = new LinkedList<>();
        BufferedReader br;
        String s;
        try { br = new BufferedReader(new FileReader("C:\\Users\\Женёк\\Desktop\\Main\\Java\\Learning\\src\\innerclasses\\controller\\options.txt"));
            while ((s = br.readLine()) != null) {
                String[] s1 = s.split(" ");
                int i = Integer.parseInt(s1[1]);
                switch (s1[0]) {
                    case "ThermoStatNight" : e.add(gc.new ThermostatNight(i));
                        break;
                    case "LightOn" : e.add(gc.new LightOn(i));
                        break;
                    case "LightOff" : e.add(gc.new WaterOn(i));
                        break;
                    case "WaterOn" : e.add(gc.new WaterOn(i));
                        break;
                    case "WaterOff" : e.add(gc.new WaterOff(i));
                        break;
                    case "AirCycleOn" : e.add(gc.new AirCycleOn(i));
                        break;
                    case "AirCycleOff" : e.add(gc.new AirCycleOff(i));
                        break;
                    case "ThermostatDay" : e.add(gc.new ThermostatDay(i));
                        break;
                }
            }
            br.close();
        } catch (IOException exc) {
            System.out.println("Not found" + exc);
        }

        gc.addEvent(gc.new Restart(2000, e));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));

        gc.run();
    }
}
