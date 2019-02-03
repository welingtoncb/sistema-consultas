package com.consultas.serv.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;

public final class HeaderUtil {

    private static final Logger log = LoggerFactory.getLogger(HeaderUtil.class);

    private static final String APPLICATION_NAME = "sistemaconsultas";

    public static final String MESSAGE_ERROR = "X-sys-error";

    private HeaderUtil() {
    }

    public static HttpHeaders createAlert(String message, String param) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-sys-alert", message);
        headers.add("X-sys-params", param);
        return headers;
    }

    public static HttpHeaders createEntityCreationAlert(String entityName, String param) {
        return createAlert(APPLICATION_NAME + "." + entityName + ".criado", param);
    }

    public static HttpHeaders createFailureAlert(String entityName, String defaultMessage) {
        log.error("Processamento da entidade falhou, {}", defaultMessage);
        HttpHeaders headers = new HttpHeaders();
        headers.add(MESSAGE_ERROR, defaultMessage);
        headers.add("X-sys-params", entityName);
        return headers;
    }
}