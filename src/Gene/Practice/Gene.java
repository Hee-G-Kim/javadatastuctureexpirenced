package Gene.Practice;

public class Gene {

    String firstName = "Gene";
    String lastName = "Kim";
//    String hobby = "Tennis";
//    String origin = "Korea";
    int id = 1;

    public String getFirstName(){
            return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
            this.lastName = lastName;
    }
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }
    public Gene(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName= lastName;
        this.id = id;
    }
}
