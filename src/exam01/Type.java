package exam01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public enum Type {
    SINGLE(LocalTime.of(8,00),LocalTime.of(22,00),new Zone[]{Zone.SWIM, Zone.GYM}),
    HALF(LocalTime.of(8,00),LocalTime.of(16,00),new Zone[]{Zone.GROUP, Zone.GYM}),
    FULL(LocalTime.of(8,00),LocalTime.of(22,00),new Zone[]{Zone.SWIM, Zone.GYM, Zone.GROUP});
    private LocalTime timeFrom;
    private LocalTime timeTo;
    private Zone[] zones;


    Type(LocalTime timeFrom, LocalTime timeTo, Zone[] zones) {
        this.timeFrom = Objects.requireNonNull(timeFrom,"Время начала действия");
        this.timeTo = Objects.requireNonNull (timeTo,"Время окончания действия");
        this.zones = Objects.requireNonNull (zones,"Разрешенные зоны доступа");
    }

    public LocalTime getTimeFrom() {
        return timeFrom;
    }

    public LocalTime getTimeTo() {
        return timeTo;
    }

    public Zone[] getZones() {
        return zones;
    }
}
