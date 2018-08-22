package typeinfo.factory;

public class CaseType {
    private void heIsPrivate() {
        System.out.println("I am private");
    }
    protected void heIsProtected() {
        System.out.println("I am protected");
    }
    public void heIsPublic() {
        System.out.println("I am public");
    }
}
