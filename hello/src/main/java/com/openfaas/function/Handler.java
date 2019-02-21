package com.openfaas.function;

import com.openfaas.model.IHandler;
import com.openfaas.model.IResponse;
import com.openfaas.model.IRequest;
import com.openfaas.model.Response;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Base64;
public class Handler implements com.openfaas.model.IHandler {

    public IResponse Handle(IRequest req) {
        Response res = new Response();
       //SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
       //dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));
       //res.setBody(dateTimeInGMT.format(new Date()));
	res.setBody(Base64.getDecoder().decode("PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiID8+Cjxzdmcgd2lkdGg9IjM5MSIgaGVpZ2h0PSIzOTEiIHZpZXdCb3g9Ii03MC41IC03MC41IDM5MSAzOTEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+CiAgPHJlY3QgeD0iMjUiIHk9IjI1IiB3aWR0aD0iMjAwIiBoZWlnaHQ9IjIwMCIgZmlsbD0ibGltZSIgc3Ryb2tlLXdpZHRoPSI0IiBzdHJva2U9InBpbmsiIC8+CiAgPGNpcmNsZSBjeD0iMTI1IiBjeT0iMTI1IiByPSI3NSIgZmlsbD0ib3JhbmdlIiAvPgogIDxwb2x5bGluZSBwb2ludHM9IjUwLDE1MCA1MCwyMDAgMjAwLDIwMCAyMDAsMTAwIiBzdHJva2U9InJlZCIgc3Ryb2tlLXdpZHRoPSI0IiBmaWxsPSJub25lIiAvPgogIDxsaW5lIHgxPSI1MCIgeTE9IjUwIiB4Mj0iMjAwIiB5Mj0iMjAwIiBzdHJva2U9ImJsdWUiIHN0cm9rZS13aWR0aD0iNCIgLz4KPC9zdmc+"));
	return res;
    }
}
