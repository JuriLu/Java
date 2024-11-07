public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog(){   //This is the implicit constructor, Java creates when we don't define a constructor.
        super("Mutt","Big",50);
    }

    public Dog(String type, double weight){
        this(type,weight,"Perky","Curled");  // It calls the Dog constructor on line 14
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(
                type,
                weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), // cannot do this before super, because super is the first one to be called
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail.");
    }
}
