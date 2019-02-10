
public class test {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,Constants.MACH_ONE);
    
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        //gumballMachine.turnCrank();
        
        gumballMachine.setMachine(Constants.MACH_TWO);
	System.out.println(gumballMachine);
	
	gumballMachine.insertQuarter();
	gumballMachine.insertDime();
	gumballMachine.insertNickel();
	gumballMachine.turnCrank();
	
	System.out.println(gumballMachine);
    }
}
