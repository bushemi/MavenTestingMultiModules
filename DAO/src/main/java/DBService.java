public class DBService {
public static final String DB_NAME="MyDbForMVN";

private static DBService instance;
private static Object key = new Object();

private DBService(){}

public static DBService getInstance(){
   synchronized (key) {
       if (instance==null){
       instance = new DBService();}
   }

   return instance;
}
}
