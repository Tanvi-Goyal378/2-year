@FunctionalInterface
interface LightBehavior {
    void activate();
}

public class SmartLightAutomation {
    public static void main(String[] args) {
        LightBehavior motionDetected = () -> 
            System.out.println("🔆 Motion detected! Turning lights ON at full brightness.");
        LightBehavior eveningMode = () -> 
            System.out.println("🌇 Evening time! Setting warm dim lighting.");
        LightBehavior voiceCommand = () -> 
            System.out.println("🎙 Voice command received! Changing light color to blue.");

        triggerLight("motion", motionDetected);
        triggerLight("evening", eveningMode);
        triggerLight("voice", voiceCommand);
    }

    static void triggerLight(String trigger, LightBehavior behavior) {
        System.out.println("\nTrigger: " + trigger);
        behavior.activate();
    }
}
