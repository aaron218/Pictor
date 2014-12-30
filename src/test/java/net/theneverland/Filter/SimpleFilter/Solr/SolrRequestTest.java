package net.theneverland.Filter.SimpleFilter.Solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CommonsHttpSolrServer;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class SolrRequestTest {

    SolrDocumentList solrDocumentList = new SolrDocumentList();

    @Before
    public void testSolrConn(){
        try {
            CommonsHttpSolrServer solr = new
                    CommonsHttpSolrServer("http://172.30.11.166:7070/solr/person_subject/");
            solr.setConnectionTimeout(1000);
            solr.setDefaultMaxConnectionsPerHost(100);
            solr.setMaxTotalConnections(100);
            solr.setParser(new XMLResponseParser());
            SolrQuery query = new SolrQuery("*:*");
            query.setStart(0);
            query.setRows(10);
            QueryResponse queryResponse;
            try {
                queryResponse = solr.query(query);
                solrDocumentList = queryResponse.getResults();
                /*for (SolrDocument solrDocument:solrDocumentList){
                    System.out.println(solrDocument.getFieldNames());
                }*/
                SolrDocument solrDocument = solrDocumentList.get(0);
               // System.out.println(solrDocument.getFieldNames());
                //System.out.println(solrDocument.getFieldValue("LGY_tcns"));
                List<Object> values= (List<Object>) solrDocument.getFieldValues("LGY_tcns");
                for (Object object:values){
                    Map<String,String> val =(Map<String,String>) object;
                    System.out.println(val.get("LGMC"));
                }

            } catch (SolrServerException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetSolrDocument() throws Exception {



    }

    @Test
    public void testSetSolrDocument() throws Exception {

    }
}