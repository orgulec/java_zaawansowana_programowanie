package day002.ex12_ex13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public CarService(Car... car) {
        cars = new ArrayList<>();   //nie Arrays.asList() ani List.of() boniemodyfikowalne!!!
        for (Car c : car) {
            cars.add(c);
        }
    }

    public boolean addCar(Car car) {
        return cars.add(car);
//        System.out.println("Dodano auto " + car.getModel());
    }

    public boolean removeCar(Car car) {
        return cars.remove(car);
//        System.out.println("Usunięto auto " + car.getModel());
    }

    public void showAllCars() {
//        for (Car car : cars) {
//            System.out.println(car.toString());
//        }
        //wersja ze streamm
        System.out.println(cars.stream()
                .map(Car::toString)
                .collect(Collectors.toList()));
    }

    public void showV12EngineCars() {
        List<Car> collected = cars.stream()
                .filter(car -> EngineType.V12.equals(car.getEngineType()))
                .collect(Collectors.toList());
        if(collected.isEmpty()) {
            System.out.println("Brak aut z silnikiem V12.");
        } else {
            System.out.println("Auta z silnikiem V12: " + collected.toString());
        }
    }

    public void showCarsOlderThenYear(Integer year) {
        List<Car> collected = cars.stream()
                .filter(car -> car.getProductionYear() < year)
                .collect(Collectors.toList());
        if(collected.isEmpty()) {
            System.out.println("Brak aut wyprodukowane przed " + year+".");
        } else {
            System.out.println("Auta wyprodukowane przed " + year + ": " + collected.toString());
        }
    }

    public void showMostExpensiveCar() {
        List<Car> collected = cars.stream()
//                .sorted(Comparator.comparingInt(Car::getPrice).reversed())
//                .findFirst()
                .max(Comparator.comparingInt(Car::getPrice))
                .stream().toList();
        System.out.println("Auto o najwyższej cenie: " + collected);
    }

    public void showCheapestCar() {
        List<Car> collected = cars.stream()
//                .sorted(Comparator.comparingInt(Car::getPrice))
//                .findFirst()
                .min(Comparator.comparingInt(Car::getPrice))
                .stream().toList();
        System.out.println("Auto o najniższej cenie: " + collected);
    }

    public void showCarsWithMin3Manufacturers() {
        List<Car> collected = cars.stream()
                .filter(car -> car.getProducersList().size() >= 3)
                .toList();
        if(collected.isEmpty()) {
            System.out.println("Brak aut z minimum 3 producentami.");
        } else {
            System.out.println("Auta z minimum 3 producentami: " + collected.toString());
        }
    }

    public void showAllCarsInOrder(char sign) {
        List<Car> collected;
        String text="";

        if (sign == '>') {
            collected = cars.stream()
                    .sorted((o1, o2) -> o2.getName().compareToIgnoreCase(o1.getName()))
                    .collect(Collectors.toList());
            text = "Kolejność malejąca: ";
        } else {
            collected = cars.stream()
                    .sorted((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()))
                    .collect(Collectors.toList());
            text = "Kolejność rosnąca: ";
        }
        System.out.println(text+collected.toString());
    }

    public boolean isCarOnList(String name, String model) {
        boolean result = false;
        for (Car car : cars) {
            if (name.equalsIgnoreCase(car.getName()) && model.equalsIgnoreCase(car.getModel())) {
                result = true;
                break;
            }
        }
        System.out.println("Czy jest na liście " + name + " " + model + "? " + result);
        return result;
    }

    public void showAllCarsFromProducer(String producersName) {
        List<Car> collected = cars.stream()
                .filter(car -> car.getProducersList()
                        .stream()
                        .anyMatch(p -> p.getName().equalsIgnoreCase(producersName)))
                .toList();
        if(collected.isEmpty()) {
            System.out.println("Brak aut od producenta " + producersName);
        } else {
            System.out.println("Auta od producenta " + producersName + ": " + collected.toString());
        }
    }

    public void showAllCarsByManufacturerYear(String sign, int year) {
        List<Car> collected = null;
        switch (sign) {
            case "<" -> collected = cars.stream()
                    .filter(c -> c.getProducersList()
                            .stream()
                            .anyMatch(p -> p.getYear() < year))
                    .collect(Collectors.toList());
            case ">" -> collected = cars.stream()
                    .filter(c -> c.getProducersList()
                            .stream()
                            .anyMatch(p -> p.getYear() > year))
                    .collect(Collectors.toList());
            case "<=" -> collected = cars.stream()
                    .filter(c -> c.getProducersList()
                            .stream()
                            .anyMatch(p -> p.getYear() <= year))
                    .collect(Collectors.toList());
            case ">=" -> collected = cars.stream()
                    .filter(c -> c.getProducersList()
                            .stream()
                            .anyMatch(p -> p.getYear() >= year))
                    .collect(Collectors.toList());
            case "==" -> collected = cars.stream()
                    .filter(c -> c.getProducersList()
                            .stream()
                            .anyMatch(p -> p.getYear() == year))
                    .collect(Collectors.toList());
            case "!=" -> collected = cars.stream()
                    .filter(c -> c.getProducersList()
                            .stream()
                            .anyMatch(p -> p.getYear() != year))
                    .collect(Collectors.toList());
            default -> System.out.println("Błędny znak!");
        }

        if(collected==null || collected.isEmpty()) {
            System.out.println("Brak aut od producentów powstałych " + sign + " " + year + " roku.");
        } else{
            System.out.println("Auta od producentów powstałych " + sign + " " + year + " roku: " + collected.toString());
        }
    }

}
