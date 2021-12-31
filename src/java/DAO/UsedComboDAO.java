package DAO;
import Model.Combo;
import Model.UsedCombo;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsedComboDAO extends DAO {

    public UsedComboDAO(){
        super();
    }

    public  ArrayList<UsedCombo> getUsedComboList(int billID) throws SQLException, ClassNotFoundException {
        connect();

        conn.close();

        ArrayList<UsedCombo> arr =new ArrayList<UsedCombo>();
        return arr;
    }

    public void newUsedCombo(Combo c, int amount, int billid) throws SQLException, ClassNotFoundException {
        connect();
            st = conn.createStatement();
            sql = "insert into tblusedcomboes values (Null,"+ c.getId()+ "," + billid +","+ amount +","+amount*c.getPrice()+") ";
        conn.close();
    }
}
