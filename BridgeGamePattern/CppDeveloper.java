public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("   [Code] C++ (Unreal Engine 5) yordamida yuqori tezlikdagi kod yozilmoqda...");
    }

    @Override
    public void designGraphics() {
        System.out.println("   [Graphics] Ray Tracing va High-End 3D grafikalar render qilinmoqda...");
    }

    @Override
    public void testGame() {
        System.out.println("   [Testing] C++ xotira (Memory Leak) va resurslar testi o'tkazilmoqda...");
    }

    @Override
    public double getHourlyRate() {
        return 50.0; // Soatiga $50
    }

    @Override
    public String getLanguage() {
        return "C++";
    }
}