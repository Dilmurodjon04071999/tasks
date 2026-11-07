public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("   [Code] Java (Spring Boot & LibGDX) yordamida o'yin mantig'i yozilmoqda...");
    }

    @Override
    public void designGraphics() {
        System.out.println("   [Graphics] Java 3D motori va OpenGL orqali grafikalar ishlanmoqda...");
    }

    @Override
    public void testGame() {
        System.out.println("   [Testing] JUnit va Mockito yordamida testlar o'tkazilmoqda...");
    }

    @Override
    public double getHourlyRate() {
        return 35.0; // Soatiga $35
    }

    @Override
    public String getLanguage() {
        return "Java";
    }
}