
public class GumballMachine{

    private int num_gumballs, machine, money;

    public GumballMachine(int size, int machine) {
        // initialise instance variables
        this.num_gumballs = size;
        if (machine >= 1 && machine <= 3 ) {
            this.machine = machine;
        } else {
            System.out.println("Wrong machine type. Enter 1, 2, or 3");
            System.out.println("Setting to default: machine 1");
            this.machine = 1;
        }
    }

    public void insertCoin(int coin){
        if (this.machine != 3) {
            if(coin != 25) System.out.println("Please insert a quarter");
            else this.money += 25;
        } else {
            if (coin == 5) this.money += 5;
            else if (coin == 10) this.money += 10;
            else if (coin == 25) this.money += 25;           
            else System.out.println("Invalid coin. Insert a nickel, dime, or quarter");
        }
    }
    
    public void turnCrank() {
        if (this.money != 0) {
            if (this.num_gumballs > 0) {               
                if (this.machine == 1 && this.money == 25) giveGumball();
                
                else if (this.machine == 2 && this.money == 50) giveGumball();
                //else System.out.println("Please insert a quarter");
                
                else if (this.machine == 3 && this.money >= 50) giveGumball();
                else System.out.println("Please insert another coin");
            } else {
                System.out.println("No More Gumballs! Sorry, can't return your money.");
            }
        } else {
            System.out.println("Please insert a coin") ;
        }         
    }
   
    public void giveGumball() {
        this.num_gumballs--;
        this.money = 0;
        System.out.println("Thank you. Gumball Ejected!");
    }
}
