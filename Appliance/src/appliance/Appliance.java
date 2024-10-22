package appliance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Appliance {
    private int price;
    private String color;
    private String energyConsumption;
    private final Map<String,Integer> energyConsumptionLetters= Map.of("a",1000,"b",800,"c",600,"d",500,"e",300,"f",100);
    private final List<String> colors= Arrays.asList("white","black","red","blue","grey");
    private int weight;

    public Appliance(int price, String color, String energyConsumption, int weight) {
        this.price = price;
        checkColor(color);
        checkEnergyConsumption(energyConsumption);
        this.weight = weight;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(String energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private void checkEnergyConsumption(String aLetter){
        this.energyConsumption = (energyConsumptionLetters.containsKey(aLetter)?aLetter:"f");
    }

    private void checkColor(String aColor){
        this.energyConsumption = (energyConsumptionLetters.containsKey(aColor)?aColor:"white");
    }

    public int finalPrice(){
        return energyConsumptionPrice() + weightPrice();
    }

    private int energyConsumptionPrice() {
        return energyConsumptionLetters.get(energyConsumption);
    }

    private int weightPrice() {
        int price;
        if (weight > 1 && weight < 19){
            price=100;
        }else if (weight > 20 && weight < 49){
            price=500;
        }else if (weight > 59 && weight < 79){
            price=800;
        }else{
            price=1000;
        }
        return price;
    }


}
