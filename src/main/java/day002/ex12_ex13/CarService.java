package day002.ex12_ex13;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public CarService(Car... car) {
        cars = new ArrayList<>();   //nie Arrays.asList() ani List.of() bo niemodyfikowalne!!!
        Collections.addAll(cars, car);
//        for (Car c : car) {
//            cars.add(c);
//        }
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
// wersja ze streamm
        System.out.println(cars.stream()
                .map(Car::toString)
                .collect(Collectors.toList()));
    }

    public void showV12EngineCars() {
        List<Car> collected = cars.stream()
                .filter(car -> EngineType.V12.equals(car.getEngineType()))
                .toList();
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

    public Optional<List<Car>> showMostExpensiveCar() {
        List<Car> collected = cars.stream()
                .max(Comparator.comparingInt(Car::getPrice))
                .stream().toList();
//                .sorted(Comparator.comparingInt(Car::getPrice).reversed())
//                .findFirst()
//        System.out.println("Auto o najwyższej cenie: " + collected);
        return Optional.of(collected);
    }

    public Optional<List<Car>> showCheapestCar() {
        List<Car> collected = cars.stream()
                .min(Comparator.comparingInt(Car::getPrice))
                .stream().toList();
//                .sorted(Comparator.comparingInt(Car::getPrice))
//                .findFirst()
//        System.out.println("Auto o najniższej cenie: " + collected);
        return Optional.of(collected);
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
        String text = sign == '>' ? "Kolejność malejąca (wg nazwy): " : "Kolejność rosnąca (wg nazwy): ";

            collected = cars.stream()
                    .sorted((o1, o2) -> sign == '>' ?
                            o2.getName().compareToIgnoreCase(o1.getName()) :
                            o1.getName().compareToIgnoreCase(o2.getName()))
                    .collect(Collectors.toList());
        System.out.println(text+ collected);
    }
    public boolean isCarOnList(String name, String model) {
/*        boolean result = false;
        for (Car car : cars) {
            if (name.equalsIgnoreCase(car.getName()) && model.equalsIgnoreCase(car.getModel())) {
                result = true;
                break;
            }
        }*/
        return cars.stream()
                .anyMatch(n -> {
                    boolean r = name.equalsIgnoreCase(n.getName()) && model.equalsIgnoreCase(n.getModel());
                    return r;
                });
//        System.out.println("Czy jest na liście " + name + " " + model + "? " + result);
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
        collected = cars.stream()
                    .filter(c -> c.getProducersList()
                            .stream()
                            .anyMatch(p -> optionalSign(p.getYear(),year,sign)))
                .collect(Collectors.toList());

        if(collected.isEmpty()) {
            System.out.println("Brak aut od producentów powstałych " + sign + " " + year + " roku.");
        } else{
            System.out.println("Auta od producentów powstałych " + sign + " " + year + " roku: " + collected.toString());
        }
    }
    private static boolean optionalSign(int a, int b, String sign){
        switch (sign) {
            case "<" -> {
                return a<b;
            } case "<=" -> {
                return a<=b;
            } case ">=" -> {
                return a>=b;
            } case ">" -> {
                return a>b;
            } case "==" -> {
                return a==b;
            } case "!=" -> {
                return a!=b;
            } default ->{
                return false;
            }
        }
    }
}
