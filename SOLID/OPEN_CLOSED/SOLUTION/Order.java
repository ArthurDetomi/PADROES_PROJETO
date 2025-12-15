/*
  Open/Closed: Agora a classe Order está fechada para modificações e aberta para extensão 
*/
public final class Order {
  private Object lineItems;
  private Shipping shipping;

  public double getTotal() { return shipping.getCost(this); }

  public void getTotalWeight() {}

  public void getShippingType(String st) {}

  public void getShippingCost() {}

  public void getShippingDate() {}
}