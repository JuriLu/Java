public class WhileLoopChallenge {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenNumbers = 0;
        int oddCount = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                oddCount++;
                continue;
            }

            evenNumbers++;
            System.out.println(number + " is even number. ");

            if(evenNumbers == 5) {
                break;
            }
        }
        System.out.println("Even Numbers counter: " + evenNumbers);
        System.out.println("Odd Numbers counter: " + oddCount);
//        while (number <= finishNumber) {
//            number++;
//            if(!isEvenNumber(number)) {continue;}
//            System.out.println("Even number " + number);
//        }

    }

    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }

}
