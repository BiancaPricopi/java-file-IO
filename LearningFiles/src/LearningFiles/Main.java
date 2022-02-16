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
		try
		{
			BufferedWriter copy = new BufferedWriter(
					new FileWriter("output-copy.txt"));
			BufferedReader br = new BufferedReader(
					new FileReader("output.txt"));
			String row;
			while((row = br.readLine()) != null)
			{
				System.out.println(row);
				copy.write(row + "\n");
			}
			br.close();
			copy.close();
		}
		catch(Exception error)
		{
			return;
		}
	}
}
