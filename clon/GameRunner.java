

public class GameRunner {
    public static void main(String[] args) {
        // 1. Bitta original qahramon yaratish (id: olib tashlandi)
        GameCharacter original = new GameCharacter(1, "Warrior", 10, "Qilich");
        System.out.println("Original qahramon: " + original);

        // 2. Uni CharacterFactory ga uzatish
        CharacterFactory factory = new CharacterFactory(original);

        // 3. Prototipdan ikkita nusxa yaratish
        GameCharacter clone1 = factory.cloneCharacter();
        GameCharacter clone2 = factory.cloneCharacter();

        // 4. Nusxalarning nomi, darajasi va qurolini o'zgartirish (name: olib tashlandi)
        clone1.setName("Mage");
        clone1.setLevel(15);
        clone1.setWeapon("Sehrli Aso");

        clone2.setName("Archer");
        clone2.setLevel(12);
        clone2.setWeapon("Kamon");

        System.out.println("\n--- O'zgartirilgan nusxalar ---");
        System.out.println("1-nusxa (Clone 1): " + clone1);
        System.out.println("2-nusxa (Clone 2): " + clone2);

        // 5. Original qahramon o'zgarmaganini tekshirish
        System.out.println("\n--- Original qahramon holati ---");
        System.out.println("Original qahramon: " + original);

        // Qo'shimcha talab tekshiruvi: original == clone natijasi false bo'lishi lozim
        System.out.println("\n--- Qo'shimcha shart tekshiruvi ---");
        boolean isEqual = (original == clone1);
        System.out.println("original == clone1 natijasi: " + isEqual); // false chiqishi kerak
        System.out.println("(original != clone1) shartining bajarilishi: " + !isEqual); // true chiqishi kerak
    }
}