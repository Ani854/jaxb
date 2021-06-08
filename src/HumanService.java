import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class HumanService {
    public static final String FILE_NAME = "human";

    public static void writer(Human human) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Human.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(human, new File(FILE_NAME));
        marshaller.marshal(human, System.out);//console
        System.out.println("----------------------------");
    }

    public static Human read() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Human.class);
        Human human = (Human) context.createUnmarshaller().unmarshal(new File(FILE_NAME));
        return human;
    }
}
