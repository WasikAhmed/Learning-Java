package OOP.SetterAndGetter;

public class Player {
    
    public String Name, ClubName, Position;
    public int Age;
    public double Price;

    // set methods
    public void setName(String name) {
        Name = name;
    }

    public void setClubName(String clubName) {
        ClubName = clubName;
    }

    public void setPosition(String position){
        Position = position;
    }

    public  void setAge(int age) {      
        Age=age;    
    }

    public  void setPrice(double price) {
        Price = price;
    }

    // get methods
    public String getName() {
        return Name;
    }

    public String getClubName() {
        return ClubName;
    }

    public String getPosition() {
        return Position;
    }

    public int getAge() {
        return Age;
    }

    public double getPrice() {
        return Price;
    }

    // printing player details
    public  void PrintDetails() {
        // System.out.println("details:");
        // System.out.println(Name);
        // System.out.println(ClubName);
        // System.out.println(Position);
        // System.out.println(Age);
        // System.out.println(Price);

        System.out.println(getName());
        System.out.println(getClubName());
        System.out.println(getPosition());
        System.out.println(getAge());
        System.out.println(getPrice());
    }


    public static void main(String[] args) {
  
        Player p1 = new Player();
        p1.setName("MESSI");
        p1.setClubName("Inter Miami");
        p1.setPosition("RWF");
        p1.setAge(40);
        p1.setPrice(5000000.34);
        p1.PrintDetails();

        Player p2 = new Player();
        p2.setName("DE MARIA");
        p2.setClubName("SEVILA");
        p2.setPosition("LWF");
        p2.setAge(35);
        p2.setPrice(5000000.34);
        p2.PrintDetails();

    }
}
