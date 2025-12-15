/*
Agora caso adicione um novo metodo de envio na aplicação, basta
apenas criar uma nova classe e implementar essa interface,
não tem que mexer na classe pedido(Order)
*/
public interface Shipping {
    public double getCost(Order order);
    public Date getDate(Order order);
}