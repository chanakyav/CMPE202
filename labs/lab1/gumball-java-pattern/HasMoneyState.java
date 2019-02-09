

import java.util.Random;

public class HasMoneyState implements State {
    GumballMachine gumballMachine;
    
    public HasMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
   
    void updateMoneyState(int value) {
        if (gumballMachine.getMoney() >= 50) {
            System.out.println("You can't insert more coins");
        }
        else {
            gumballMachine.setMoney(value);
            if (gumballMachine.getMoney() < 50) {
                System.out.println("You inserted " + gumballMachine.getMoney() +
                                   " cents in total. Add more money");
            }
            else System.out.println("You inserted " + gumballMachine.getMoney() +
                                   " cents in total.");
        }
    }
    
    public void insertNickel() {
        updateMoneyState(5);
    }
    
    public void insertDime() {
        updateMoneyState(10);
    }
    
    public void insertQuarter() {
        updateMoneyState(25);
    }
    
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoMoneyState());
    }
    
    public void ejectCoins() {
        System.out.println("Your coins are returned");
        gumballMachine.setMoney(0);
        gumballMachine.setState(gumballMachine.getNoMoneyState());
    }
    
    public void turnCrank() {
        if (gumballMachine.getMoney() < 50) {
            System.out.println("You turned but you don't have enough money");
        }
        else {
            System.out.println("You turned...");
            gumballMachine.setMoney(-gumballMachine.getMoney());
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
    
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        if (gumballMachine.getMoney() < 50) {
            return "waiting for more coins";
        }
        else return "waiting for turn of crank";
    }
}
