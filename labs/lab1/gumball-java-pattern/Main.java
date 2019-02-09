

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
    
        System.out.println(gumballMachine);

	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();

	System.out.println(gumballMachine);

	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	gumballMachine.insertQuarter();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();

	System.out.println(gumballMachine);
	
	for(int i=0; i<5; i++) gumballMachine.insertDime();
	gumballMachine.turnCrank();
	
	gumballMachine.insertNickel();
	gumballMachine.insertQuarter();
	gumballMachine.insertQuarter();
	gumballMachine.ejectCoins();
	gumballMachine.turnCrank();
	
	gumballMachine.insertQuarter();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	
	System.out.println(gumballMachine);
	
	gumballMachine.insertQuarter();
	gumballMachine.ejectCoins();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	
	System.out.println(gumballMachine);
    }
}
