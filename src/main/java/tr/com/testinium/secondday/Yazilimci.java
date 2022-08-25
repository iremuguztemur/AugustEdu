package tr.com.testinium.secondday;

public class Yazilimci extends Insan{

    private String ide;
    private String sirket;

    public void konus(){
        System.out.println("Yazilimci konusuyor.");
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public String getSirket() {
        return sirket;
    }

    public void setSirket(String sirket) {
        this.sirket = sirket;
    }
}
