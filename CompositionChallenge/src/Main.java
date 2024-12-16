public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getCoffeeMaker().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getCoffeeMaker().brewCoffee();
//        kitchen.getIceBox().orderFood();
        kitchen.setKitchenState(true,true,true);
        kitchen.doKitchenWork();
    }
}