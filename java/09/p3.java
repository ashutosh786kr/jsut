abstract class MobilePhone {
    public void voiceCall() {
        System.out.println("Making a voice call...");
    }

    public abstract void displayCamera();
    public abstract void displayTouchscreen();
}

class RedmiPhone extends MobilePhone {
    public void displayCamera() {
        System.out.println("Displaying Redmi phone camera...");
    }

    public void displayTouchscreen() {
        System.out.println("Displaying Redmi phone touchscreen...");
    }

    public void fingerPrint() {
        System.out.println("Fingerprint authentication successful on Redmi phone.");
    }

    public void turboCharge() {
        System.out.println("Turbocharging Redmi phone...");
    }
}

class SamsungPhone extends MobilePhone {
    public void displayCamera() {
        System.out.println("Displaying Samsung phone camera...");
    }

    public void displayTouchscreen() {
        System.out.println("Displaying Samsung phone touchscreen...");
    }

    public void fingerPrint() {
        System.out.println("Fingerprint authentication successful on Samsung phone.");
    }
}

class NokiaPhone extends MobilePhone {
    public void displayCamera() {
        System.out.println("Displaying Nokia phone camera...");
    }

    public void displayTouchscreen() {
        System.out.println("Displaying Nokia phone touchscreen...");
    }
}

public class p3{
    public static void main(String[] args) {
        MobilePhone redmi = new RedmiPhone();
        MobilePhone samsung = new SamsungPhone();
        MobilePhone nokia = new NokiaPhone();

        redmi.voiceCall();
        redmi.displayCamera();
        redmi.displayTouchscreen();
        ((RedmiPhone)redmi).fingerPrint();
        ((RedmiPhone)redmi).turboCharge();

        samsung.voiceCall();
        samsung.displayCamera();
        samsung.displayTouchscreen();
        ((SamsungPhone)samsung).fingerPrint();

        nokia.voiceCall();
        nokia.displayCamera();
        nokia.displayTouchscreen();
    }
}