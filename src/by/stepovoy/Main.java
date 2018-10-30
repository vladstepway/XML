package by.stepovoy;

import by.stepovoy.parsers.MySAXparser;
import by.stepovoy.view.Reader;
import by.stepovoy.parsers.MyDOMparser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        Reader med = new Reader("XML");
        //MyDOMparser myDOMparser = new MyDOMparser();
        //MySAXparser mySAXparser = new MySAXparser();
        med.setVisible(true);
        med.setLocationRelativeTo(null);
        //med.setlData(myDOMparser.parseFile());
        //med.setlData(mySAXparser.parseFile());
    }
}
