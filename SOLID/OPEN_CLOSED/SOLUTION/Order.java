public class Order {
  private Object lineItems;
  private Shipping shipping;

  public double getTotal() { return shipping.getCost(this); }

  public void getTotalWeight() {}

  public void getShippingType(String st) {}

  public void getShippingCost() {}

  public void getShippingDate() {}
}