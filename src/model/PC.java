package model;

public class PC {
    private final String cpu;
    private final String motherboard;
    private final int ramGb;
    private final String gpu;
    private final String storage;
    private final String powerSupply;
    private final CoolingType coolingType;

    public PC(String cpu, String motherboard, int ramGb, String gpu,
                    String storage, String powerSupply, CoolingType coolingType) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ramGb = ramGb;
        this.gpu = gpu;
        this.storage = storage;
        this.powerSupply = powerSupply;
        this.coolingType = coolingType;
    }

    @Override
    public String toString() {
        return "PC Configuration: \n" +
                "- CPU: " + cpu + "\n" +
                "- Motherboard: " + motherboard + "\n" +
                "- RAM: " + ramGb + " GB\n" +
                "- GPU: " + (gpu != null ? gpu : "Integrated Graphics") + "\n" +
                "- Storage: " + storage + "\n" +
                "- Power Supply: " + powerSupply + "\n" +
                "- Cooling: " + coolingType + "\n";
    }
}
