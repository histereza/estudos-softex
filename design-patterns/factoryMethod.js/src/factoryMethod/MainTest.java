package factoryMethod;

public class MainTest {
    public static void main(String[] args) {
        IComputer pc1 = ComputerFactory.createComputer(ComputerType.Pc, "4", "256", "4000");
        System.out.println(pc1.toString());
        System.out.println(pc1.getRam());
        System.out.println(pc1.getClass());

        IComputer server1 = ComputerFactory.createComputer(ComputerType.Server, "6", "1000", "5000");
        System.out.println(server1.toString());
        System.out.println(server1.getHd());
        System.out.println(server1.getClass());

    }

}
