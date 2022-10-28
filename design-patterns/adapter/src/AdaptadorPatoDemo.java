public class AdaptadorPatoDemo {

    public static void main(String[] args) {
        Galinha chickenlittle = new Galinha();
        Pato abbymallard = new Pato();

        AdaptadorPato abbyAdaptada = new AdaptadorPato(abbymallard);

        chickenlittle.fazerCocoricó();
        abbyAdaptada.fazerCocoricó();
        abbyAdaptada.baterAsas();
        abbymallard.baterAsas();

    }
}
