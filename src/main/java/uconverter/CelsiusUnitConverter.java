package uconverter;

public class CelsiusUnitConverter extends UnitConverter {
    @Override
    public double toSI(double value) {
        return value;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue;
    }

    @Override
    public String getName() {
        return "Celsius";
    }
}
