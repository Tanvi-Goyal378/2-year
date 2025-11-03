interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("💡 Light is ON");
    }
    public void turnOff() {
        System.out.println("💡 Light is OFF");
    }
}

class AirConditioner implements SmartDevice {
    public void turnOn() {
        System.out.println("❄️ Air Conditioner is ON");
    }
    public void turnOff() {
        System.out.println("❄️ Air Conditioner is OFF");
    }
}

class Television implements SmartDevice {
    public void turnOn() {
        System.out.println("📺 TV is ON");
    }
    public void turnOff() {
        System.out.println("📺 TV is OFF");
    }
}

public class SmartDeviceControl {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new Television();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
