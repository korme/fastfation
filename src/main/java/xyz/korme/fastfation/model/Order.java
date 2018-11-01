package xyz.korme.fastfation.model;

public class Order {
    private Integer orderId;
    private String openid;
    private Integer measureId;
    private short orderStatue;
    private Integer orderPrice;
    private Integer clouthesId;
    private Integer quantity;
    private String createTime;

    public Order(String openid, Integer measureId, short orderStatue, Integer orderPrice, Integer clouthesId, Integer quantity, String createTime) {
        this.openid = openid;
        this.measureId = measureId;
        this.orderStatue = orderStatue;
        this.orderPrice = orderPrice;
        this.clouthesId = clouthesId;
        this.quantity = quantity;
        this.createTime = createTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public short getOrderStatue() {
        return orderStatue;
    }

    public void setOrderStatue(short orderStatue) {
        this.orderStatue = orderStatue;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getClouthesId() {
        return clouthesId;
    }

    public void setClouthesId(Integer clouthesId) {
        this.clouthesId = clouthesId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}