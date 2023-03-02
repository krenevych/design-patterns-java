import com.mobile.Legacy.Charger;
import com.mobile.Legacy.MicroUsbCharger;

public class AdapterMicroUsbToTypeCInheritance extends Charger implements TypeCCharger {


    public AdapterMicroUsbToTypeCInheritance(float voltage, float amperage) {
        super(voltage, amperage);
    }

    @Override
    public float getOutputPower() {
        return getOutputVoltage() *
                getOutputAmperage();
    }


}
