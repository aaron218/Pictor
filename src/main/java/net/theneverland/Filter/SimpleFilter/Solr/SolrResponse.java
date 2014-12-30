package net.theneverland.Filter.SimpleFilter.Solr;

import net.theneverland.Filter.SimpleFilter.Response;
import org.apache.solr.common.SolrDocument;

/**
 * Created by aaron on 12/20/2014.
 */
public class SolrResponse extends Response {

    private SolrDocument solrDocument;
    private String responseObj;
    private Object pattern;
    private Object flag;

    @Override
    public String getResponseObj() {
        return responseObj;
    }

    public void setResponseObj(String responseObj) {
        this.responseObj = responseObj;
    }

    @Override
    public Object getPattern() {
        return pattern;
    }

    @Override
    public void setPattern(Object pattern) {
        this.pattern = pattern;
    }

    @Override
    public Object getFlag() {
        return flag;
    }

    @Override
    public void setFlag(Object flag) {
        this.flag = flag;
    }

    public SolrDocument getSolrDocument() {
        return solrDocument;
    }

    public void setSolrDocument(SolrDocument solrDocument) {
        this.solrDocument = solrDocument;
    }
}
