package assignment2.organizations.party;

import assignment2.commons.Contactable;
import assignment2.commons.Organization;

import java.util.ArrayList;
import java.util.List;

public class Party extends Organization implements Contactable {
    String mission;
    String email, address, phoneNumber;
    List<Election> elections = new ArrayList<>();

    public Party(String name, String mission) {
        this.setName(name);
        this.mission = mission;
    }

    public void addElection(Election e) {
        elections.add(e);
    }

    public boolean removeElection(Election e) {
        return elections.remove(e);
    }

    public List<Election> getFairElections() {
        List<Election> fairElections = new ArrayList<>();
        for (Election election : elections) {
            if (election.isFair()) {
                fairElections.add(election);
            }
        }
        return fairElections;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
