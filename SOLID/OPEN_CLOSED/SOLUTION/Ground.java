public class Ground implements Shipping {
    public double getCost(Order order) {   
        return 1.0d;
    }
    public Date getDate(Order order) {
        return new Date();
    };
}

