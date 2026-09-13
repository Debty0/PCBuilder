package core;
import model.CoolingType;
import model.PC;

public class ServerPCBuilder implements PCBuilder {
    private String cpu;
    private String motherboard;
    private int ramGb;
    private String gpu;
    private String storage;
    private String powerSupply;
    private CoolingType coolingType;

    @Override
    public PCBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public PCBuilder setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    @Override
    public PCBuilder setRam(int ramGb) {
        this.ramGb = ramGb;
        return this;
    }

    @Override
    public PCBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    @Override
    public PCBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public PCBuilder setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    @Override
    public PCBuilder setCoolingSystem(CoolingType coolingType) {
        this.coolingType = coolingType;
        return this;
    }

    @Override
    public PC build() {
        if (cpu == null || ramGb < 32) {
            throw new IllegalStateException("Server requires a CPU and at least 32GB of RAM.");
        }
        return new PC(cpu, motherboard, ramGb, gpu, storage, powerSupply, coolingType);
    }
}