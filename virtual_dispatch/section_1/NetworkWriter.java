public class NetworkWriter implements Writer {
    private final Socket socket;

    public NetworkWriter(final IpAddress address) {
        socket = new Socket(address);
    }

    public void writeThing(final int thing) {
        socket.writeln(thing);
    }

    public voic close() {
        socket.close();
    }
}
