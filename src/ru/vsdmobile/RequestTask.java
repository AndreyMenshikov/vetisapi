package ru.vsdmobile;

import ru.vetrf.api.schema.cdm.application.ws_definitions.ReceiveApplicationResultResponse;

public class RequestTask {
	
	/**
	 * Заявка, которая инициировала последовательность запросов-заявок
	 */
	public ApplicationTask initialApplicationTask;

	/**
	 * Ответ на заявку, если он поступил
	 */
	public ReceiveApplicationResultResponse response;
		
	/**
	 * Итоговый статус инициирующей заявки
	 */
	public TASK_STATUS initialTaskStatus;
	
	public String outgoingHttpDump;
	public String incomingHttpDump;
	public String faultHttpDump;

	public String message;



}
