

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
        gumballMachine.setMoney(5);
        updateMoneyState();
    }
    
    public void insertDime() {
        gumballMachine.setMoney(10);
        updateMoneyState();
    }
    
    public void insertQuarter() {
        gumballMachine.setMoney(25);
        updateMoneyState();
    }
    
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
    
    public void ejectCoins() {
        if (gumballMachine.getMoney() == 0) {
            System.out.println("You haven't inserted any coins");
        }
        else {
            gumballMachine.setMoney(0);
            System.out.println("Your coins are returned");
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
