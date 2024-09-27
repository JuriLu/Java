public class MethodOverloadingChallenge {

    public static void main(String[] args) {
        System.out.println("Height of 6ft, 5in man = " + convertToCentimeters(6,5));
        System.out.println("Height 68in man = " + convertToCentimeters(68) + "cm");

    }

    public static double convertToCentimeters(int heightInInches){
        return (double) (heightInInches * 2.54);
    }

    public static double convertToCentimeters(int heightInFeet, int remHeightInInches){
       int totalHeightInch = ( heightInFeet * 12) + remHeightInInches;
        return convertToCentimeters(totalHeightInch);
    }

}
