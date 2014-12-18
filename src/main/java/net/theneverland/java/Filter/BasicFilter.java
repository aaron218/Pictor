package net.theneverland.java.Filter;

import java.io.IOException;


/**
 * Created by Administrator on 2014/12/18 0018.
 * 过滤器的基本操作
 */
public interface BasicFilter {

    void init(FilterConfig var1) throws FilterException;

    void doFilter(String var1, String var2, FilterChain var3) throws IOException, FilterException;

    void destroy();
}
