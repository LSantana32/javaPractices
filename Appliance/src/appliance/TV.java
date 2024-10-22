package appliance;

public class TV extends Appliance {
    private double resolution;
    private boolean TDTTuner;


    public TV(int price, String color, String energyConsumption, int weight, double resolution, boolean TDTTuner) {
        super(price, color, energyConsumption, weight);
        this.resolution = resolution;
        this.TDTTuner = TDTTuner;
    }

    @Override
    public int finalPrice() {
        return super.finalPrice() + resolutionPrice() + TDTTunerPrice();
    }

    private int TDTTunerPrice() {    // true -> 500
    }

    private int resolutionPrice() {   //>40 -> 30%+

    }
}
