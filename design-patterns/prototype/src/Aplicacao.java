import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        List<Veiculo> copiaVeiculos = new ArrayList<>();

        Carro carro = new Carro();
        carro.modelo = "civic";
        carro.marca = "honda";
        carro.cor = "prata";
        carro.numeroRodas = 4;
        carro.numeroPortas = 4;
        carro.lugares = 5;
        veiculos.add(carro);

        Carro outroCarro = (Carro) carro.clone();
        veiculos.add(outroCarro);

        Caminhao caminhao = new Caminhao();
        caminhao.modelo = "jacare";
        caminhao.marca = "scania";
        caminhao.cor = "roxo";
        caminhao.numeroRodas = 6;
        caminhao.kilometragem = 1700;
        caminhao.peso = 3000;
        veiculos.add(caminhao);

        represent(veiculos, copiaVeiculos);
    }

    private static void represent(List<Veiculo> veiculos, List<Veiculo> copiaVeiculos) {
        for (Veiculo veiculo : veiculos) {
            copiaVeiculos.add(veiculo.clone());
        }

        System.out.println(veiculos);
        System.out.println(copiaVeiculos);
    }

}
