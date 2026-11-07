package builder;

public class Program {
    public static void main(String[] args) {
        // Builder yordamida moslashuvchan kompyuter obyektini yaratamiz
        Computer myLaptop = new Computer.ComputerBuilder()
                .setCpu("Intel Core i7-13700H")
                .setRam(16, true)
                .setOs("Windows 11 Pro")
                .setStorage("1TB NVMe SSD")
                .setKeyboardAndTouchpad("RGB Backlit Keyboard + Precision Touchpad")
                .build();

        // Ekranga chiqaramiz
        System.out.println(myLaptop);
    }
}