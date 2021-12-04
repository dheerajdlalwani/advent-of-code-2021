import java.util.*;
import java.io.*;
public class Dive_2 {
	public static void main(String [] args) throws Exception
	{
		String [] directions;
        int [] distance;
		directions = new String [1000];
        distance = new int [1000];
        int x = 0, y = 0, aim = 0;
		File file = new File("C:\\Users\\USER\\OneDrive\\Desktop\\advent_of_code\\day_02\\Dive_input.txt");
		Scanner sc = new Scanner(file);
		int count = 0;
		System.out.println("Feeding the array now...");
		while (sc.hasNextLine())
		{
			directions[count] = sc.next();
            distance[count] = Integer.parseInt(sc.next());
			count++;
		}
        for(int i = 0; i < 1000; i++)
        {
            if(directions[i].equals("down"))
            {
                aim += distance[i];
            }
            else if(directions[i].equals("up"))
            {
                aim -= distance[i]; 
            }
            else
            {
                x += distance[i];
                y += distance[i] * aim;
            }
        }
        System.out.println("The required answer = " + (x * y));
	}
}