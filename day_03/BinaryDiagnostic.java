import java.util.*;
import java.io.*;
public class BinaryDiagnostic {
	public static void main(String [] args) throws Exception
	{
		int [] binarySum;
		binarySum = new int [12];
		File file = new File("C:\\Users\\USER\\OneDrive\\Desktop\\advent_of_code\\day_03\\BinaryDiagnostic_input.txt");
		Scanner sc = new Scanner(file);
		int count = 0;
		System.out.println("Feeding the array now...");
        String tempString, gammaRate="", epsilonRate="";
        int gamma, epsilon;
		while (sc.hasNextLine())
		{
			tempString = sc.next();
            for(int i = 0; i < 12; i++)
            {
                binarySum[i] += Character.getNumericValue(tempString.charAt(i));
            }
			count++;
		}
        for(int i = 0; i < 12; i++)
        {
            if(binarySum[i] > 500)
            {
                gammaRate += "1";
                epsilonRate += "0";
            }
            else
            {
                gammaRate += "0";
                epsilonRate += "1";
            }
        }
        System.out.print("binarySum = ");
        for(int i = 0; i < 12; i++)
        {
            System.out.print(binarySum[i] + " | ");   
        }
        gamma = Integer.parseInt(gammaRate, 2);
        epsilon = Integer.parseInt(epsilonRate, 2);
        System.out.println("Gamma = " + gamma);
        System.out.println("Epsilon = " + epsilon);
        System.out.println("The power consumption of the submarine is: "  + (gamma*epsilon));
	}
}