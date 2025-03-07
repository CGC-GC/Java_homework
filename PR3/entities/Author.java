package PR3.entities;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author (String n, String e, char g){
        name = n;
        email = e;
        gender = g;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        return this.name + " (" + this.gender + ") at " + this.email + " ";
    }
}
