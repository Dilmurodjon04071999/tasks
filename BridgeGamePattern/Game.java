public abstract class Game {
    protected Developer developer;
    protected String title;
    protected int estimatedHours; // Ketadigan vaqt (soatda)

    public Game(Developer developer, String title, int estimatedHours) {
        this.developer = developer;
        this.title = title;
        this.estimatedHours = estimatedHours;
    }

    // O'yin yaratishning to'liq jarayoni (Pipeline)
    public void buildProject() {
        System.out.println("==================================================");
        System.out.println(" LOYIHA BOSHLANDI: " + title + " [" + developer.getLanguage() + " dasturchisi bilan]");
        System.out.println("==================================================");
        
        developer.designGraphics();
        developer.writeCode();
        developer.testGame();
        
        showProjectSummary();
        System.out.println();
    }

    // Xarajatni hisoblash
    public double calculateTotalCost() {
        return estimatedHours * developer.getHourlyRate();
    }

    // Loyiha haqida qisqacha ma'lumot
    public void showProjectSummary() {
        System.out.println(" [Xulosa] Sarflangan vaqt: " + estimatedHours + " soat");
        System.out.println(" [Xulosa] Umumiy xarajat: $" + calculateTotalCost());
    }

    public abstract void displayGameSpecs();
}