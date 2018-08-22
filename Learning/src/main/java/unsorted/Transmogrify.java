package unsorted;

class Actor {

    public void act() {
        System.out.println("Act happened");
    }
}

class HappyActor extends Actor {

    public void act() {
        System.out.println("unsorted.HappyActor");
    }
}

class SadActor extends Actor {

    public void act() {
        System.out.println("unsorted.SadActor");
    }
}

class Stage {

    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}

class AlertStatus {

    public void alert() {
        System.out.println("Alert!!!");
    }

}

class Low extends AlertStatus{

    public void alert() {
        super.alert();
        System.out.println("unsorted.Low level of Dangerous");
    }
}

class Middle extends AlertStatus{

    public void alert() {
        System.out.println("unsorted.Middle level of Dangerous");
    }
}

class High extends AlertStatus{

    public void alert() {
        System.out.println("unsorted.High level of Dangerous");
    }
}

class Starship {

    private AlertStatus alertStatus = new AlertStatus();

    public void changeLow() {
        alertStatus = new Low();
    }

    public void changeMiddle() {
        alertStatus = new Middle();
    }

    public void changeHigh() {
        alertStatus = new High();
    }

    public void showAlert() {
        alertStatus.alert();
    }
}

public class Transmogrify {

    public static void main(String[] args) {

        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();

        Starship ship = new Starship();
        ship.changeLow();
        ship.showAlert();
        ship.changeHigh();
        ship.showAlert();
        ship.changeMiddle();
        ship.showAlert();
    }
}
