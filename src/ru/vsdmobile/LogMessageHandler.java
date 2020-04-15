package ru.vsdmobile;

import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class LogMessageHandler implements SOAPHandler<SOAPMessageContext> {

	public interface ILogger {
		void outgoing(SOAPMessage msg);
		void incoming(SOAPMessage msg);
		void fault(SOAPMessage msg);
	}

	private final ILogger logger;

	public LogMessageHandler(ILogger logger) {
		this.logger = logger;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		SOAPMessage msg = context.getMessage();
		Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (outboundProperty.booleanValue()) {
			logger.outgoing(msg);
		} else {
			logger.incoming(msg);
		}

		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		SOAPMessage msg = context.getMessage();
		logger.fault(msg);
		return true;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<QName> getHeaders() {
		return Collections.EMPTY_SET;
	}

}
