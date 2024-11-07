public class Main {
    // Read data

    public static void main(String[] args) {

        System.out.println("----Reading data out of a database that has a table of Students Records!----");

        for (int i = 0; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S29300" + i,
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
        }

        Student pojoStudent = new Student("S923006","Ann",
                "05/11/1985","Java MasterClass");

        LPAStudent recordStudent = new LPAStudent("S923006","Bill",
                "06/11/1985","Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");   THROWS AN ERROR, as records are made to be immutable

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}