package by.stepovoy.parsers;

import by.stepovoy.entity.Category;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public interface Parseable {
    String DIRECTORY = "src/by/stepovoy/files/";

    ArrayList<Category> parseFile() throws IOException, SAXException, ParserConfigurationException;
}
