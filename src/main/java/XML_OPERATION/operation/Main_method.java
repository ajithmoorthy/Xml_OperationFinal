package XML_OPERATION.operation;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class Main_method {
	public void Xml_Operation() throws XPathExpressionException, ParserConfigurationException, TransformerException,
			SAXException, IOException {
		App app = new App();
		app.Menu();
	}
}
