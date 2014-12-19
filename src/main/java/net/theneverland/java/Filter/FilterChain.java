package net.theneverland.java.Filter;

import java.io.IOException;
import javax.servlet.Filter;

/**
 * Created by Administrator on 2014/12/18 0018.
 * 参照Servlet FilterChain
 */
public interface FilterChain {
    void doFilter(Object var1, Object var2) throws IOException, FilterException;
}
