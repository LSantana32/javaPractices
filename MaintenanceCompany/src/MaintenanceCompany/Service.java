package MaintenanceCompany;

import java.time.LocalDate;

public abstract class Service {
    private String worker;
    private LocalDate dateInit;
    private String client;

    public Service(String worker, String client) {
        this.worker = worker;
        this.dateInit = LocalDate.now();
        this.client = client;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public abstract double materialCost();

    public abstract double laborCost();

    public abstract double totalCost();

    public abstract String serviceDetails();


    public LocalDate getDateInit() {
        return dateInit;
    }

    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }
}
