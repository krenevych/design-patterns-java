/**
 * Інструмент для додавання/заміни звукової доріжки до відеофайлу
 */
public class AudioMixer {
    /**
     * Замінює аудіодоріжку у відеофайлі
     *
     * @param videoFile  відеофайл
     * @param audioBuffer буфер аудіодоріжки
     */
    public void fix(VideoFile videoFile, Buffer audioBuffer) {
        System.out.println("AudioMixer: fixing audio...");
        videoFile.setAudioBuffer(audioBuffer);
    }
}