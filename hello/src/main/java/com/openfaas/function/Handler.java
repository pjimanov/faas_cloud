package com.openfaas.function;

import com.openfaas.model.IHandler;
import com.openfaas.model.IResponse;
import com.openfaas.model.IRequest;
import com.openfaas.model.Response;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Handler implements com.openfaas.model.IHandler {

    public IResponse Handle(IRequest req) {
        Response res = new Response();
        SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
	    dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
        res.setBody("Hello, Pav...");
        res.setBody(dateTimeInGMT.format(new Date()));
	    return res;
    }
}
