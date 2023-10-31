package exercises.zadanie17;
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
    METERS_TO_YARDS(1.09361f),
    YARDS_TO_METERS(0.9144f),
    CENTIMETERS_TO_ICHES(0.393701f),
    INCHES_TO_CENTIMETERS(2.54f),
    KILOMETERS_TO_MILES(0.621371f),
    MILES_TO_KILOMETERS(1.609344f);
    public final float converter;

    ConvertionType(float converter) {
        this.converter = converter;
    }
}
