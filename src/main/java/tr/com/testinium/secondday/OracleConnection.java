package tr.com.testinium.secondday;

public class OracleConnection implements DBConnection{

    @Override
    public void connect() {
        System.out.println("Oracle Bağlandı");
    }
}
