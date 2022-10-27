public class Caminhao extends Veiculo {
    public double kilometragem;
    public double peso;


    public Caminhao() {
        super();

            this.kilometragem = kilometragem;
            this.peso = peso;
    }


    @Override
    public Caminhao clone() {
        return new Caminhao();
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Caminhao) || !super.equals(object2)) return false;
        Caminhao veiculo2 = (Caminhao) object2;
        return veiculo2.kilometragem == kilometragem && veiculo2.peso == peso;
    }
}