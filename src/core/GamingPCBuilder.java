package core;
import model.CoolingType;
import model.PC;

public class GamingPCBuilder implements PCBuilder {
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
        if (ramGb < 16) {
            throw new IllegalArgumentException("Gaming PC requires at least 16GB of RAM");
        }
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
        if (cpu == null || gpu == null) {
            throw new IllegalStateException("Gaming PC must have both CPU and GPU defined.");
        }
        return new PC(cpu, motherboard, ramGb, gpu, storage, powerSupply, coolingType);
    }
}