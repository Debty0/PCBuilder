package director;

import model.PC;
import model.CoolingType;
import core.*;

public class PCDirector {

    public PC constructHighEndGamingRig(PCBuilder builder) {
        return builder.setCpu("Intel Core i9-14900K")
                .setMotherboard("ASUS ROG Maximus Z790")
                .setRam(32)
                .setGpu("NVIDIA GeForce RTX 4090")
                .setStorage("2TB NVMe SSD")
                .setPowerSupply("1000W 80+ Titanium")
                .setCoolingSystem(CoolingType.LIQUID_COOLING)
                .build();
    }

    public PC constructGameServerNode(PCBuilder builder) {
        return builder.setCpu("AMD EPYC 9374F")
                .setMotherboard("Supermicro H13SSL-N")
                .setRam(128)
                .setStorage("4TB Enterprise NVMe SSD Raid 1")
                .setPowerSupply("850W Redundant PSU")
                .setCoolingSystem(CoolingType.AIR_COOLING)
                .build();
    }
}