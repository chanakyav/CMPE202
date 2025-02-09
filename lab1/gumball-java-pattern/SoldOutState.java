

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertNickel() {
        System.out.println("You can't insert a coin, the machine is sold out");
    }
    
    public void insertDime() {
        System.out.println("You can't insert a coin, the machine is sold out");
    }
    
    public void insertQuarter() {
        System.out.println("You can't insert a coin, the machine is sold out");
    }
    
    public void insertDollar() {
        System.out.println("You can't eject, you haven't inserted a coin yet");
    }
    
    public void ejectCoins() {
        System.out.println("You can't eject, you haven't inserted a coin yet");
    }
    
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }
    
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    public void reset() {
        System.out.println("Resetting to new machine");
    }
    public String toString() {
        return "sold out";
    }
}
