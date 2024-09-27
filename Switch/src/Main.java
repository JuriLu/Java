public class Main {

    public static void main(String[] args) {

        int switchValue = 4;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4 or a 5");
                System.out.println("Actual value was: " + switchValue);
            }
            default -> System.out.println("Was not 1,2,3,4 or 5");
        }

        String month = "OCTOBER";
        System.out.print("Quarter: " + getQuarter(month));
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st Quarter";    // return here will also serve as break
            case "APRIL", "MAY", "JUNE" -> "2nd Quarter";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd Quarter";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th Quarter";
            default -> {
                yield month + " is bad";
            }
        };
    }


}
