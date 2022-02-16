package LearningFiles;
import java.io.*;

public class Main 
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("output.txt"));
			bw.write("Salut\n");
			bw.write("Asta e alta linie.");
			bw.close();
		
		}
		catch(Exception error)
		{
			return;
		}

	}

}
