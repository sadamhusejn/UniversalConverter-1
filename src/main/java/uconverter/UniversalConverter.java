package uconverter;

import asg.cliche.Command;

import java.util.Arrays;
import java.util.List;

public class UniversalConverter {
    private List<UnitConverter> converters = Arrays.asList(
            new CelsiusUnitConverter(), //0
            new FahrenheitUnitConverter(), //1
            new KelvinUnitConverter() //2
    );
    private UnitConverter sourceConverter;
    private UnitConverter targetConverter;

    @Command
    public void list() {
        for (int i = 0; i < converters.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, converters.get(i));
        }
    }

    @Command
    public void source(int idx) {
        sourceConverter = converters.get(idx - 1);
    }

    @Command
    public void target(int idx) {
        targetConverter = converters.get(idx - 1);
    }

    @Command
    public double convert(double value) {
        return 0;
    }
}

