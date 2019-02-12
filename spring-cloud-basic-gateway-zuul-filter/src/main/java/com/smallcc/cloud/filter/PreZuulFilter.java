package com.smallcc.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
  *
  * @description
  * @author 晓风过境
  * @date 2019/1/22 23:08
  * @param
  * @return com.smallcc.cloud.filter
  * @title com.smallcc.cloud.filter
  * @project_name PreZuulFilter.java
  */

public class PreZuulFilter extends ZuulFilter{
    private final static Logger log = LoggerFactory.getLogger(PreZuulFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String host = request.getRemoteHost();
        log.debug("this host is : {}",host);
        return null;
    }
}
