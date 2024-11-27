import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t  \n");

        String helloWorld = "Hello World";
        System.out.printf("Index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("Index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("Index of l = %d %n", helloWorld.indexOf('l',3));
        System.out.printf("Index of l = %d %n", helloWorld.lastIndexOf('l',8));

        // String Comparision Methods
        String helloWorldLower = helloWorld.toLowerCase();

        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values Match Exactly");
        }

        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values matches ignoring case");
        }

        if(helloWorld.startsWith("Hello")){
          System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values Match Exactly");
        }

    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
