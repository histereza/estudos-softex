package calc;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://127.0.0.1:9876/calc?wsdl");
        QName qname = new QName("http://calc/", "CalculadoraServerImplService");
        Service ws = Service.create(url, qname);
        CalculadoraServer calc = ws.getPort(CalculadoraServer.class);

        System.out.println("Soma: " + calc.soma(10, 5));
        System.out.println("Subtração: " + calc.sub(10, 5));
        System.out.println("Multiplicação: " + calc.mult(10, 5));
        System.out.println("Divisão: " + calc.div(10, 5));
    }
}