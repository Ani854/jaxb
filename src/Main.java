import javax.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(123456, "Samsung");
        Human human = new Human("Ani", 22, phone);
        Human human2 = new Human("Karen", 19, phone);
        try {
            HumanService.writer(human);
            HumanService.writer(human2);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            Human human1 = HumanService.read();
            System.out.println(human1);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
