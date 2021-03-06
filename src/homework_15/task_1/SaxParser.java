package homework_15.task_1;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class SaxParser {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, XMLStreamException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        SAXHandler saxHandler = new SAXHandler();
        saxParser.parse(ClassLoader.getSystemResourceAsStream("hw_15/xml/student"),saxHandler);
    }
}
