package by.itacademy.artsiommitskevich.speak;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Speak {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Введите текст: ");
        String text = String.valueOf(reader.readLine());

        speak(text);
    }

    public static void speak(String text){

        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice voice = voiceManager.getVoice("kevin16");

        if (voice != null) {
            voice.allocate();
            System.out.println(voice.speak(text));
            voice.deallocate();
        }else {
            System.out.println("Голос не найден");
        }
    }
}
