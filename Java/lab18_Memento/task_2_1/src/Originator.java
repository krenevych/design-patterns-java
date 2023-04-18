public class Originator {

    static public class Memento {
        final private String state;

        public Memento(String state) {
            this.state = state;
        }
    }

    public Memento save(){
        return new Memento(state);
    }

    public void restore(Memento memento){
        state = memento.state;
    }

    /**
     * Цей параметр моделює стан нашого об'єкту
     */
    private String state = "";

   //    Технічні методи встановлення та друкування стану

    /**
     * Виводить стан об'єкту в консоль
     */
    public void printState() {
        System.out.println(state);
    }

    /**
     * Оновлює стан конкатенуючи до поточного стану заданий рядок
     * @param toUpdate параметр, що додається до об'єкту
     */
    public void updateState(String toUpdate) {
        this.state += toUpdate;
    }
}
