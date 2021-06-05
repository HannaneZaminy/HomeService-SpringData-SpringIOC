package ir.maktab.data.enums;

public  enum OrderStatus  {
    WAITING_FOR_SPECIALIST_SUGGESTION("waiting for specialist suggestion"),
    WAITING_FOR_SPECIALIST_SELECTION("waiting for specialist selection"),
    WAITING_FOR_SPECIALIST_TO_COME_TO_YOUR_Location("waiting for specialist to come to your place"),
    STARTED("started"),
    DONE("done"),
    PAID("paid");
    private final String orderStatus;
    OrderStatus(String status) {
        this.orderStatus = status;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
}
