package eu.the5zig.mod.event;

/**
 * Fired when a packet is sent or received.
 */
public class PacketEvent extends Event {
    private Object packetData;
    private boolean serverToClient;

    public PacketEvent(Object packetData, boolean direction) {
        this.packetData = packetData;
        this.serverToClient = direction;
    }

    public Object getPacket() {
        return packetData;
    }

    public boolean isServerToClient() {
        return serverToClient;
    }
}
