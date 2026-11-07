public class CharacterFactory {
    private GameCharacter prototype;

    // Konstruktor prototip qabul qiladi
    public CharacterFactory(GameCharacter prototype) {
        this.prototype = prototype;
    }

    // Prototipni almashtirish metodi
    public void setCharacter(GameCharacter prototype) {
        this.prototype = prototype;
    }

    // Yangi nusxa qaytaruvchi metod
    public GameCharacter cloneCharacter() {
        return prototype.clone();
    }
}