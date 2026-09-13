import model.*;
import core.*;
import director.PCDirector;

public class Client {
    public static void main(String[] args) {
        PCDirector director = new PCDirector();

        PCBuilder gamingBuilder = new GamingPCBuilder();
        PC gamingPc = director.constructHighEndGamingRig(gamingBuilder);
        System.out.println("High-End Gaming PC");
        System.out.println(gamingPc);

        PCBuilder serverBuilder = new ServerPCBuilder();
        PC serverPc = director.constructGameServerNode(serverBuilder);
        System.out.println("Dedicated Server Node");
        System.out.println(serverPc);

        PC customPc = new GamingPCBuilder()
                .setCpu("AMD Ryzen 5 7600X")
                .setMotherboard("MSI B650 Tomahawk")
                .setRam(16)
                .setGpu("AMD Radeon RX 7800 XT")
                .setStorage("1TB M.2 SSD")
                .setPowerSupply("750W 80+ Gold")
                .setCoolingSystem(CoolingType.AIR_COOLING)
                .build();

        System.out.println("Custom Budget Gaming PC");
        System.out.println(customPc);
    }
}