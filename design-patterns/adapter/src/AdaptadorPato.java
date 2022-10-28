public class AdaptadorPato implements IGalinha {
    private Pato pato;

    public AdaptadorPato(Pato pato) {
        this.pato = pato;
    }

    public void fazerCocoricó() {
        System.out.println("cocoricóoo");
    }

    public void baterAsas() {
        System.out.println("bateu asas, mas não voou.");
    }
}
