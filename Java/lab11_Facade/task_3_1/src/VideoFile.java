/**
 * Клас відеофайл
 */
public class VideoFile {
    private final String name;        // ім'я файлу (без розширення)
    private final String codecType;   // тип відеокодека
    private final Buffer videlBuffer;  // буфер відео
    private Buffer audioBuffer;        // буфер аудіо

    public VideoFile(String name, Buffer videlBuffer, Buffer audioBuffer) {
        this.videlBuffer = videlBuffer;
        this.audioBuffer = audioBuffer;

        if (!name.contains(".")) {
            throw new RuntimeException("File format is undefined!");
        }

        this.name = name.substring(0, name.lastIndexOf("."));
        this.codecType = name.substring(name.lastIndexOf(".") + 1);
    }

    public VideoFile(String name, Buffer videlBuffer) {
        this(name, videlBuffer, null);
    }

    /**
     * Повертає тип кодека яким стиснено файл
     * @return тип кодека
     */
    public String getCodecType() {
        return codecType;
    }

    /**
     * Повертає відеобуфер відеофайлу
     * @param codec для розкодування
     * @return відеобуфер відеофайлу або null, якщо кодек не підходить для розкодування
     */
    public Buffer getVidelBuffer(Codec codec) {
        if (codec.type().equals(getCodecType())) {
            return videlBuffer;
        } else {
            return null;
        }
    }

    /**
     * Повертає аудіобуфер відеофайлу
     * @param audioBuffer аудіобуфер для встановлення
     */
    public void setAudioBuffer(Buffer audioBuffer) {
        this.audioBuffer = audioBuffer;
    }

    /**
     * Повертає аудіобуфер відеофайлу
     * @return аудіобуфер відеофайлу
     */
    public Buffer getAudioBuffer() {
        return audioBuffer;
    }

    /**
     * @return Ім'я файлу
     */
    public String getName() {
        return name;
    }

    /**
     * Програє відео за допомогою заданого кодека
     * @param codec кодек для розкодування відео
     */
    public void play(Codec codec) {
        if (codec.type().equals(codecType)) {
            System.out.println("Video data:" + videlBuffer.getData());
            if (audioBuffer == null){
                System.out.println("Audio data is inaccessible!");
                return;
            }
            System.out.println("Audio data:" + audioBuffer.getData());
        } else {
            System.out.printf("Failed to play file '%s'! Codec '%s' required! Use correct codec!\n", name, codecType);
        }
    }
}