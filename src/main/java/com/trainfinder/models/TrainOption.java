package com.trainfinder.models;

public class TrainOption {
    private String duration;
    private String price;
    private int changes;
    private String departure;
    private String arrival;
    private String carrier;

    public TrainOption(String duration, String price, int changes, String departure, String arrival, String carrier) {
        this.duration = duration;
        this.price = price;
        this.changes = changes;
        this.departure = departure;
        this.arrival = arrival;
        this.carrier = carrier;
    }

    public String getDuration() { return duration; }
    public String getPrice() { return price; }
    public int getChanges() { return changes; }
    public String getDeparture() { return departure; }
    public String getArrival() { return arrival; }
    public String getCarrier() { return carrier; }

    public void setDuration(String duration) { this.duration = duration; }
    public void setPrice(String price) { this.price = price; }
    public void setChanges(int changes) { this.changes = changes; }
    public void setDeparture(String departure) { this.departure = departure; }
    public void setArrival(String arrival) { this.arrival = arrival; }
    public void setCarrier(String carrier) { this.carrier = carrier; }
}
