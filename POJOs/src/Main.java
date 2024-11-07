public class Main {
    // Read data

    public static void main(String[] args) {

        System.out.println("----Reading data out of a database that has a table of Students Records!----");

        for (int i = 0; i <= 5; i++) {
            Student s = new Student("S29300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java MasterClass"
            );
            System.out.println(s);
        }
    }
}