package com.android4dev.navigationview.model;

import org.json.JSONObject;

public class MyPagerModel {


    public static final String BID = "b_id";
    public static final String BTITLE = "b_titile";
    public static final String BLINK = "b_link";
    public static final String SEQ = "seq";
    public static final String BANNER = "banner";


    public String b_id;
    public String b_titile;
    public String b_link;
    public String seq;
    public String banner;


    public String getB_id() {
        return b_id;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public String getB_titile() {
        return b_titile;
    }

    public void setB_titile(String b_titile) {
        this.b_titile = b_titile;
    }

    public String getB_link() {
        return b_link;
    }

    public void setB_link(String b_link) {
        this.b_link = b_link;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public MyPagerModel() {

    }


    public MyPagerModel(JSONObject jsonObject) {


        setB_id(jsonObject.optString(BID));
        setB_titile(jsonObject.optString(BTITLE));

        setB_link(jsonObject.optString(BLINK));
        setSeq(jsonObject.optString(SEQ));
        setBanner(jsonObject.optString(BANNER));

    }

    public MyPagerModel(String BID, String BTITLE, String BLINK, String SEQ, String BANNER) {


        setB_id(BID);
        setB_titile(BTITLE);

        setB_link(BLINK);
        setSeq(SEQ);
        setBanner(BANNER);

    }


}
