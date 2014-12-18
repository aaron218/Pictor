package net.theneverland.java.Filter;

import java.util.Enumeration;

/**
 * Created by Administrator on 2014/12/18 0018.
 * 参照Servlet Filter
 * FilterConfig
 */
public interface FilterConfig {

    String getFilterName();

    FilterContext getFilterContext();

    String getInitParameter(String var1);

    Enumeration getInitParameterNames();
}
