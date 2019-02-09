

import java.util.Random;

public class HasMoneyState implements State {
    GumballMachine gumballMachine;
    
    public HasMoneyState(GumballMachine gumballMachine) {
    	this.gumballMachine = gumballMachine;
    }
    
    public void insertNickel() {
        
    }
    
    public void insertDime() {
        
    }
    
    public void insertQuarter() {
    	System.out.println("You can't insert another quarter");
    }
    
    public void ejectQuarter() {
    	System.out.println("Quarter returned");
    	gumballMachine.setState(gumballMachine.getNoMoneyState());
    }
    
    public void ejectCoins() {
    
    }
    
    public void turnCrank() {
    	System.out.println("You turned...");
    	gumballMachine.setState(gumballMachine.getSoldState());
    }
    
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
    	return "waiting for turn of crank";
    }
}
