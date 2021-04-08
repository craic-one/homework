package exam01;

import java.time.LocalDate;
import java.util.Objects;

public class Membership {
    private LocalDate startMembership;
    private LocalDate endMembership;
    private Client client;
    private Type type;

    public Membership(LocalDate startMembership, LocalDate endMembership, Client client, Type type) {
        this.startMembership = Objects.requireNonNull(startMembership, "Необходимо ввести дату начала абонемента");
        this.endMembership = Objects.requireNonNull(endMembership, "Необходимо ввести дату конца абонемента");
        this.client = client;
        this.type = type;
    }

    public LocalDate getStartMembership() {
        return startMembership;
    }

    public LocalDate getEndMembership() {
        return endMembership;
    }

    public Client getClient() {
        return client;
    }

    public Type getType() {
        return type;
    }


    @Override
    public String toString() {
        return "Membership{" +
                "client=" + client +
                ", type=" + type +
                '}';
    }
}
