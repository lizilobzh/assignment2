package assignment2.organizations.logistics;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;
import java.util.ArrayList;
import java.util.List;

public class LogisticsCompany extends Organization implements Contactable {
    private String email;
    private String phoneNumber;
    private String address;
    private List<Shipment> shipments = new ArrayList<>();

    public LogisticsCompany(String name, String description, String email, String phoneNumber, String address) {
        this.setName(name);
        this.setDescription(description);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void addShipment(Shipment shipment) {
        shipments.add(shipment);
    }

    public boolean removeShipment(Shipment shipment) {
        return shipments.remove(shipment);
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }
}