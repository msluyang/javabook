package org.gof.behavioral.patterns11.intercepting.httpfilter;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.gof.behavioral.patterns10.visitor.validation.app.ValidatorUtils;
import org.gof.behavioral.patterns10.visitor.validation.other.ValidatorResponse;
import org.gof.behavioral.patterns11.intercepting.app.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class HttpRequestBodyInterceptor implements IHttpRequestInterceptor {

    private ValidatorUtils dataValidator = new ValidatorUtils();

    @Override
    public void execute(HttpRequest request) throws HttpException, IOException {
        if(request instanceof HttpEntityEnclosingRequest) {
            HttpEntity httpEntity = ((HttpEntityEnclosingRequest)(request)).getEntity();
            InputStream inputStream = httpEntity.getContent();
            InputStreamReader reader = new InputStreamReader(inputStream);
            Gson gson = new Gson();
            User obj = gson.fromJson(reader, User.class);
            List<ValidatorResponse> responses = null;
            try {
                responses = dataValidator.validate(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if(responses.size()>0) {
                throw new HttpException("400");
            }
        }
        System.out.println("check body OK");
    }
}
