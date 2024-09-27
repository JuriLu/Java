public class Main {

    public static void main(String[] args) {

        int j = 1;
        boolean isReady = false;

//        do  {
//            if (j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isReady = (j > 0);
//        } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;
            if(number % 25 == 0){
                continue; // skips iteration for 25 and 50 in this case
            }
            System.out.print(number + "_");
        }
    }

}
