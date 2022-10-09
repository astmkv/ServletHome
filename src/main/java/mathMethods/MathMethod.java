package mathMethods;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MathMethod {

    public static Double getMaxValue(double n1, double n2, double n3) {
        return Stream.of(n1, n2, n3).reduce(Math::max).get();
    }

    public static Double getMinValue(double n1, double n2, double n3) {
        return Stream.of(n1, n2, n3).reduce(Math::min).get();
    }

    public static Double getAverageValue(double n1, double n2, double n3) {
        return DoubleStream.of(n1, n2, n3).average().getAsDouble();
    }

}
//