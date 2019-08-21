package XML_OPERATION.operation;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class MenuCreater {
	static int choice;
	static Scanner sc = new Scanner(System.in);

	void Menu1(File file) throws ParserConfigurationException, TransformerException, SAXException, IOException,
			XPathExpressionException {

		while (true) {

			System.out.println("***********************Xml File Operation******************");
			System.out.println(" 1)Create Structure \n 2)Insert \n 3)Delete \n 4)Search \n 5)update All Data");
			System.out.println("choose operation");
			System.out.println("============================================================");
			choice = Choice();
			switch (choice) {
			case 1:
				if (file.exists()) {
					System.out.println("Xml file Structure is Already Created");
				} else {
					Creater creater = new Creater();
					file = creater.createXMl(file);
				}
				break;
			case 2:
				if (file.exists()) {
					Inserter ins = new Inserter();
					ins.insertion(file);
				} else {
					System.out.println("File Structure is not created go and create Structure of file");
				}
				break;
			case 3:
				if (file.exists()) {
					Remover remover = new Remover();
					remover.delete(file);
				} else {
					System.out.println("File Structure is not created go and create Structure of file");
				}
				break;
			case 4:
				if (file.exists()) {
					Selector selector = new Selector();
					selector.search(file);
				} else {
					System.out.println("File Structure is not created go and create Structure of file");
				}
				break;
			case 5:
				if (file.exists()) {
					Updater updater = new Updater();
					updater.updation(file);
				} else {
					System.out.println("File Structure is not created go and create Structure of file");
				}
				break;
			default:
				System.out.println("Please enter the correct choice( like 1,2 etc)");
				break;

			}
		}

	}

	public int Choice() {
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("Please enter the integer options");
			sc.nextLine();
			Choice();
		}
		return choice;
	}
}
