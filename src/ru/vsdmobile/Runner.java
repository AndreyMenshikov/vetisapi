package ru.vsdmobile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;

import ru.vetrf.api.schema.cdm.application.Application;
import ru.vetrf.api.schema.cdm.application.ApplicationDataWrapper;
import ru.vetrf.api.schema.cdm.application.ws_definitions.ReceiveApplicationResultResponse;
import ru.vetrf.api.schema.cdm.mercury.g2b.applications.v2.ModifyEnterpriseRequest;

public class Runner {

	public static void main(String[] args) {


	}

	protected static void parseList(Application application) {
		// TODO Auto-generated method stub

	}

	public static void printXML(Object obj) {
		StringWriter writer = new StringWriter();
		printXML(obj, writer);
		String str = writer.getBuffer().toString();
		System.out.println(str);
	}

	public static void printXML(Object obj, Writer writer) {
		try {
			JAXBContext context = JAXBContext.newInstance(obj.getClass());
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(obj, writer);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void printXML(Object obj, String filename) {
		String path = "c:\\temp\\vetis\\";
		try {
			JAXBContext context = JAXBContext.newInstance(obj.getClass());
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			FileWriter writer = new FileWriter(path.concat(filename));
			m.marshal(obj, writer);
			writer.close();
		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
