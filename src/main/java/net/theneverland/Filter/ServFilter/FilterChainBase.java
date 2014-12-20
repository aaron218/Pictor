package net.theneverland.Filter.ServFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2014/12/18 0018.
 * 参照Servlet FilterChain
 */
public class FilterChainBase implements BasicFilter{
    private List<BasicFilter> basicFilters = new ArrayList<BasicFilter>();
    private FilterConfig filterConfig ;

    public void addToFilterChain(BasicFilter basicFilter){

    }

    @Override
    public void init(FilterConfig var1) throws FilterException {
        filterConfig = var1;
    }

    @Override
    public void doFilter(FilterRequest var1, FilterResponse var2, FilterChainBase var3) throws IOException, FilterException {

    }

    @Override
    public void destroy() {
        basicFilters = null;
        filterConfig = null;
    }
}
