package homework_15.task_1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*Task 1
Есть студенты. У каждого студента есть номер группы, имя, фамилия, факультет. Создать XML файл, в котором описать 3-4 студента.
Прочитать из файла студентов при помощи DOM и SAX парсера*/
public class DomParser {
    static final String  PATH = "hw_15/xml/student";
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        InputStream resource = ClassLoader.getSystemResourceAsStream(PATH);
        Document document = documentBuilder.parse(resource);

        List<Student> students = new ArrayList<>();
        NodeList childNodes = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item instanceof Element) {
                Student student = new Student();

                NodeList itemChildNodes = item.getChildNodes();
                for (int j = 0; j < itemChildNodes.getLength(); j++) {
                    Node node = itemChildNodes.item(j);

                    if (node instanceof Element) {
                        String content = node.getLastChild().getTextContent().trim();
                        switch (node.getNodeName()) {
                            case "groupNum":
                                student.setGroupNum(content);
                                break;
                            case "name":
                                student.setName(content);
                                break;
                            case "surname":
                                student.setSurname(content);
                                break;
                            case "faculty":
                                student.setFaculty(content);
                                break;
                        }
                    }
                }
                students.add(student);
            }
        }
        System.out.println(students);
    }
}
