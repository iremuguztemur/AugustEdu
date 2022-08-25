package tr.com.testinium.secondday;

public class Tester extends Yazilimci{

    private String qaTool;

    public void testYaz(){
        System.out.println("Qa test kodu yazıyor");
    }

    public String getQaTool() {
        return qaTool;
    }

    public void setQaTool(String qaTool) {
        this.qaTool = qaTool;
    }
}
