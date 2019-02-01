package factoty;

public class Ship implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Products were delivered by Ship");

    }
}
