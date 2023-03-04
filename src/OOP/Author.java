package OOP;

import javax.lang.model.element.Name;

public class Author {
    String Name;
    String Email;
    char gender ; // char of 'm' or 'f'

    public Author(String name, String email, char gender) {
        Name = name;
        Email = email;
        this.gender = gender;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return String.format("Author[name = %s, email = %s, gender = %c]",Name,Email, gender);
    }
}
