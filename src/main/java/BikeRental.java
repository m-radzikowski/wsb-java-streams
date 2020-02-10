import java.time.LocalDateTime;

/**
 * Model for Montreal Bixi bike rental open data.
 * https://montreal.bixi.com/en/open-data
 */
public class BikeRental {

    private LocalDateTime startDate;
    private int startStationCode;
    private LocalDateTime endDate;
    private int endStationCode;
    private int durationSec;
    private boolean isMember;

    public BikeRental(LocalDateTime startDate, int startStationCode, LocalDateTime endDate, int endStationCode, int durationSec, boolean isMember) {
        this.startDate = startDate;
        this.startStationCode = startStationCode;
        this.endDate = endDate;
        this.endStationCode = endStationCode;
        this.durationSec = durationSec;
        this.isMember = isMember;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public int getStartStationCode() {
        return startStationCode;
    }

    public void setStartStationCode(int startStationCode) {
        this.startStationCode = startStationCode;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public int getEndStationCode() {
        return endStationCode;
    }

    public void setEndStationCode(int endStationCode) {
        this.endStationCode = endStationCode;
    }

    public int getDurationSec() {
        return durationSec;
    }

    public void setDurationSec(int durationSec) {
        this.durationSec = durationSec;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }
}
