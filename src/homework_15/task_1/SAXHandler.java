package homework_15.task_1;

import homework_15.entity.Student;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXHandler extends DefaultHandler {
    List<Student> studentList = new ArrayList<>(); // private
    Student std = null; // private
    String content = null; // private

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            //Create a new Employee object when the start tag is found
            case "employee":
                std = new Student();
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "student":
                studentList.add(std);
                break;
            case "groupNum":
                std.setGroupNum(content);
                break;
            case "name":
                std.setName(content);
                break;
            case "surname":
                std.setSurname(content);
                break;
            case "faculty":
                std.setFaculty(content);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String content = String.copyValueOf(ch, start, length).trim();
    }
}
