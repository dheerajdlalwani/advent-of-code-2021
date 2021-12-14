import java.util.*;
import java.io.*;
public class BinaryDiagnostic_2 
{
	public static void main(String [] args) throws Exception
	{
		ArrayList<String> binaryInput1 = new ArrayList<String>(1000);
        ArrayList<String> binaryInput2 = new ArrayList<String>(1000);
		File file = new File("C:\\Users\\USER\\OneDrive\\Desktop\\advent_of_code\\day_03\\BinaryDiagnostic_input.txt");
		Scanner sc = new Scanner(file);
		System.out.println("Feeding the array now...");
		while (sc.hasNextLine())
		{
            String tempString = sc.next();
            binaryInput1.add(tempString);
            binaryInput2.add(tempString);
		}
        int index = 0;
        while(binaryInput1.size() > 1)
        {
            int tempSum = 0;
            for(int i = 0; i < binaryInput1.size(); i++)
            {
                tempSum += Character.getNumericValue(binaryInput1.get(i).charAt(index));
            }
            final int currentIndex = index;
            if(tempSum >= binaryInput1.size()/2.0)
            {
                binaryInput1.removeIf(input -> (input.charAt(currentIndex) == '0'));
            }
            else
            {
                binaryInput1.removeIf(input -> (input.charAt(currentIndex) == '1'));
            }
            index++;
        }
        index = 0;
        while(binaryInput2.size() > 1)
        {
            int tempSum = 0;
            for(int i = 0; i < binaryInput2.size(); i++)
            {
                tempSum += Character.getNumericValue(binaryInput2.get(i).charAt(index));
            }
            final int currentIndex = index;
            if(tempSum >= binaryInput2.size()/2.0)
            {
                binaryInput2.removeIf(input -> (input.charAt(currentIndex) == '1'));
            }
            else
            {
                binaryInput2.removeIf(input -> (input.charAt(currentIndex) == '0'));
            }
            index++;
        }
        int oxygenRating = Integer.parseInt(binaryInput1.get(0), 2);
        int carbondioxideRating = Integer.parseInt(binaryInput2.get(0), 2);
        System.out.println("Oxygen rating = " + oxygenRating);
        System.out.println("Carbon dioxide rating = " + carbondioxideRating);
        System.out.println("Required answer = " + (oxygenRating * carbondioxideRating));
    }       
}