package Packet2;
import Packet1.*;
import Packet3.*;

public class PacketHandler {

    protected class PacketHandlerProtected implements InterfacePacket1 {
        @Override
        public void interfacePacket1Method() {
            System.out.println("interfacePacket1Method in PacketHandlerProtected");
        }
    }

    public InterfacePacket1 selector() {
        return new PacketHandlerProtected();
    }

    public static void main(String[] args) {
        PacketSon p = new PacketSon();

        p.getter();
    }
}
