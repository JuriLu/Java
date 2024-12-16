public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "John Doe";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200; // ACCESSING FIELD DIRECTLY, CAUSING CHEATING IN GAME, AND VULNERABILITY FOR HACKING IN THIS CASE
//        player.loseHealth(91);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim",200,"Machine Gun");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}