package day002.ex12_ex13;
import java.util.Objects;

public class Manufacturer {
    private String name;
    private String country;
    private int year;

    public Manufacturer(String name, String country, int year) {
        this.name = name;
        this.country = country;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Koncern: " + name +
                " (" + country + " " + year +")";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Manufacturer)) return false;
        Manufacturer that = (Manufacturer) object;
        return year == that.year && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, year);
    }
}
