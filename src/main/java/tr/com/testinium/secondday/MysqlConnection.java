package tr.com.testinium.secondday;

public class MysqlConnection implements DBConnection{

    @Override
    public void connect() {
        System.out.println("Mysql bağlandı");
    }
}
