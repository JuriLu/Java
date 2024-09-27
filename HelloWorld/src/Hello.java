public class Hello {

    public static void main(String[] args) {

    double myDouble = 20.00d;
    double mySecondDouble = 80.00d;
    double sumOfDoubled = (myDouble + mySecondDouble) * 100.00d;
    System.out.println(sumOfDoubled);

    double reminder = sumOfDoubled % 40.00d;
    System.out.println(reminder);

    boolean isZero = (reminder == 0.00d) ? true : false;

    System.out.println(isZero);

    if (!isZero) {
    System.out.println("Got some remainder");}
    }

}