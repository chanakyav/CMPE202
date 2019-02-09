

public class NoMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    void updateMoneyState() {
        System.out.println("You inserted " + gumballMachine.getMoney() +
                           " cents in total. Add more money");
        gumballMachine.setState(gumballMachine.getHasMoneyState());
    }
    
    public void insertNickel() {
        gumballMachine.setMoney(Constants.NICKEL);
        updateMoneyState();
    }
    
    public void insertDime() {
        gumballMachine.setMoney(Constants.DIME);
        updateMoneyState();
    }
    
    public void insertQuarter() {
        gumballMachine.setMoney(Constants.QUARTER);
        updateMoneyState();
    }
    
    public void ejectCoins() {
        if (gumballMachine.getMoney() == 0) {
            System.out.println("You haven't inserted any coins");
        }
        else {
            gumballMachine.setMoney(-gumballMachine.getMoney());
            System.out.println("Your money is returned");
        }
    }
    
    public void turnCrank() {
        System.out.println("You turned, but there's not enough coins");
     }
    
    public void dispense() {
        System.out.println("You need to pay first");
    } 
    
    public String toString() {
        return "waiting for coins";
    }
}
