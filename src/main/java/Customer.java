import javax.persistence.*;

@Entity(name="Customer")
@Table(name="customers")
public class Customer {
    private String fName;
    private String lName;
    private String email;
    private String address;
    private int toNextReward;
    private int rewards;
    private int ID;

    public Customer(){

    }

    //Getters and Setters

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getToNextReward() {
        return toNextReward;
    }

    public void setToNextReward(int toNextReward) {
        this.toNextReward = toNextReward;
    }

    public int getRewards() {
        return rewards;
    }

    public void setRewards(int rewards) {
        this.rewards = rewards;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
