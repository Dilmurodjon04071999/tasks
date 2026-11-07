public class RacingGame extends Game {

    public RacingGame(Developer developer) {
        super(developer, "Need For Speed Ultra", 120); // 120 soat vaqt ketadi
    }

    @Override
    public void displayGameSpecs() {
        System.out.println("O'yin Turi: Poyga (Racing) | Fizika va Fizik Motor Muhim!");
    }
}