/**
 * Байт-буфер
 * може містити як відео-, так і аудіо- потік
 */
public class Buffer {

    public Buffer(String buffer) {
        this.buffer = buffer;
    }

    private final String buffer;

    /**
     * @return потік інформації
     */
    public String getData() {
        return buffer;
    }
}
