package exercises.zadanie17;

import java.math.BigDecimal;

public class MeasurementConverter {
    public static void main(String[] args) {

        MeasurementConverter convertValue = new MeasurementConverter();

        System.out.println(convertValue.convert(1000, ConvertionType.CENTIMETERS_TO_INCHES));
        System.out.println(convertValue.convert(1000, ConvertionType.INCHES_TO_CENTIMETERS));
        System.out.println(convertValue.convert(1000, ConvertionType.MILES_TO_KILOMETERS));
        System.out.println(convertValue.convert(1000, ConvertionType.KILOMETERS_TO_MILES));
        System.out.println(convertValue.convert(1000, ConvertionType.METERS_TO_YARDS));
        System.out.println(convertValue.convert(1000, ConvertionType.YARDS_TO_METERS));

    }
    public BigDecimal convert(int value, ConvertionType conversionType){
        return conversionType.converter.multiply(new BigDecimal(value));
    }
}


/*        System.out.println(convert(100, ConvertionType.CENTIMETERS_TO_ICHES));
        System.out.println(convert(100, ConvertionType.INCHES_TO_CENTIMETERS));
        System.out.println(convert(50, ConvertionType.METERS_TO_YARDS));
        System.out.println(convert(500, ConvertionType.YARDS_TO_METERS));
        System.out.println(convert(300, ConvertionType.KILOMETERS_TO_MILES));
        System.out.println(convert(200, ConvertionType.MILES_TO_KILOMETERS));


    }
    public float convert(int value, ConvertionType conversionType){
        ConvertionType.
        return conversionType.converter * value;
    }
    */

