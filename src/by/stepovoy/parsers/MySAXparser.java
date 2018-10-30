package by.stepovoy.parsers;

import by.stepovoy.entity.Category;
import by.stepovoy.entity.Office;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;


public class MySAXparser implements Parseable {


    @Override
    public ArrayList<Category> parseFile() throws SAXException, ParserConfigurationException, IOException {

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        XMLReader xmlReader = saxParser.getXMLReader();

        MyHandler myHandler = new MyHandler();

        xmlReader.setContentHandler(myHandler);
        xmlReader.parse(DIRECTORY+"office.xml");

        Office office = myHandler.getOffice();

        System.out.println("Office name : " + office.getName());
        return office.getCategoryList();
    }
}


