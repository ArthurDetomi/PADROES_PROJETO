public class Air implements Shipping {
    public double getCost(Order order) {   
        return 2.0d;
    }
    public Date getDate(Order order) {
        return new Date();
    };
}