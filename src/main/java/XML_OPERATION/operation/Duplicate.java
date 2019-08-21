package XML_OPERATION.operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Duplicate {
	static String username;
	static Scanner sc = new Scanner(System.in);

	static Document insertion(File file, int Employee_id) throws ParserConfigurationException, SAXException,
			IOException, XPathExpressionException, TransformerException {
		FileInputStream fileInputStream = new FileInputStream(file);
		DocumentBuilderFactory documentbuildfact = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentbuild = documentbuildfact.newDocumentBuilder();
		Document document = documentbuild.parse(fileInputStream);
		document.getDocumentElement().normalize();
		Element Employe = document.getDocumentElement();
		Element example = (Element) Employe.getChildNodes().item(0);
		Element subEle = document.createElement(example.getTagName());
		Employe.appendChild(subEle);
		Attr attribute = document.createAttribute("id");
		// System.out.println("Enter the id value");
		attribute.setValue(Integer.toString(Employee_id));
		subEle.setAttributeNode(attribute);
		NodeList nodelist = document.getElementsByTagName("*");
		subElements sub = new subElements();
		document = sub.SubElements(nodelist, document, subEle);
		System.out.println("Successfully updated");
		return document;

	}

}
