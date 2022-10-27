import java.util.Objects;

public abstract class Veiculo {
    public String modelo;
    public String marca;
    public String cor;
    public int numeroRodas;

    public Veiculo() {
    }

    public Veiculo(Veiculo etiqueta) {
        if (etiqueta != null) {
            this.modelo = etiqueta.modelo;
            this.marca = etiqueta.marca;
            this.cor = etiqueta.cor;
            this.numeroRodas = etiqueta.numeroRodas;
        }
    }

    public abstract Veiculo clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Veiculo)) return false;
        Veiculo veiculo2 = (Veiculo) object2;
        return veiculo2.modelo == modelo && veiculo2.marca == marca && veiculo2.cor == cor && veiculo2.numeroRodas == numeroRodas;
    }
}
