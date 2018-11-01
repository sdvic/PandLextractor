import javax.swing.JOptionPane;

/***********************************************************************
 * Hack The Bank Part 1 Recipe copyright 2016 Wintriss Technical Schools
 ***********************************************************************/
// Part 1
public class Hacker
{
    public BankA bankA = new BankA();

    public static void main(String[] args)
    {
	new Hacker().getGoing();
    }

    // private void getGoing()
    // {
    // int hackerBankAccountBalance = 0;
    // JOptionPane.showMessageDialog(null, "The account number and password for
    // Bank A, customer 1 is "
    // + bankA.customer1AccountNumber + "....." + bankA.customer1Password + ".
    // Customer 1 has $" + bankA.customer1Balance + " in it. Go get it!");
    // bankA.logInBankA();
    // hackerBankAccountBalance = bankA.customer1Balance - 1;
    // bankA.customer1Balance = 1;
    // JOptionPane.showMessageDialog(null, "Bank A's customer #1 customer now
    // has $" + bankA.customer1Balance + " in it and our hacker account has $" +
    // hackerBankAccountBalance + " in it.");
    // }

    // }

    // Part 2

/***********************************************************************
 * Hack The Bank Part 2 Recipe copyright 2016 Wintriss Technical Schools
 ***********************************************************************/
    public void getGoing()
    {
	 for (int i = 0; i < 100000; i++) 
	 {
	     if (i == bankA.customer2Password)
	     {
	     System.out.println(hackerBankAccount = hackerBankAccount + bankA.customer2Balance - 1;
	     bankA.customer2Balance = 1;
	     System.out.println("Customer 2 at Bank A now has $" +
	     bankA.customer2Balance
	     + " in their account, and my account now has $" + hackerBankAccount +
	     " in it.");
	     break;
 }
    }
}
}