

public class NoMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NoMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertNickel() {
        
    }
    
    public void insertDime() {
        
    }
    
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasMoneyState());
    }
    
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
    
    public void ejectCoins() {
        
    }
    
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
    
    public void dispense() {
        System.out.println("You need to pay first");
    } 
    
    public String toString() {
        return "waiting for quarter";
    }
}
