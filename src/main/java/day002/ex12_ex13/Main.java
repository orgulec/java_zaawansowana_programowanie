package day002.ex12_ex13;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manufacturer ford = new Manufacturer("Ford","USA",1903);
        Manufacturer toyota = new Manufacturer("Toyota","Japan",1937);
        Manufacturer bmw = new Manufacturer("BMW","Germany",1920);
        Manufacturer fiat = new Manufacturer("Fiat","Italy",1928);
        Manufacturer opel = new Manufacturer("Opel","Germany",1918);
        Manufacturer volkswagen = new Manufacturer("Volkswagen","Germany",1908);

        List<Manufacturer> manufacturersListFord = List.of(ford);
        List<Manufacturer> manufacturersListToyota = List.of(toyota);
        List<Manufacturer> manufacturersListBmw = List.of(bmw);
        List<Manufacturer> manufacturersListFiat = List.of(fiat);
        List<Manufacturer> manufacturersListOpel = List.of(bmw,opel);
        List<Manufacturer> manufacturersListVolkswagen = List.of(bmw,opel,volkswagen);

        Car bmwCar = new Car("BMW","X8",2012,manufacturersListBmw,200_000,EngineType.V8);
        Car fordCar = new Car("Ford","Escort",2002,manufacturersListFord,100_000,EngineType.V6);
        Car fiatCar = new Car("Fiat","Multipla",2005,manufacturersListFiat,60_000,EngineType.S4);
        Car opelCar = new Car("Opel","Cadet",1998,manufacturersListOpel,75_000,EngineType.V6);
        Car toyotaCar = new Car("Toyota","Yaris",2009,manufacturersListToyota,150_000,EngineType.S6);
        Car porscheCar = new Car("Porsche","911",1990,manufacturersListVolkswagen,450_000,EngineType.V12);

        System.out.println("Czy fordCar to to samo co toyotaCar? " + fordCar.equals(toyotaCar));
        System.out.println("Czy bmwCar to to samo co toyotaCar? " + bmwCar.equals(toyotaCar));
        System.out.println("---");

        CarService carService = new CarService(fordCar,fiatCar,opelCar,toyotaCar,bmwCar,porscheCar);

        carService.removeCar(fiatCar);
        carService.showAllCars();

        carService.addCar(fiatCar);
        carService.showAllCars();
        System.out.println("---");

        carService.showV12EngineCars();
        carService.showCarsOlderThenYear(1999);
        System.out.println("---");

        carService.showMostExpensiveCar();
        carService.showCheapestCar();
        System.out.println("---");

        carService.showCarsWithMin3Manufacturers();

        carService.showAllCarsInOrder('<');
        carService.showAllCarsInOrder('>');
        System.out.println("---");

        carService.isCarOnList("Opel","Cadet");
        carService.isCarOnList("Toyota","Prius");
        System.out.println("---");

        carService.showAllCarsFromProducer("BMW");
        System.out.println("---");

        carService.showAllCarsByManufacturerYear(">",1920);
        carService.showAllCarsByManufacturerYear("<=",1920);
        carService.showAllCarsByManufacturerYear("==",1922);
        carService.showAllCarsByManufacturerYear("!=",1920);
        carService.showAllCarsByManufacturerYear("...",1920);

    }
}
