public class HiIsClone implements Cloneable {
    private int i = 9;
    SecondClone sc = new SecondClone();
    public void fop() {
        System.out.println("Tyryr");
    }
    public HiIsClone(){

    }
    @Override
    public HiIsClone clone() {
        try {
            return (HiIsClone)super.clone();
        } catch (CloneNotSupportedException ce) {
            throw new InternalError();
        }
    }
    StringBuilder str = new StringBuilder("fdhfh");
}
