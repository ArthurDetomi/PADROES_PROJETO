package SOLID.INTERFACE_SEGREGATION.PROBLEM;

public class Dropbox implements CloudProvider {
    @Override
    public void createServer() {
        /*
            Interface Segragation problem
            Problema dropbox é obrigado a implementar esse método mesmo que não faça sentido ele possuir
        */
        
    }
    @Override
    public Object getCDNAAddress() {
        /*
            Interface Segragation problem
            Problema dropbox é obrigado a implementar esse método mesmo que não faça sentido ele possuir
        */
        return null;
    }
    @Override
    public void getFile() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void listServers() {
        /*
            Interface Segragation problem
            Problema dropbox é obrigado a implementar esse método mesmo que não faça sentido ele possuir
        */
        
    }
    @Override
    public void storeFile() {
        // TODO Auto-generated method stub
        
    }
}
