package Author;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Dmitry", "in love",'M');
        System.out.println(a1);
        a1.setRelationship("in love");
        System.out.println(a1);
    }
}