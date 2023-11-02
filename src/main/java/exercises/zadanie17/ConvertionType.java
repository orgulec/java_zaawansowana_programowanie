package exercises.zadanie17;

import java.math.BigDecimal;

/*
Zadanie 17.
Stwórz klasę enum ConversionType ze stałymi METERS_TO_YARDS, YARDS_TO_METERS, CENTIMETERS_TO_ICHES,
INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
Enum powinien posiadać parametr typu Converter służący do przeprowadzania obliczeń dla danego typu.
Następnie stwórz klasę MeasurementConverter, która będzie posiadała metodę
convert(int value, ConvertionType conversionType) i na podstawie przekazanej wartości oraz typu konwersji,
korzystała z Convertera danego typu i zwracała wynik.
 */
public enum ConvertionType {
    METERS_TO_YARDS(new BigDecimal("1.09361")),
    YARDS_TO_METERS(new BigDecimal("0.9144")),
    CENTIMETERS_TO_INCHES(new BigDecimal("0.393701")),
    INCHES_TO_CENTIMETERS(new BigDecimal("2.54")),
    KILOMETERS_TO_MILES(new BigDecimal("0.621371")),
    MILES_TO_KILOMETERS(new BigDecimal("1.609344"));
    public final BigDecimal converter;

    ConvertionType(BigDecimal converter) {
        this.converter = converter;
    }
}
