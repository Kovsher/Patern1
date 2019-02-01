package factoty;

public class LogisticFactory {
    static ITransport getTransportForDelivery(String name) {
        ITransport transport = null;
        switch (name) {
            case "Track":
                transport = new Track();
                break;
            case "Ship":
                transport = new Ship();
                break;
            default:
                System.out.println("Unknown transport type");


        }
        return transport;

    }
}
