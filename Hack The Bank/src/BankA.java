import javax.swing.JOptionPane;

//Part 1

/***********************************************************************
 * Hack The Bank Part 1 Recipe copyright 2016 Wintriss Technical Schools
 ***********************************************************************/
//public class BankA
//{
//    public int customer1Balance = 500;
//    public int customer1Password = 12345;
//    public int customer1AccountNumber = 88888;
//
//    public void logInBankA()
//    {
//	int trialNumber;
//	trialNumber = Integer
//		.parseInt(JOptionPane.showInputDialog("Welcome to Bank A.  Please enter your account number"));
//	if (trialNumber == customer1AccountNumber)
//	{
//	    trialNumber = Integer
//		    .parseInt(JOptionPane.showInputDialog("Welcome to Bank A.  Please enter your password"));
//	    if (trialNumber == customer1Password)
//	    {
//		JOptionPane.showMessageDialog(null, "You are logged in.");
//	    } else
//	    {
//		JOptionPane.showMessageDialog(null, "Incorrect password.");
//		return;
//	    }
//	} else
//	{
//	    JOptionPane.showMessageDialog(null, "Incorrect password.");
//	}
//    }
//
//    public int getCustomer1Balance()
//    {
//	return customer1Balance;
//    }
//
//    public void setCustomer1Balance(int customer1Balance)
//    {
//	this.customer1Balance = customer1Balance;
//    }
//
//    public int getCustomer1Password()
//    {
//	return customer1Password;
//    }
//}
/***********************************************************************
 * Hack The Bank Part 2 Recipe copyright 2016 Wintriss Technical Schools
 ***********************************************************************/
public class BankA
{
    private int customer1Balance = 500;
    private int customer1Password = 12345;
    private int customer1AccountNumber = 88888;

    public void logInBankA()
    {
	int trialNumber;
	trialNumber = Integer
		.parseInt(JOptionPane.showInputDialog("Welcome to Bank A.  Please enter your account number"));
	if (trialNumber == customer1AccountNumber)
	{
	    trialNumber = Integer
		    .parseInt(JOptionPane.showInputDialog("Welcome to Bank A.  Please enter your password"));
	    if (trialNumber == customer1Password)
	    {
		JOptionPane.showMessageDialog(null, "You are logged in.");
	    } else
	    {
		JOptionPane.showMessageDialog(null, "Incorrect password.");
		return;
	    }
	} else
	{
	    JOptionPane.showMessageDialog(null, "Incorrect password.");
	}
    }

    public int getCustomer1Balance()
    {
	return customer1Balance;
    }

    public void setCustomer1Balance(int customer1Balance)
    {
	this.customer1Balance = customer1Balance;
    }

    public int getCustomer1Password()
    {
	return customer1Password;
    }
}

