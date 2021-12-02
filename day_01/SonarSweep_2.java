import java.util.*;
import java.io.*;
public class SonarSweep_2 {
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
        int curr_sum = 0;
        for(int i = 0; i < 3; i++)
        {
            curr_sum += depth_measurements[i];
        }
        int window_sum = curr_sum;
		for (int i = 3; i < 2000; i++)
		{
            window_sum += depth_measurements[i] - depth_measurements[i-3];
            if(window_sum > curr_sum)
            {
                increments++;
            }
            curr_sum = window_sum;
		}
		System.out.println("Increments are: " + increments);
	}
}
