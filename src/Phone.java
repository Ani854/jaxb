import javax.xml.bind.annotation.XmlTransient;

public class Phone {
    private int number;
    private String country;

    public Phone(int number, String country) {
        this.number = number;
        this.country = country;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    @XmlTransient
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", country='" + country + '\'' +
                '}';
    }
}
