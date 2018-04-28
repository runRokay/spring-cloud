package com.elane;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre"; //定义filter的类型，有pre、route、post、error四种
    }

    @Override
    public int filterOrder() {
        return 0;//定义filter的顺序，数字越小表示顺序越高，越先执行
    }

    @Override
    public boolean shouldFilter() {
        return true; //表示是否需要执行该filter，true表示执行，false表示不执行
    }

    @Override
    public Object run() {
        System.out.println("进入网关，验证中.......");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();



//            ctx.setSendZuulResponse(true); //对请求进行路由
//            ctx.setResponseStatusCode(200);
//            ctx.set("isSuccess", true);
//            return null;
            ctx.setSendZuulResponse(false); //不对其进行路由
            ctx.setResponseStatusCode(400);
            ctx.setResponseBody("token is empty");
            ctx.set("isSuccess", false);
            return null;
//        return null;//filter需要执行的具体操作
    }
}
