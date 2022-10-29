public class Teste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Soma soma = new Soma(2,1);
        Subtracao sub = new Subtracao(2,1);
        Multiplicacao mult = new Multiplicacao(2,1);

        System.out.println(calc.calcular(soma));
        System.out.println(calc.calcular(sub));
        System.out.println(calc.calcular(mult));
    }
}
