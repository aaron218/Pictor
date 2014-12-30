package net.theneverland.Filter.SimpleFilter.Solr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aaron on 12/20/2014.
 *
 */
public class Pattern {

    List<String> FlatQuery = new ArrayList<String>();
    List<String> WildQuery = new ArrayList<String>();
    Map<String, List<String>> KVFlatQuery = new HashMap<String, List<String>>();
    Map<String, List<String>> KVWILDQuery = new HashMap<String, List<String>>();
    Map<String, List<DateItem>> DateQuery = new HashMap<String, List<DateItem>>();

    public List<String> getFlatQuery() {
        return FlatQuery;
    }

    public void setFlatQuery(List<String> flatQuery) {
        FlatQuery = flatQuery;
    }

    public List<String> getWildQuery() {
        return WildQuery;
    }

    public void setWildQuery(List<String> wildQuery) {
        WildQuery = wildQuery;
    }

    public Map<String, List<String>> getKVFlatQuery() {
        return KVFlatQuery;
    }

    public void setKVFlatQuery(Map<String, List<String>> KVFlatQuery) {
        this.KVFlatQuery = KVFlatQuery;
    }

    public Map<String, List<String>> getKVWILDQuery() {
        return KVWILDQuery;
    }

    public void setKVWILDQuery(Map<String, List<String>> KVWILDQuery) {
        this.KVWILDQuery = KVWILDQuery;
    }

    public Map<String, List<DateItem>> getDateQuery() {
        return DateQuery;
    }

    public void setDateQuery(Map<String, List<DateItem>> dateQuery) {
        DateQuery = dateQuery;
    }
}
