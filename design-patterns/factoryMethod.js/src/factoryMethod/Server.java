package factoryMethod;

public class Server implements IComputer{

        private String ram;
        private String hd;
        private String cpu;

    public Server(String ram, String hd, String cpu) {
        this.ram = ram;
        this.hd = hd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHd() {
        return this.hd;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ram='" + ram + '\'' +
                ", hd='" + hd + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}

