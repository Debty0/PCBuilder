package core;

import model.CoolingType;
import model.PC;

public interface PCBuilder {
    PCBuilder setCpu(String cpu);
    PCBuilder setMotherboard(String motherboard);
    PCBuilder setRam(int ramGb);
    PCBuilder setGpu(String gpu);
    PCBuilder setStorage(String storage);
    PCBuilder setPowerSupply(String powerSupply);
    PCBuilder setCoolingSystem(CoolingType coolingType);

    PC build();
}
