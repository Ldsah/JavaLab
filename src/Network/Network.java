package Network;

import java.util.ArrayList;

public class Network {
    public static void main(String[] args) {
        ArrayList <NetworkElement> networkElements = new ArrayList<>();
        networkElements.add(new NetworkElement("D-Link"));
        networkElements.add(new Hub("NE1234-TCP"));
        networkElements.add(new NetworkElement("DLINK-100"));
        for (int i = 0; i < networkElements.size(); i++) {
            System.out.println(">>" + networkElements.get(i));
        }
    }
}
