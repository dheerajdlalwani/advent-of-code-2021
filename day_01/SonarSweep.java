import java.util.*;
import java.io.*;
public class SonarSweep {
	public static void main(String [] args) throws Exception
	{
		int [] depth_measurements;
		depth_measurements = new int [2000];
		File file = new File("C:\\Users\\USER\\OneDrive\\Desktop\\advent_of_code\\day_01\\SonarSweep_input.txt");
		Scanner sc = new Scanner(file);
		int count = 0;
		System.out.println("Feeding the array now...");
		while (sc.hasNextLine())
		{
			depth_measurements[count] = Integer.parseInt(sc.nextLine());
			count++;
		}
		// System.out.println("Printing the array now...");
		int increments = 0;
		for (int i = 1; i < 2000; i++)
		{
			// System.out.print(i + " -> ");
			// System.out.print(depth_measurements[i] + "\n");
			if(depth_measurements[i-1] < depth_measurements[i])
			{
				increments++;
			}
		}
		System.out.println("Increments are: " + increments);
	}
}