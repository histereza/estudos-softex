public class Galinha implements IGalinha {

    @Override
    public void fazerCocoricó() {
        System.out.println("cocoricóoo");
    }

    @Override
    public void baterAsas() {
        System.out.println("bateu asas, mas não voou.");
    }
}
