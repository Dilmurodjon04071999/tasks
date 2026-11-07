public class FootballGame extends Game {

    public FootballGame(Developer developer) {
        super(developer, "FIFA World League 2026", 200); // 200 soat vaqt ketadi
    }

    @Override
    public void displayGameSpecs() {
        System.out.println("O me'yoriy Turi: Futbol (Sports) | AI va Ko'p foydalanuvchili rejim muhim!");
    }
}