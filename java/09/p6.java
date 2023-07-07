interface Camera {
    void clickPicture();
    void recordVideo();
}

interface MusicPlayer {
    void play();
    void pause();
    void stop();
}

class Phone {
    public void voiceCall() {
        System.out.println("Making a voice call...");
    }

    public void sendMessage() {
        System.out.println("Sending a message...");
    }
}

class SmartPhone extends Phone implements Camera, MusicPlayer {
    public void clickPicture() {
        System.out.println("Clicking picture on smartphone camera...");
    }

    public void recordVideo() {
        System.out.println("Recording video on smartphone camera...");
    }

    public void play() {
        System.out.println("Playing music on smartphone...");
    }

    public void pause() {
        System.out.println("Pausing music on smartphone...");
    }

    public void stop() {
        System.out.println("Stopping music on smartphone...");
    }
}

public class p6{
    public static void main(String[] args) {
        Phone phone = new Phone();
        SmartPhone smartphone = new SmartPhone();

        phone.voiceCall();
        phone.sendMessage();

        smartphone.voiceCall();
        smartphone.sendMessage();
        smartphone.clickPicture();
        smartphone.recordVideo();
        smartphone.play();
        smartphone.pause();
        smartphone.stop();

        // demonstrating runtime polymorphism
        Phone p = new SmartPhone();
        p.voiceCall();
        p.sendMessage();
        ((SmartPhone)p).clickPicture();
        ((SmartPhone)p).play();
    }
}