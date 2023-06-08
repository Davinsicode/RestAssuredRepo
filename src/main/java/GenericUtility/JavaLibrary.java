package GenericUtility;

import java.util.Random;

public class JavaLibrary 
{
	public int randomNumber()
	{
		Random r = new Random(500);
		int num = r.nextInt();
		return num;
	}
}
