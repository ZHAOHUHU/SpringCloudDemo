package com.example.zuuldemo;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public Object run() {
        final RequestContext context = RequestContext.getCurrentContext();
        final HttpServletRequest request = context.getRequest();
        final String token = request.getParameter("token");
        if(token==null){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("you are wrong");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }


}
