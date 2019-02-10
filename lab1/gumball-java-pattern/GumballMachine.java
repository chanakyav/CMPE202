 
public class GumballMachine {
     
    State soldOutState;
    State noMoneyState;
    State hasMoneyState;
    State soldState;
    
    State state = soldOutState;
    private int count = 0, money = 0, machine = 0, cost = 0;
    
    public GumballMachine(int numberGumballs, int machine) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
      
        this.count = numberGumballs;
        if (machine >= 1 && machine <= 3 ) {
            this.machine = machine;
        } else {
            System.out.println("Wrong machine type. Enter 1, 2, or 3");
            System.out.println("Setting to default: machine 1");
            this.machine = Constants.MACH_ONE;
        }
        setCost();
        
        if (numberGumballs > 0) {
            state = noMoneyState;
        } 
    }
    
    public void insertNickel() {
        state.insertNickel();
    }
    
    public void insertDime() {
        state.insertDime();
    }
    
    public void insertQuarter() {
        state.insertQuarter();
    }
    
    public void insertDollar() {
        state.insertDollar();
    }
    
    public void ejectCoins() {
        state.ejectCoins();
    }
    
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    
    public void reset() {
        state.reset();
        refill(count);   
    }
    
    void setState(State state) {
        this.state = state;
    }
    
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
    
    int getCount() {
        return count;
    }
    
    int getMoney() {
        return money;
    }
    
    int getCost() {
        return cost;
    }
    
    int getMachine() {
        return machine;
    }
    
    void setMoney(int money) {
        this.money += money;
    }
    
    void setMachine(int machine) {
        if (machine >= 1 && machine <= 3 ) {
            this.machine = machine;
            reset();
        } else {
            System.out.println("Wrong machine type. Enter 1, 2, or 3");
            System.out.println("Setting to default: machine 1");
            this.machine = Constants.MACH_ONE;
        }
        setCost();
    }
    
    void setCost() {
        if (machine == 1) {
            this.cost = Constants.COST_TYPE_1;
        } else {
            this.cost = Constants.COST_TYPE_2;
        }
    }

    void refill(int count) {
        this.count = count;
        state = noMoneyState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine Type: " + machine + "\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
