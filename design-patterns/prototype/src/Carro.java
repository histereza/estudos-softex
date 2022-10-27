public class Carro extends Veiculo {
    public int numeroPortas;
    public int lugares;


    public Carro() {
        super();
        this.numeroPortas = numeroPortas;
        this.lugares = lugares;
    }


    @Override
    public Carro clone() {
        return new Carro();
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Carro) || !super.equals(object2)) return false;
        Carro veiculo2 = (Carro) object2;
        return veiculo2.numeroPortas == numeroPortas && veiculo2.lugares == lugares;
    }
}