package by.itacademy.artsiommitskevich.numbers;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Numbers {

    public static void main(String[] args) {

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice voice = voiceManager.getVoice("kevin16");

        if (voice != null) {
            voice.allocate();
            for (int i = 0; i < 10; i++) {
                System.out.println("говорит: " + i);
                voice.speak(String.valueOf(i));
            }
            voice.deallocate();
        } else {
            System.out.println("голос не найден");
        }
    }
}
