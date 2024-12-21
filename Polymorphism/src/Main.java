import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();

//        Adventure adventureMovie = new Adventure("Jurassic Park");
//        adventureMovie.watchMovie();
//
//        Comedy comedyMovie = new Comedy("Grown Ups");
//        comedyMovie.watchMovie();
//
//        ScienceFiction scienceFictionMovie = new ScienceFiction("Independence day");
//        scienceFictionMovie.watchMovie();

//        Movie theMovie = Movie.getMovie("Adventure","Star Wars");
//        theMovie.watchMovie();
//
//        Movie anotherMovie = Movie.getMovie("Science","Independence day");
//        anotherMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }

            System.out.print("Enter a Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }

}
