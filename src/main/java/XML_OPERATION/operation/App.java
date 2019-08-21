package XML_OPERATION.operation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

/**
 * Hello world!
 *
 */
public class App {
	static Scanner sc = new Scanner(System.in);

	static void Menu() throws ParserConfigurationException, TransformerException, SAXException, IOException,
			XPathExpressionException {
		System.out.println(" Enter the file Name");
		String fileName = sc.next();
		fileName = System.getProperty("user.home") + "\\Desktop\\" + fileName + ".xml";
		File file = new File(fileName);
		if (file.exists()) {
			System.out.println("Already you have the file And You go with the existing file");
			MenuCreater creater = new MenuCreater();
			creater.Menu1(file);
		} else {
			System.out.println("New file created");
			MenuCreater creater = new MenuCreater();
			creater.Menu1(file);
		}
	}

}
