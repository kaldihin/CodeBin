package Packet3;
import Packet1.InterfacePacket1;
import Packet2.*;

public class PacketSon extends PacketHandler{

    public InterfacePacket1 getter() {
        PacketHandler p = new PacketHandler();
        return p.selector();
    }
}
