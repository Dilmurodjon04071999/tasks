public class Main {
    public static void main(String[] args) {
        Folder computer = new Folder("Computer");

        Folder documents = new Folder("Documents");
        Folder photos = new Folder("Photos");

        documents.add(new File("resume.pdf"));
        documents.add(new File("homework.docx"));

        photos.add(new File("photo1.jpg"));
        photos.add(new File("photo2.jpg"));

        computer.add(documents);
        computer.add(photos);
        computer.add(new File("music.mp3"));

        computer.show();
    }
}