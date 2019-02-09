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
            String s = (gumballMachine.getMoney() < 50) ?
                        " Add more money" : "";
            System.out.println("You inserted " + gumballMachine.getMoney() +
                           " cents in total." + s);
        }
    }
    
    public void insertNickel() {
        updateMoneyState(Constants.NICKEL);
    }
    
    public void insertDime() {
        updateMoneyState(Constants.DIME);
    }
    
    public void insertQuarter() {
        updateMoneyState(Constants.QUARTER);
    }
    
    public void insertDollar() {
        updateMoneyState(Constants.DOLLAR);
    }
    
    public void ejectCoins() {
        System.out.println("Your money is returned");
        gumballMachine.setMoney(-gumballMachine.getMoney());
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
