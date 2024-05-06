package assignment2.organizations.logistics;

public class Shipment {
    private String id;
    private String origin;
    private String destination;
    private double weight;
    private boolean delivered;

    public Shipment(String id, String origin, String destination, double weight) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.delivered = false;
    }

    // Add getters and setters for the fields

    // You can also add additional methods or fields as needed
}