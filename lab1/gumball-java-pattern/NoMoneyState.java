
public class NoMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    private void updateMoneyState(int value) {
        gumballMachine.setMoney(value);
        String s = (gumballMachine.getMoney() < gumballMachine.getCost()) ? " Add more money" : "";
        System.out.println("You inserted " + gumballMachine.getMoney() +
                           " cents in total." + s);
        gumballMachine.setState(gumballMachine.getHasMoneyState());
    }
    
    public void insertNickel() {
        if (gumballMachine.getMachine() == 3) {
            updateMoneyState(Constants.NICKEL);
        } else {
            System.out.println("Please insert a quarter");
        }
    }
    
    public void insertDime() {
        if (gumballMachine.getMachine() == 3) {
            updateMoneyState(Constants.DIME);
        } else {
            System.out.println("Please insert a quarter");
        }
    }
    
    public void insertQuarter() {
        updateMoneyState(Constants.QUARTER);
    }
    
    public void insertDollar() {
        if (gumballMachine.getMachine() == 3) {
            updateMoneyState(Constants.DOLLAR);
        } else {
            System.out.println("Please insert a quarter");
        }
    }
    
    public void ejectCoins() {
        if (gumballMachine.getMoney() == 0) {
            System.out.println("You haven't inserted any coins");
        } else {
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
    
    public void reset() {
        System.out.println("Resetting to new machine");
        ejectCoins();
    }

    public String toString() {
        return "waiting for coins";
    }
}
