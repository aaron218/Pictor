package net.theneverland.Filter.SimpleFilter;


/**
 * Created by aaron on 12/20/2014.
 */
public interface Filter {

    public void init();

    public void doFilter(Request request, Response response, FilterChain filterChain);

    public void destroy();

}
