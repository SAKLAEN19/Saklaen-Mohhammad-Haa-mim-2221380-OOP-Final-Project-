package com.example.administration_saklaenhaamim_2221380;

public class QualityControl {

    public String ctmr;
    public String pav;
    public String gslbs;
    public String vb;
    public String bsmp;
    public String tmp;
    public String cos;
    public String cs;
    public String ssdc;
    public String mgcjr;

    public QualityControl(String ctmr, String pav, String gslbs, String vb, String bsmp, String tmp, String cos, String cs, String ssdc, String mgcjr) {
        this.ctmr = ctmr;
        this.pav = pav;
        this.gslbs = gslbs;
        this.vb = vb;
        this.bsmp = bsmp;
        this.tmp = tmp;
        this.cos = cos;
        this.cs = cs;
        this.ssdc = ssdc;
        this.mgcjr = mgcjr;
    }

    public String getCtmr() {
        return ctmr;
    }

    public void setCtmr(String ctmr) {
        this.ctmr = ctmr;
    }

    public String getPav() {
        return pav;
    }

    public void setPav(String pav) {
        this.pav = pav;
    }

    public String getGslbs() {
        return gslbs;
    }

    public void setGslbs(String gslbs) {
        this.gslbs = gslbs;
    }

    public String getVb() {
        return vb;
    }

    public void setVb(String vb) {
        this.vb = vb;
    }

    public String getBsmp() {
        return bsmp;
    }

    public void setBsmp(String bsmp) {
        this.bsmp = bsmp;
    }

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public String getSsdc() {
        return ssdc;
    }

    public void setSsdc(String ssdc) {
        this.ssdc = ssdc;
    }

    public String getMgcjr() {
        return mgcjr;
    }

    public void setMgcjr(String mgcjr) {
        this.mgcjr = mgcjr;
    }

    @Override
    public String toString() {
        return "QualityControl{" +
                "ctmr='" + ctmr + '\'' +
                ", pav='" + pav + '\'' +
                ", gslbs='" + gslbs + '\'' +
                ", vb='" + vb + '\'' +
                ", bsmp='" + bsmp + '\'' +
                ", tmp='" + tmp + '\'' +
                ", cos='" + cos + '\'' +
                ", cs='" + cs + '\'' +
                ", ssdc='" + ssdc + '\'' +
                ", mgcjr='" + mgcjr + '\'' +
                '}';
    }
}
