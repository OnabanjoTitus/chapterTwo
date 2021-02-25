

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Accounts {
    @XmlElement(name="account")
    List<Account> accounting= new ArrayList<Account>();

    public List<Account> getAccounts() {

        return accounting;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounting = accounts;
    }
}
