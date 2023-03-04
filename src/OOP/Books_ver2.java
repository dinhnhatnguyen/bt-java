package OOP;

public class Books_ver2 {
    String name;
    Author[] author ;
    double price;
    int qty = 0;

    public Books_ver2(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorNames()
    {
        String tmp = "";
        for (Author author:author) {
            tmp += author.Name + ",";
        }
        if(!tmp.isEmpty())
        {
            tmp.substring(0,tmp.length()-1);
        }
        return  tmp;
    }

    @Override
    public String toString() {
        String authorString = "";
        for (Author author:author) {
            authorString += author.toString() + "'";
        }
        if(!authorString.isEmpty())
        {
            authorString.substring(0,authorString.length()-1);
        }
        return String.format("Book[Name = %s, author = {%s}, price = %f, qty = %d ]",name,authorString,price,qty);
    }
}
