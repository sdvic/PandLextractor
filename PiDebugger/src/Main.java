



public class Main
{
    public static void main(String[] args) throws Exception
    {
	System.out.println("New board...3/24 0830");
	new Main().getGoing();
    }

    private void getGoing()
    {
	System.out.println("GetGoing()");
	Sonar sonar = new Sonar();
	while(true)
	{
	    try
	    {
		System.out.print(sonar.readSonar("left") + " L\n");
		Thread.sleep(100);
		System.out.print(sonar.readSonar("center") +  " C\n");
		Thread.sleep(100);
		System.out.print(sonar.readSonar("right") + " R\n");
		Thread.sleep(100);
	    } catch (Exception e)
	    {
		System.out.println("readSonar exception");
	    }
	}
    }
}
