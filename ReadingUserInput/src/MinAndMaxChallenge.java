import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
                System.out.println("Please enter any number, or any other character to quit");
                String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);

                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }
        }

        if(loopCount > 0){
            System.out.println("Operation Quited. Highest number: " + min + ". Lowest number: " + max);
        } else{
            System.out.println("No valid data entered!");
        }


    }

}
