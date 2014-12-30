package net.theneverland.Filter.SimpleFilter.Solr;

import net.theneverland.Filter.SimpleFilter.Request;
import org.apache.solr.common.SolrDocument;

/**
 * Created by aaron on 12/20/2014.
 *
 */
public class SolrRequest extends Request {

    SolrDocument solrDocument ;
    private Object pattern;
    private Object flag;

    public SolrDocument getSolrDocument() {
        return solrDocument;
    }

    public void setSolrDocument(SolrDocument solrDocument) {
        this.solrDocument = solrDocument;
    }

    public Object getPattern() {
        return pattern;
    }

    public void setPattern(Object pattern) {
        this.pattern = pattern;
    }

    public Object getFlag() {
        return flag;
    }

    public void setFlag(Object flag) {
        this.flag = flag;
    }
}
