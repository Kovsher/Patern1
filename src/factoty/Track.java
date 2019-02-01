package factoty;

public class Track implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Products were delivered by Track");
    }
}
