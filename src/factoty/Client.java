package factoty;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Enter transport type");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        ITransport transport = LogisticFactory.getTransportForDelivery(name);
        transport.deliver();
    }
}
