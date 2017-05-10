package uconverter;


import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.List;

public class ConverterController {
    public ComboBox<UnitConverter> srcUnit;
    public ComboBox<UnitConverter> trgUnit;
    public TextField srcValue;
    public TextField trgValue;
    UniversalConverter converter = new UniversalConverter();

    public void initialize() {
        List<UnitConverter> units = converter.getConverters();
        srcUnit.getItems().setAll(units);
        trgUnit.getItems().setAll(units);

    }

    public void convert(ActionEvent actionEvent) {
        String s = srcValue.getText();
        double val = Double.parseDouble(s);
        UnitConverter src = srcUnit.getValue();
        UnitConverter trg = trgUnit.getValue();
        double si = src.toSI(val);
        double result =  trg.fromSI(si);


        String resStr = Double.toString(result);
        trgValue.setText(resStr);
    }
}