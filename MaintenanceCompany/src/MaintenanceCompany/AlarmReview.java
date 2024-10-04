package MaintenanceCompany;

import java.time.LocalDate;

public class AlarmReview extends Service{
    private int alarmsToCheck;

    public AlarmReview(String worker, String client, int alarmsToCheck) {
        super(worker, client);
        this.alarmsToCheck = alarmsToCheck;
    }

    @Override
    public double materialCost() {
        return 0;
    }

    @Override
    public double laborCost() {
        return (alarmsToCheck/3)*40;
    }

    @Override
    public double totalCost() {
        return this.laborCost();
    }

    @Override
    public String serviceDetails() {
        return "PERIODIC REVIEW OF FIRE ALARMS" +
                "\nClient: " + this.getClient() +
                "\nDate Init: " + this.getDateInit() +
                "\n-----------------------------------" +
                "\nTotal cost: " + this.totalCost() +
                "\n------------------------------------";
    }

    public int getAlarmsToCheck() {
        return alarmsToCheck;
    }

    public void setAlarmsToCheck(int alarmsToCheck) {
        this.alarmsToCheck = alarmsToCheck;
    }
}
