package exam01;

import java.time.LocalDate;

public class Membership {
    LocalDate startMembership;
    LocalDate endMembership;
    Client client;

    public Membership(LocalDate startMembership, LocalDate endMembership, Client client) {
        this.startMembership = startMembership;
        this.endMembership = endMembership;
        this.client = client;
    }
}
