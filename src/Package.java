import java.sql.Date;

public class Package {

    public static void main(String[] args) {
        java.sql.Date newDate = new java.sql.Date(2026,12,12);
        java.util.Date newDate2 = new java.util.Date(2025,12,12);
        System.out.println(newDate.getTime());
        System.out.println(newDate2.getTime());
    }



}
