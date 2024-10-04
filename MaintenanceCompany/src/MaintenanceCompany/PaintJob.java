package MaintenanceCompany;

import java.time.LocalDate;

public class PaintJob extends Service{
    private String edification;
    private double surface;
    private double paintCost;

    private double material_cost;
    private double labor_cost;
    private double total_cost;

    public PaintJob(String worker, String client,double surface, double paintCost) {
        super(worker, client);
        this.surface=surface;
        this.paintCost=paintCost;
    }

    @Override
    public double materialCost() {
        material_cost= (this.surface/7.8)*this.paintCost;
        return material_cost;
    }

    @Override
    public double laborCost() {
        labor_cost= (this.surface/10)*9.5;
        return labor_cost;
    }

    @Override
    public double totalCost() {
        total_cost = labor_cost+material_cost+ this.aditionalCost();
        return total_cost;
    }

    public double aditionalCost() {
        double aditional = this.surface>=50 ? (labor_cost+material_cost)*0.15 : 0;
        return aditional;
    }

    @Override
    public String serviceDetails() {
        return "PAINT JOB" +
                "\nClient: " + this.getClient() +
                "\nDate Init: " + this.getDateInit() +
                "\n-----------------------------------" +
                "\nPainter: " + this.getWorker() +
                "\nMaterial cost: " + this.materialCost() +
                "\nLabor cost: " + this.laborCost() +
                "\nAditional cost: " + this.aditionalCost() +
                "\nTotal cost: " + this.totalCost() +
                "\n------------------------------------";
    }

    public String getEdification() {
        return edification;
    }

    public void setEdification(String edification) {
        this.edification = edification;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getPaintCost() {
        return paintCost;
    }

    public void setPaintCost(double paintCost) {
        this.paintCost = paintCost;
    }
}
