package com.example.exchange;

import org.json.JSONObject;

public class StoreValues {

    private JSONObject eur;
    private JSONObject isk;
    private JSONObject dkk;
    private JSONObject usd;
    private JSONObject bgn;
    private JSONObject nok;
    private JSONObject sgd;
    private JSONObject ron;
    private JSONObject czk;
    private JSONObject nzd;
    private JSONObject sek;
    private JSONObject brl;
    private JSONObject chf;
    private JSONObject mxn;
    private JSONObject zar;
    private JSONObject inr;
    private JSONObject cny;
    private JSONObject aud;
    private JSONObject pln;
    private JSONObject jpy;
    private JSONObject gbp;
    private JSONObject idr;
    private JSONObject php;
    private JSONObject huf;
    private JSONObject _try;
    private JSONObject rub;
    private JSONObject CAD;
    private JSONObject hrk;
    private JSONObject myr;

    public JSONObject getEur() {
        return eur;
    }

    public JSONObject getIsk() {
        return isk;
    }

    public JSONObject getDkk() {
        return dkk;
    }

    public JSONObject getUsd() {
        return usd;
    }

    public JSONObject getBgn() {
        return bgn;
    }

    public JSONObject getNok() {
        return nok;
    }

    public JSONObject getSgd() {
        return sgd;
    }

    public JSONObject getRon() {
        return ron;
    }

    public JSONObject getCzk() {
        return czk;
    }

    public JSONObject getNzd() {
        return nzd;
    }

    public JSONObject getSek() {
        return sek;
    }

    public JSONObject getBrl() {
        return brl;
    }

    public JSONObject getChf() {
        return chf;
    }

    public JSONObject getMxn() {
        return mxn;
    }

    public JSONObject getZar() {
        return zar;
    }

    public JSONObject getInr() {
        return inr;
    }

    public JSONObject getCny() {
        return cny;
    }

    public JSONObject getAud() {
        return aud;
    }

    public JSONObject getPln() {
        return pln;
    }

    public JSONObject getJpy() {
        return jpy;
    }

    public JSONObject getGbp() {
        return gbp;
    }

    public JSONObject getIdr() {
        return idr;
    }

    public JSONObject getPhp() {
        return php;
    }

    public JSONObject getHuf() {
        return huf;
    }

    public JSONObject get_try() {
        return _try;
    }

    public JSONObject getRub() {
        return rub;
    }

    public JSONObject getCAD() {
        return CAD;
    }

    public JSONObject getHrk() {
        return hrk;
    }

    public JSONObject getMyr() {
        return myr;
    }

    public StoreValues() {
        RequestParser requestParser = new RequestParser();
        this.eur = requestParser.getJSONObjectFromURL("EUR") ;
        this.isk = requestParser.getJSONObjectFromURL("isk") ;
        this.dkk = requestParser.getJSONObjectFromURL( "dkk");
        this.usd =requestParser.getJSONObjectFromURL( "usd");
        this.bgn =requestParser.getJSONObjectFromURL( "bgn");
        this.nok = requestParser.getJSONObjectFromURL("nok");
        this.sgd =requestParser.getJSONObjectFromURL(" sgd");
        this.ron =requestParser.getJSONObjectFromURL(" ron");
        this.czk =requestParser.getJSONObjectFromURL(" czk");
        this.nzd =requestParser.getJSONObjectFromURL(" nzd");
        this.sek =requestParser.getJSONObjectFromURL(" sek");
        this.brl =requestParser.getJSONObjectFromURL(" brl");
        this.chf =requestParser.getJSONObjectFromURL(" chf");
        this.mxn =requestParser.getJSONObjectFromURL(" mxn");
        this.zar =requestParser.getJSONObjectFromURL(" zar");
        this.inr =requestParser.getJSONObjectFromURL(" inr");
        this.cny =requestParser.getJSONObjectFromURL(" cny");
        this.aud =requestParser.getJSONObjectFromURL(" aud");
        this.pln =requestParser.getJSONObjectFromURL(" pln");
        this.jpy =requestParser.getJSONObjectFromURL(" jpy");
        this.gbp =requestParser.getJSONObjectFromURL(" gbp");
        this.idr =requestParser.getJSONObjectFromURL(" idr");
        this.php =requestParser.getJSONObjectFromURL(" php");
        this.huf =requestParser.getJSONObjectFromURL(" huf");
        this._try =requestParser.getJSONObjectFromURL(" _try");
        this.rub =requestParser.getJSONObjectFromURL(" rub");
        this.CAD =requestParser.getJSONObjectFromURL(" CAD");
        this.hrk =requestParser.getJSONObjectFromURL(" hrk");
        this.myr =requestParser.getJSONObjectFromURL(" myr");
    }
}
