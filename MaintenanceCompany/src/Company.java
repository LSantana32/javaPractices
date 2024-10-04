import MaintenanceCompany.PaintJob;
import MaintenanceCompany.Service;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private double accumulator;

    public Company() {
        this.accumulator = 0 ;
    }

    public void hire(Service aService) {
        if (aService instanceof PaintJob) {
            ((PaintJob) aService).getEdification();
        }
        aService.serviceDetails();
        this.accumulator+=aService.totalCost();
    }

    public double totalCostOfWorks(){
        return this.accumulator;
    }
}
