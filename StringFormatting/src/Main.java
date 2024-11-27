public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);
        System.out.printf("Your age is %f%n", (float) age);
        System.out.printf("Your age is %.2f%n", (float) age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth Year = %d%n", age, yearOfBirth);

        for(int i = 1; i <=10000; i*=10 ) {
//            System.out.printf("Printing %d %n", i);
            System.out.printf("Printing %6d %n", i); // Each number should fill up 6 spaces
        }

        String formattedString= String.format("Your age is %d",age);
        String formattedString2 = "Your age is %d".formatted(age);
        System.out.println(formattedString);
        System.out.println(formattedString2);
    }
}
