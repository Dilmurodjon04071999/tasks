import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Dasturchilarni yaratamiz
        Developer javaDev = new JavaDeveloper();
        Developer cppDev = new CppDeveloper();

        // O'yinlar ro'yxatini shakllantiramiz
        List<Game> gameProjects = new ArrayList<>();
        
        gameProjects.add(new RacingGame(javaDev));
        gameProjects.add(new RacingGame(cppDev));
        gameProjects.add(new FootballGame(javaDev));
        gameProjects.add(new FootballGame(cppDev));

        double totalStudioBudget = 0;

        // Barcha loyihalarni ishga tushiramiz
        for (Game game : gameProjects) {
            game.displayGameSpecs();
            game.buildProject();
            totalStudioBudget += game.calculateTotalCost();
        }

        System.out.println("**************************************************");
        System.out.println(" BARCHA LOYIHALAR UCHUN UMUMIY BUSDJET: $" + totalStudioBudget);
        System.out.println("**************************************************");
    }
}