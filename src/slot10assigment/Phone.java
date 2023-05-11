package slot10assigment;
import java.util.ArrayList;


public abstract class Phone {

    public abstract void insertPhone(String name,String phone);
    public abstract void removePhone( String name);
    public abstract void updatePhone(String name,String oldPhone, String newPhone);
    public abstract PhoneNumber searchPhoneNumber(String name);

    public abstract void sort() ;



}

