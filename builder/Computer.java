package builder;

public class Computer {
    private String cpu;
    private String ram;
    private String os;
    private String storage;
    private String keyboardAndTouchpad;

    // Private konstruktor
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.os = builder.os;
        this.storage = builder.storage;
        this.keyboardAndTouchpad = builder.keyboardAndTouchpad;
    }

    // Static Builder klassi
    public static class ComputerBuilder {
        private String cpu;
        private String ram;
        private String os;
        private String storage;
        private String keyboardAndTouchpad;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(int size, boolean upgradable) {
            this.ram = size + " GB (Upgradable: " + upgradable + ")";
            return this;
        }

        public ComputerBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setKeyboardAndTouchpad(String details) {
            this.keyboardAndTouchpad = details;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", ram=" + ram + ", os=" + os + 
               ", storage=" + storage + ", keyboardAndTouchpad=" + keyboardAndTouchpad + "]";
    }
}