package com.ferinabay.klasemenclient.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Klasemen {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("id_tim")
    private Integer id_tim;
    @SerializedName("nama_tim")
    private String nama_tim;
    @SerializedName("p")
    private Integer p;
    @SerializedName("w")
    private Integer w;
    @SerializedName("d")
    private Integer d;
    @SerializedName("l")
    private Integer l;
    @SerializedName("f")
    private Integer f;
    @SerializedName("a")
    private Integer a;
    @SerializedName("gd")
    private Integer gd;
    @SerializedName("pts")
    private Integer pts;

    public Klasemen(){}

    public Klasemen(Integer id, Integer id_tim, String nama_tim, Integer p, Integer w, Integer d, Integer l, Integer f, Integer a, Integer gd, Integer pts) {
        this.id = id;
        this.id_tim = id_tim;
        this.nama_tim = nama_tim;
        this.p = p;
        this.w = w;
        this.d = d;
        this.l = l;
        this.f = f;
        this.a = a;
        this.gd = gd;
        this.pts = pts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_tim() {
        return id_tim;
    }

    public void setId_tim(Integer id_tim) {
        this.id_tim = id_tim;
    }

    public String getNama_tim() {
        return nama_tim;
    }

    public void setNama_tim(String nama_tim) {
        this.nama_tim = nama_tim;
    }

    public Integer getP() {
        return p;
    }

    public void setP(Integer p) {
        this.p = p;
    }

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getGd() {
        return gd;
    }

    public void setGd(Integer gd) {
        this.gd = gd;
    }

    public Integer getPts() {
        return pts;
    }

    public void setPts(Integer pts) {
        this.pts = pts;
    }
}
