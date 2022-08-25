package tr.com.testinium.secondday;

public class Developer extends Yazilimci{

    private String devTool;


    public void kodYaz(){
        System.out.println("Dev kodu yazıyor");
    }

    public String getDevTool() {
        return devTool;
    }

    public void setDevTool(String devTool) {
        this.devTool = devTool;
    }
}
