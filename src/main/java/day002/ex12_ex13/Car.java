package day002.ex12_ex13;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private int productionYear;
    private List<Manufacturer> producersList;
    private int price;
    private EngineType engineType;

    public Car(String name, String model, int productionYear, List<Manufacturer> producersList, int price, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.productionYear = productionYear;
        this.producersList = producersList;
        this.price = price;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public List<Manufacturer> getProducersList() {
        return producersList;
    }

    public void setProducersList(List<Manufacturer> producersList) {
        this.producersList = producersList;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car: " + name +" " + model
                + " " + producersList.toString()
                + " ("+productionYear+") "
                + "Silnik: " + engineType +
                " Cena: " + price + " |";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Car)) return false;
        Car car = (Car) object;
        return productionYear == car.productionYear && price == car.price && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(producersList, car.producersList) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, productionYear, producersList, price, engineType);
    }
}
