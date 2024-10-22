package appliance;

public class Washer extends Appliance {
    private int load;
    public Washer(int price, String color, String energyConsumption, int weight, int load) {
        super(price, color, energyConsumption, weight);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public int finalPrice() {
        return super.finalPrice() + loadPrice();
    }

    private int loadPrice() {
        int price = (load>30)?500:0;
        return price;
    }
}
