package com.oss.webbackend.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "ACCOUNT")
public class Account {
    @EmbeddedId
    private AccountId id;

    @Column(name = "DESCR", length = 80)
    private String descr;

    @Column(name = "DESCR_LANG", length = 50)
    private String descrLang;

    @Column(name = "DESCR_HELP", length = 20)
    private String descrHelp;

    @Column(name = "ANAL", nullable = false, length = 1)
    private String anal;

    @Column(name = "ALEVEL", nullable = false, length = 1)
    private String alevel;

    @Column(name = "VAT", nullable = false, length = 1)
    private String vat;

    @Column(name = "BOOK", nullable = false)
    private Integer book;

    @Column(name = "SYNG", length = 1)
    private String syng;

    @Column(name = "BANC", length = 1)
    private String banc;

    @Column(name = "ANLO", length = 1)
    private String anlo;

    @Column(name = "BIBL", length = 2)
    private String bibl;

    @Column(name = "COIN_SW", length = 1)
    private String coinSw;

    @Column(name = "COIN", length = 12)
    private String coin;

    @Column(name = "VAT_ACCOUNT", length = 12)
    private String vatAccount;

    @Column(name = "VAT_KATE", length = 12)
    private String vatKate;

    @Column(name = "USER_CREATE", length = 10)
    private String userCreate;

    @Column(name = "DATE_CREATE")
    private LocalDate dateCreate;

    @Column(name = "USER_MODIFY", length = 10)
    private String userModify;

    @Column(name = "DATE_MODIFY")
    private LocalDate dateModify;

    @Column(name = "LEVEL_ACCES")
    private Integer levelAcces;

    @Column(name = "ACCOM", length = 16)
    private String accom;

    @Column(name = "CUST_SW", length = 1)
    private String custSw;

    @Column(name = "VESEX", length = 1)
    private String vesex;

    @Column(name = "VESEX_ADDSUM")
    private Integer vesexAddsum;

    @Column(name = "DESC_LANG", length = 60)
    private String descLang;

    @Column(name = "INTER_SW", length = 2)
    private String interSw;

    @Column(name = "ENERG", length = 1)
    private String energ;

    @Column(name = "PROJ_ESEX")
    private Integer projEsex;

    @Column(name = "DESCR_SEA", length = 80)
    private String descrSea;

    @Column(name = "OPSWRE")
    private Boolean opswre;

    @Column(name = "ACCOGR", length = 16)
    private String accogr;

    @Column(name = "ACPOSCOST", length = 16)
    private String acposcost;

    @Column(name = "ACCOCOST", length = 16)
    private String accocost;

    @Column(name = "REMARKS", length = 300)
    private String remarks;

    @Column(name = "OXIANIS")
    private Boolean oxianis;

    @Column(name = "ACSY01", length = 4)
    private String acsy01;

    @Column(name = "CASFLC", length = 16)
    private String casflc;

    @Column(name = "CASFLSW")
    private Boolean casflsw;

    @Column(name = "ACCKLEEK", length = 6)
    private String acckleek;

    @Column(name = "BIESEX")
    private Integer biesex;

    @Column(name = "ACCMDATA", length = 12)
    private String accmdata;

    @Column(name = "CATMDATA", length = 12)
    private String catmdata;

    @Column(name = "WITHHE")
    private Integer withhe;

    @Column(name = "OTHERT")
    private Integer othert;

    @Column(name = "FEESP")
    private Integer feesp;

    @Column(name = "AADEEE", length = 1)
    private String aadeee;

    @Column(name = "STAMP")
    private Boolean stamp;

    @Column(name = "RCE", length = 5)
    private String rce;

    @Column(name = "VATMDATA", length = 12)
    private String vatmdata;

    @Column(name = "SENDFPAAA")
    private Boolean sendfpaaa;

    public AccountId getId() {
        return id;
    }

    public void setId(AccountId id) {
        this.id = id;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDescrLang() {
        return descrLang;
    }

    public void setDescrLang(String descrLang) {
        this.descrLang = descrLang;
    }

    public String getDescrHelp() {
        return descrHelp;
    }

    public void setDescrHelp(String descrHelp) {
        this.descrHelp = descrHelp;
    }

    public String getAnal() {
        return anal;
    }

    public void setAnal(String anal) {
        this.anal = anal;
    }

    public String getAlevel() {
        return alevel;
    }

    public void setAlevel(String alevel) {
        this.alevel = alevel;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public Integer getBook() {
        return book;
    }

    public void setBook(Integer book) {
        this.book = book;
    }

    public String getSyng() {
        return syng;
    }

    public void setSyng(String syng) {
        this.syng = syng;
    }

    public String getBanc() {
        return banc;
    }

    public void setBanc(String banc) {
        this.banc = banc;
    }

    public String getAnlo() {
        return anlo;
    }

    public void setAnlo(String anlo) {
        this.anlo = anlo;
    }

    public String getBibl() {
        return bibl;
    }

    public void setBibl(String bibl) {
        this.bibl = bibl;
    }

    public String getCoinSw() {
        return coinSw;
    }

    public void setCoinSw(String coinSw) {
        this.coinSw = coinSw;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getVatAccount() {
        return vatAccount;
    }

    public void setVatAccount(String vatAccount) {
        this.vatAccount = vatAccount;
    }

    public String getVatKate() {
        return vatKate;
    }

    public void setVatKate(String vatKate) {
        this.vatKate = vatKate;
    }

    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getUserModify() {
        return userModify;
    }

    public void setUserModify(String userModify) {
        this.userModify = userModify;
    }

    public LocalDate getDateModify() {
        return dateModify;
    }

    public void setDateModify(LocalDate dateModify) {
        this.dateModify = dateModify;
    }

    public Integer getLevelAcces() {
        return levelAcces;
    }

    public void setLevelAcces(Integer levelAcces) {
        this.levelAcces = levelAcces;
    }

    public String getAccom() {
        return accom;
    }

    public void setAccom(String accom) {
        this.accom = accom;
    }

    public String getCustSw() {
        return custSw;
    }

    public void setCustSw(String custSw) {
        this.custSw = custSw;
    }

    public String getVesex() {
        return vesex;
    }

    public void setVesex(String vesex) {
        this.vesex = vesex;
    }

    public Integer getVesexAddsum() {
        return vesexAddsum;
    }

    public void setVesexAddsum(Integer vesexAddsum) {
        this.vesexAddsum = vesexAddsum;
    }

    public String getDescLang() {
        return descLang;
    }

    public void setDescLang(String descLang) {
        this.descLang = descLang;
    }

    public String getInterSw() {
        return interSw;
    }

    public void setInterSw(String interSw) {
        this.interSw = interSw;
    }

    public String getEnerg() {
        return energ;
    }

    public void setEnerg(String energ) {
        this.energ = energ;
    }

    public Integer getProjEsex() {
        return projEsex;
    }

    public void setProjEsex(Integer projEsex) {
        this.projEsex = projEsex;
    }

    public String getDescrSea() {
        return descrSea;
    }

    public void setDescrSea(String descrSea) {
        this.descrSea = descrSea;
    }

    public Boolean getOpswre() {
        return opswre;
    }

    public void setOpswre(Boolean opswre) {
        this.opswre = opswre;
    }

    public String getAccogr() {
        return accogr;
    }

    public void setAccogr(String accogr) {
        this.accogr = accogr;
    }

    public String getAcposcost() {
        return acposcost;
    }

    public void setAcposcost(String acposcost) {
        this.acposcost = acposcost;
    }

    public String getAccocost() {
        return accocost;
    }

    public void setAccocost(String accocost) {
        this.accocost = accocost;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Boolean getOxianis() {
        return oxianis;
    }

    public void setOxianis(Boolean oxianis) {
        this.oxianis = oxianis;
    }

    public String getAcsy01() {
        return acsy01;
    }

    public void setAcsy01(String acsy01) {
        this.acsy01 = acsy01;
    }

    public String getCasflc() {
        return casflc;
    }

    public void setCasflc(String casflc) {
        this.casflc = casflc;
    }

    public Boolean getCasflsw() {
        return casflsw;
    }

    public void setCasflsw(Boolean casflsw) {
        this.casflsw = casflsw;
    }

    public String getAcckleek() {
        return acckleek;
    }

    public void setAcckleek(String acckleek) {
        this.acckleek = acckleek;
    }

    public Integer getBiesex() {
        return biesex;
    }

    public void setBiesex(Integer biesex) {
        this.biesex = biesex;
    }

    public String getAccmdata() {
        return accmdata;
    }

    public void setAccmdata(String accmdata) {
        this.accmdata = accmdata;
    }

    public String getCatmdata() {
        return catmdata;
    }

    public void setCatmdata(String catmdata) {
        this.catmdata = catmdata;
    }

    public Integer getWithhe() {
        return withhe;
    }

    public void setWithhe(Integer withhe) {
        this.withhe = withhe;
    }

    public Integer getOthert() {
        return othert;
    }

    public void setOthert(Integer othert) {
        this.othert = othert;
    }

    public Integer getFeesp() {
        return feesp;
    }

    public void setFeesp(Integer feesp) {
        this.feesp = feesp;
    }

    public String getAadeee() {
        return aadeee;
    }

    public void setAadeee(String aadeee) {
        this.aadeee = aadeee;
    }

    public Boolean getStamp() {
        return stamp;
    }

    public void setStamp(Boolean stamp) {
        this.stamp = stamp;
    }

    public String getRce() {
        return rce;
    }

    public void setRce(String rce) {
        this.rce = rce;
    }

    public String getVatmdata() {
        return vatmdata;
    }

    public void setVatmdata(String vatmdata) {
        this.vatmdata = vatmdata;
    }

    public Boolean getSendfpaaa() {
        return sendfpaaa;
    }

    public void setSendfpaaa(Boolean sendfpaaa) {
        this.sendfpaaa = sendfpaaa;
    }

}