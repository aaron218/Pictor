package net.theneverland.java.Filter;

import java.io.IOException;


/**
 * Created by Administrator on 2014/12/18 0018.
 * 过滤器的基本操作
 *
 * 与Servlet的Filter类似，但是目前的设计是只有一个单向的处理过程，而不需要进行返回处理
 */
public interface BasicFilter {

    void init(FilterConfig var1) throws FilterException;

    void doFilter(Object var1, Object var2, FilterChain var3) throws IOException, FilterException;

    void destroy();
}
