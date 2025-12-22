package SOLID.INTERFACE_SEGREGATION.PROBLEM;

public interface CloudProvider {
    public void storeFile();
    public void getFile();
    public void createServer();
    public void listServers();
    public Object getCDNAAddress();
}
