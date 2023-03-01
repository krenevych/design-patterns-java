import com.mobile.Legacy.Charger;
import com.mobile.Legacy.MobilePhone;

public class Main {

    public static void main(String[] args) {
        Charger charger = new Charger(5.0f, 1.0f);

        System.out.println("\n============= MicroUsb ==============\n");
        MobilePhone phone = new MobilePhone();
        phone.charge(20);
        phone.pluginCharger(charger);
        phone.charge(20);
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());

        System.out.println("\n============= Type-C ==============\n");
        FastCharge fastCharge = new FastCharge(18);

        SamsungS22 samsungS22 = new SamsungS22();
        samsungS22.makeCall();
        samsungS22.pluginCharger(fastCharge);
        samsungS22.charge(30);
        printBatteryStatus(samsungS22);
        samsungS22.makeCall();
        printBatteryStatus(samsungS22);
        samsungS22.unplugCharger();
        samsungS22.charge(10);
        printBatteryStatus(samsungS22);



//        TODO: implement and use adapter USB => Type-C
//        AdapterMicroUsbToTypeC adapterMicroUsbToTypeC = new AdapterMicroUsbToTypeC(charger);
//        System.out.println("Charging throughout first adapter");
//        samsungS22.pluginCharger(adapterMicroUsbToTypeC);
//        samsungS22.charge(10);
//        printBatteryStatus(samsungS22);


//        TODO: implement and use adapter Type-C => USB
//        System.out.println("Maintaining legacy charging");
//        phone.pluginCharger(new AdapterTypeCToMicroUsb(fastCharge));
//        phone.charge(20);
//        System.out.printf("Current power status = %s%n", phone.getChargingPercent());

    }

    private static void printBatteryStatus(SamsungS22 phone){
        System.out.printf("Current battery status = %s%n", phone.getChargingPercent());
    }

}
