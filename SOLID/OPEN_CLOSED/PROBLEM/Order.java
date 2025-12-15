public class Order {
    private Object lineItems;
    private String shipping;

    public double getTotal() {
        // ...
        /*
            Problema: Deve-se mudar a classe pedido sempre que
            adiciona um novo metódo de envio na aplicação.

        */


        if (shipping.equals("ground")) {
            return 1.0;
        }

        if (shipping.equals("air")) {
            return 2.0;
        } 

        return 0.0;
    }

    public void getTotalWeight() {
    }

    public void getShippingType(String st) {
    }

    public void getShippingCost() {

    }

    public void getShippingDate() {

    }
}