package exam01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;

public class Fitness {
    private Membership[] swim = new Membership[20];
    private Membership[] gym = new Membership[20];
    private Membership[] group = new Membership[20];

    public void entrance(Zone zone, Membership membership) {
        Objects.requireNonNull(zone, "Не может быть null");
        Objects.requireNonNull(membership, "Не может быть null");
        if (membership.getEndMembership().isBefore(LocalDate.now())) {
            System.out.println("Ваш абонемент закончился");
            return;
        }
        if (membership.getStartMembership().isAfter(LocalDate.now())) {
            System.out.println("Ваш абонемент еще не активен");
            return;
        }
        boolean zoneOk = false;
        for (int i = 0; i < membership.getType().getZones().length; i++) {
            if (membership.getType().getZones()[i] == zone) {
                zoneOk = true;
                break;
            }
        }
        if (!zoneOk) {
            System.out.println("Ваша карта не дает доступ в " + zone);
            return;
        }

        if (membership.getType().getTimeFrom().isAfter(LocalTime.now())) {
            System.out.println("Вы рано пришли");
            return;
        }
        if (membership.getType().getTimeTo().isBefore(LocalTime.now())) {
            System.out.println("Вы слишком поздно");
            return;
        }

        for (int i = 0; i < swim.length; i++) {
            if (membership == swim[i]) {
                System.out.println("Вы мошенник, по вашему абонементу уже кто-то прошел в клуб");
                return;
            }
        }

        for (int i = 0; i < gym.length; i++) {
            if (membership == gym[i]) {
                System.out.println("Вы мошенник, по вашему абонементу уже кто-то прошел в клуб");
                return;
            }
        }

        for (int i = 0; i < group.length; i++) {
            if (membership == group[i]) {
                System.out.println("Вы мошенник, по вашему абонементу уже кто-то прошел в клуб");
                return;
            }
        }
        if (zone == Zone.SWIM) {
            for (int i = 0; i < swim.length; i++) {
                if (swim[i] == null) {
                    swim[i] = membership;
                    System.out.println(membership.getClient() + " пришел в " + zone + " " + LocalDateTime.now());
                    return;
                }
            }
        }
        if (zone == Zone.GYM) {
            for (int i = 0; i < gym.length; i++) {
                if (gym[i] == null) {
                    gym[i] = membership;
                    System.out.println(membership.getClient() + " пришел в " + zone + " " + LocalDateTime.now());
                    return;
                }
            }
        }
        if (zone == Zone.GROUP) {
            for (int i = 0; i < group.length; i++) {
                if (group[i] == null) {
                    group[i] = membership;
                    System.out.println(membership.getClient() + " пришел в " + zone + " " + LocalDateTime.now());
                    return;
                }
            }
        }
        System.out.println("Мест для занятий нет");
    }

    public void print() {
        System.out.println("Посетители GYM" + Arrays.toString(gym));
        System.out.println("Посетители SWIM" + Arrays.toString(swim));
        System.out.println("Посетители GROUP" + Arrays.toString(group));
    }

    public void close() {
        Arrays.fill(swim, null);
        Arrays.fill(gym, null);
        Arrays.fill(group, null);
    }
}
