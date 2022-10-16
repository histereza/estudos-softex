package factoryMethod;

public class ComputerFactory {
    public static IComputer createComputer(ComputerType Type, String ram, String hd, String cpu) {
        IComputer comp = null;
        if (ComputerType.Pc == Type) {
            comp = new Pc(ram, hd, cpu);
        } else if (ComputerType.Server == Type){
            comp = new Server(ram, hd, cpu);
        }
        return comp;
    }
}