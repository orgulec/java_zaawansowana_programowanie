package exercises.zadanie17;

public class MeasurementConverter {
    public static void main(String[] args) {

        System.out.println(convert(100, ConvertionType.CENTIMETERS_TO_ICHES));
        System.out.println(convert(100, ConvertionType.INCHES_TO_CENTIMETERS));
        System.out.println(convert(50, ConvertionType.METERS_TO_YARDS));
        System.out.println(convert(500, ConvertionType.YARDS_TO_METERS));
        System.out.println(convert(300, ConvertionType.KILOMETERS_TO_MILES));
        System.out.println(convert(200, ConvertionType.MILES_TO_KILOMETERS));


    }
    public static float convert(int value, ConvertionType conversionType){
        return conversionType.converter * value;
    }
}
