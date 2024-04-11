import java.util.Date;

public class Delivery {
    ///////////////////
    // PRIVATE ENUMS //
    ///////////////////

    private enum Status {
        InTransit,
        Delivered,
        Pending,
        Returned
    }
    private enum DeliveryType {
        Adrress,
        Pickup
    }

    ////////////////////
    // PRIVATE FIELDS //
    ////////////////////
    private User sender;
    private User receiver;
    private User courier;
    private String trackingNumber;
    private Status status;
    private Date deliveryDate;

    //////////////////
    // CONSTRUCTORS //
    //////////////////
    public Delivery(User sender, User receiver,User courier , String trackingNumber, Date deliveryDate) {
        this.sender = sender;
        this.receiver = receiver;
        this.courier = courier;
        this.trackingNumber = trackingNumber;
        this.status = Status.Pending;
        this.deliveryDate = deliveryDate;
    }


    ////////////////////
    // BUSINESS LOGIC //
    ////////////////////


    /////////////////////////
    // GETTERS AND SETTERS //
    /////////////////////////

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getCourier() {
        return courier;
    }

    public void setCourier(User courier) {
        this.courier = courier;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
