import com.mobile.Legacy.MicroUsbCharger;

public class AdapterMicroUsbToTypeC implements TypeCCharger {

    public AdapterMicroUsbToTypeC(MicroUsbCharger microUsbCharger) {
        this.microUsbCharger = microUsbCharger;
    }

    final MicroUsbCharger microUsbCharger;

    @Override
    public float getOutputPower() {
        return microUsbCharger.getOutputVoltage() *
                microUsbCharger.getOutputAmperage();
    }
}
