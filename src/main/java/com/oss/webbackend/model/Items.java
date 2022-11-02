package com.oss.webbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ITEMS")
public class Items {
    @EmbeddedId
    private ItemsKey id;

    @Column(name = "ITEMSP", length = 16)
    private String itemsp;

    @Column(name = "DESCR", length = 200)
    private String descr;

    @Column(name = "OMADA", length = 12)
    private String omada;

    @Column(name = "MOME", length = 12)
    private String mome;

    @Column(name = "\"TYPE\"")
    private Boolean type;

    @Column(name = "VATCAT", length = 12)
    private String vatcat;

    @Column(name = "HSSC", length = 1)
    private String hssc;

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

    @Column(name = "MINESEG")
    private Integer mineseg;

    @Column(name = "OMADB", length = 12)
    private String omadb;

    @Column(name = "OMADC", length = 12)
    private String omadc;

    @Column(name = "PROD", length = 2)
    private String prod;

    @Column(name = "KAAK", length = 2)
    private String kaak;

    @Column(name = "DESCR_HELP", length = 200)
    private String descrHelp;

    @Column(name = "ENERG", length = 1)
    private String energ;

    @Column(name = "ORDER_EKTY")
    private Integer orderEkty;

    @Column(name = "PACK_QUANT", precision = 9, scale = 2)
    private BigDecimal packQuant;

    @Column(name = "ORIO_STOCK", precision = 7, scale = 2)
    private BigDecimal orioStock;

    @Column(name = "ITKMEG", length = 12)
    private String itkmeg;

    @Column(name = "AITMEGE", length = 12)
    private String aitmege;

    @Column(name = "EITMEGE", length = 12)
    private String eitmege;

    @Column(name = "HAS_ITMEGE", length = 1)
    private String hasItmege;

    @Column(name = "HAS_ITXROM", length = 1)
    private String hasItxrom;

    @Column(name = "LAST_POLH", precision = 13, scale = 2)
    private BigDecimal lastPolh;

    @Column(name = "OMLOG", length = 12)
    private String omlog;

    @Column(name = "OMADD", length = 12)
    private String omadd;

    @Column(name = "ITEM_ID", nullable = false)
    private Long itemId;

    @Column(name = "PRICE_AG", precision = 15, scale = 6)
    private BigDecimal priceAg;

    @Column(name = "DATE_AG")
    private LocalDate dateAg;

    @Column(name = "WEIGHT", precision = 14, scale = 6)
    private BigDecimal weight;

    @Column(name = "ITEMQU_TR", length = 1)
    private String itemquTr;

    @Column(name = "PRICE_QK", length = 1)
    private String priceQk;

    @Column(name = "CONV_QK", precision = 14, scale = 6)
    private BigDecimal convQk;

    @Column(name = "DESCR_B", length = 200)
    private String descrB;

    @Column(name = "OMTIMK", length = 12)
    private String omtimk;

    @Column(name = "NOSYGTIM", length = 1)
    private String nosygtim;

    @Column(name = "PRICE_AGCO", precision = 15, scale = 6)
    private BigDecimal priceAgco;

    @Column(name = "DESCR_SEA", length = 200)
    private String descrSea;

    @Column(name = "PRODNUM", length = 30)
    private String prodnum;

    @Column(name = "OIKOS", length = 12)
    private String oikos;

    @Column(name = "OMADE", length = 12)
    private String omade;

    @Column(name = "OMLEVELS")
    private Integer omlevels;

    @Column(name = "OMADF", length = 12)
    private String omadf;

    @Column(name = "ITEMUN", length = 30)
    private String itemun;

    @Column(name = "DASMKL", length = 20)
    private String dasmkl;

    @Column(name = "MOME2", length = 12)
    private String mome2;

    @Column(name = "PSTOKERD", precision = 8, scale = 4)
    private BigDecimal pstokerd;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "PRICE_AGCO_PREV", precision = 15, scale = 6)
    private BigDecimal priceAgcoPrev;

    @Column(name = "WEIGHT_PA", precision = 14, scale = 6)
    private BigDecimal weightPa;

    @Column(name = "ASKDESCR", length = 1)
    private String askdescr;

    @Column(name = "TOPOS", length = 1)
    private String topos;

    @Column(name = "TIEDITEM", length = 16)
    private String tieditem;

    @Column(name = "TIEDITEM_QU", precision = 8, scale = 4)
    private BigDecimal tieditemQu;

    @Column(name = "EXODMET")
    private Integer exodmet;

    @Column(name = "ITEM_SEA", length = 16)
    private String itemSea;

    @Column(name = "ITALARM", length = 40)
    private String italarm;

    @Column(name = "TOQK")
    private Boolean toqk;

    @Column(name = "PRICE_OIKO", precision = 15, scale = 6)
    private BigDecimal priceOiko;

    @Column(name = "TOPOSDATE")
    private LocalDate toposdate;

    @Column(name = "ZYGI")
    private Integer zygi;

    @Column(name = "ZYGICODE")
    private Integer zygicode;

    @Column(name = "ZYGIPLU")
    private Integer zygiplu;

    @Column(name = "TMAYTYPO")
    private Integer tmaytypo;

    @Column(name = "TMAYTIMH", precision = 17, scale = 6)
    private BigDecimal tmaytimh;

    @Column(name = "LHARUPD")
    private Boolean lharupd;

    @Column(name = "SYLOGH")
    private Boolean sylogh;

    @Column(name = "PROELEFSH", length = 80)
    private String proelefsh;

    @Column(name = "DAYSLHXH")
    private Integer dayslhxh;

    @Column(name = "OMNOPA", length = 12)
    private String omnopa;

    @Column(name = "VERSID")
    private Long versid;

    @Column(name = "SYNTDIAK", length = 15)
    private String syntdiak;

    @Column(name = "ALLERG", length = 100)
    private String allerg;

    @Column(name = "SYSTAT", length = 250)
    private String systat;

    @Column(name = "WEB_EMF", length = 1)
    private String webEmf;

    @Column(name = "SUPL_ORDER_QUANT", precision = 9, scale = 4)
    private BigDecimal suplOrderQuant;

    @Column(name = "LHXHDATESW")
    private Boolean lhxhdatesw;

    @Column(name = "MASTER_QUANT", precision = 9, scale = 4)
    private BigDecimal masterQuant;

    @Column(name = "OPSWDB")
    private Integer opswdb;

    @Column(name = "OPSWVERS")
    private Long opswvers;

    @Column(name = "OPSWTRIGG")
    private Boolean opswtrigg;

    @Column(name = "FREEFLD1", length = 20)
    private String freefld1;

    @Column(name = "POIKILIA", length = 30)
    private String poikilia;

    @Column(name = "PARTIDA", length = 30)
    private String partida;

    @Column(name = "ORDSTP")
    private Boolean ordstp;

    @Column(name = "INFYLA")
    private Boolean infyla;

    @Column(name = "OMADG", length = 12)
    private String omadg;

    @Column(name = "OMADH", length = 12)
    private String omadh;

    @Column(name = "OMADI", length = 12)
    private String omadi;

    @Column(name = "ORPR")
    private Boolean orpr;

    @Column(name = "ITDE", length = 4)
    private String itde;

    @Column(name = "ITDEF")
    private Boolean itdef;

    @Column(name = "FOODSTAMP")
    private Boolean foodstamp;

    @Column(name = "SIZED", length = 12)
    private String sized;

    @Column(name = "ETICF", length = 3)
    private String eticf;

    @Column(name = "EGGYO")
    private Boolean eggyo;

    @Column(name = "TIEDITEB", length = 16)
    private String tiediteb;

    @Column(name = "TIEDITEB_QU", precision = 8, scale = 4)
    private BigDecimal tieditebQu;

    @Column(name = "YPOAF1")
    private Boolean ypoaf1;

    @Column(name = "YPOAF2")
    private Boolean ypoaf2;

    @Column(name = "YPOAF3")
    private Boolean ypoaf3;

    @Column(name = "YPOAF4")
    private Boolean ypoaf4;

    @Column(name = "YPOAF5")
    private Boolean ypoaf5;

    @Column(name = "YPOAF6")
    private Boolean ypoaf6;

    @Column(name = "PSTO_KERD2", precision = 5, scale = 2)
    private BigDecimal pstoKerd2;

    @Column(name = "CHOOSEPACK")
    private Boolean choosepack;

    @Column(name = "ASKQTYSW")
    private Boolean askqtysw;

    @Column(name = "PSELTI", precision = 5, scale = 2)
    private BigDecimal pselti;

    @Column(name = "ITEMQP", length = 16)
    private String itemqp;

    @Column(name = "MOMEA", length = 12)
    private String momea;

    @Column(name = "SYSTATD", length = 40)
    private String systatd;

    @Column(name = "SYSTCODE")
    private Integer systcode;

    @Column(name = "SCALELABEL1")
    private Integer scalelabel1;

    @Column(name = "REQUIRESCALE")
    private Boolean requirescale;

    @Column(name = "PRICE_K_AGCO", precision = 15, scale = 6)
    private BigDecimal priceKAgco;

    @Column(name = "POSSW1")
    private Boolean possw1;

    @Column(name = "TAREA")
    private Integer tarea;

    @Column(name = "TAREB")
    private Integer tareb;

    @Column(name = "DELETESW1")
    private Boolean deletesw1;

    @Column(name = "AADEOM", length = 12)
    private String aadeom;

    @Column(name = "LOTCSW")
    private Boolean lotcsw;

    @Column(name = "XORAP", length = 12)
    private String xorap;

    public ItemsKey getId() {
        return id;
    }

    public void setId(ItemsKey id) {
        this.id = id;
    }

    public String getItemsp() {
        return itemsp;
    }

    public void setItemsp(String itemsp) {
        this.itemsp = itemsp;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getOmada() {
        return omada;
    }

    public void setOmada(String omada) {
        this.omada = omada;
    }

    public String getMome() {
        return mome;
    }

    public void setMome(String mome) {
        this.mome = mome;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public String getVatcat() {
        return vatcat;
    }

    public void setVatcat(String vatcat) {
        this.vatcat = vatcat;
    }

    public String getHssc() {
        return hssc;
    }

    public void setHssc(String hssc) {
        this.hssc = hssc;
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

    public Integer getMineseg() {
        return mineseg;
    }

    public void setMineseg(Integer mineseg) {
        this.mineseg = mineseg;
    }

    public String getOmadb() {
        return omadb;
    }

    public void setOmadb(String omadb) {
        this.omadb = omadb;
    }

    public String getOmadc() {
        return omadc;
    }

    public void setOmadc(String omadc) {
        this.omadc = omadc;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getKaak() {
        return kaak;
    }

    public void setKaak(String kaak) {
        this.kaak = kaak;
    }

    public String getDescrHelp() {
        return descrHelp;
    }

    public void setDescrHelp(String descrHelp) {
        this.descrHelp = descrHelp;
    }

    public String getEnerg() {
        return energ;
    }

    public void setEnerg(String energ) {
        this.energ = energ;
    }

    public Integer getOrderEkty() {
        return orderEkty;
    }

    public void setOrderEkty(Integer orderEkty) {
        this.orderEkty = orderEkty;
    }

    public BigDecimal getPackQuant() {
        return packQuant;
    }

    public void setPackQuant(BigDecimal packQuant) {
        this.packQuant = packQuant;
    }

    public BigDecimal getOrioStock() {
        return orioStock;
    }

    public void setOrioStock(BigDecimal orioStock) {
        this.orioStock = orioStock;
    }

    public String getItkmeg() {
        return itkmeg;
    }

    public void setItkmeg(String itkmeg) {
        this.itkmeg = itkmeg;
    }

    public String getAitmege() {
        return aitmege;
    }

    public void setAitmege(String aitmege) {
        this.aitmege = aitmege;
    }

    public String getEitmege() {
        return eitmege;
    }

    public void setEitmege(String eitmege) {
        this.eitmege = eitmege;
    }

    public String getHasItmege() {
        return hasItmege;
    }

    public void setHasItmege(String hasItmege) {
        this.hasItmege = hasItmege;
    }

    public String getHasItxrom() {
        return hasItxrom;
    }

    public void setHasItxrom(String hasItxrom) {
        this.hasItxrom = hasItxrom;
    }

    public BigDecimal getLastPolh() {
        return lastPolh;
    }

    public void setLastPolh(BigDecimal lastPolh) {
        this.lastPolh = lastPolh;
    }

    public String getOmlog() {
        return omlog;
    }

    public void setOmlog(String omlog) {
        this.omlog = omlog;
    }

    public String getOmadd() {
        return omadd;
    }

    public void setOmadd(String omadd) {
        this.omadd = omadd;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPriceAg() {
        return priceAg;
    }

    public void setPriceAg(BigDecimal priceAg) {
        this.priceAg = priceAg;
    }

    public LocalDate getDateAg() {
        return dateAg;
    }

    public void setDateAg(LocalDate dateAg) {
        this.dateAg = dateAg;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getItemquTr() {
        return itemquTr;
    }

    public void setItemquTr(String itemquTr) {
        this.itemquTr = itemquTr;
    }

    public String getPriceQk() {
        return priceQk;
    }

    public void setPriceQk(String priceQk) {
        this.priceQk = priceQk;
    }

    public BigDecimal getConvQk() {
        return convQk;
    }

    public void setConvQk(BigDecimal convQk) {
        this.convQk = convQk;
    }

    public String getDescrB() {
        return descrB;
    }

    public void setDescrB(String descrB) {
        this.descrB = descrB;
    }

    public String getOmtimk() {
        return omtimk;
    }

    public void setOmtimk(String omtimk) {
        this.omtimk = omtimk;
    }

    public String getNosygtim() {
        return nosygtim;
    }

    public void setNosygtim(String nosygtim) {
        this.nosygtim = nosygtim;
    }

    public BigDecimal getPriceAgco() {
        return priceAgco;
    }

    public void setPriceAgco(BigDecimal priceAgco) {
        this.priceAgco = priceAgco;
    }

    public String getDescrSea() {
        return descrSea;
    }

    public void setDescrSea(String descrSea) {
        this.descrSea = descrSea;
    }

    public String getProdnum() {
        return prodnum;
    }

    public void setProdnum(String prodnum) {
        this.prodnum = prodnum;
    }

    public String getOikos() {
        return oikos;
    }

    public void setOikos(String oikos) {
        this.oikos = oikos;
    }

    public String getOmade() {
        return omade;
    }

    public void setOmade(String omade) {
        this.omade = omade;
    }

    public Integer getOmlevels() {
        return omlevels;
    }

    public void setOmlevels(Integer omlevels) {
        this.omlevels = omlevels;
    }

    public String getOmadf() {
        return omadf;
    }

    public void setOmadf(String omadf) {
        this.omadf = omadf;
    }

    public String getItemun() {
        return itemun;
    }

    public void setItemun(String itemun) {
        this.itemun = itemun;
    }

    public String getDasmkl() {
        return dasmkl;
    }

    public void setDasmkl(String dasmkl) {
        this.dasmkl = dasmkl;
    }

    public String getMome2() {
        return mome2;
    }

    public void setMome2(String mome2) {
        this.mome2 = mome2;
    }

    public BigDecimal getPstokerd() {
        return pstokerd;
    }

    public void setPstokerd(BigDecimal pstokerd) {
        this.pstokerd = pstokerd;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getPriceAgcoPrev() {
        return priceAgcoPrev;
    }

    public void setPriceAgcoPrev(BigDecimal priceAgcoPrev) {
        this.priceAgcoPrev = priceAgcoPrev;
    }

    public BigDecimal getWeightPa() {
        return weightPa;
    }

    public void setWeightPa(BigDecimal weightPa) {
        this.weightPa = weightPa;
    }

    public String getAskdescr() {
        return askdescr;
    }

    public void setAskdescr(String askdescr) {
        this.askdescr = askdescr;
    }

    public String getTopos() {
        return topos;
    }

    public void setTopos(String topos) {
        this.topos = topos;
    }

    public String getTieditem() {
        return tieditem;
    }

    public void setTieditem(String tieditem) {
        this.tieditem = tieditem;
    }

    public BigDecimal getTieditemQu() {
        return tieditemQu;
    }

    public void setTieditemQu(BigDecimal tieditemQu) {
        this.tieditemQu = tieditemQu;
    }

    public Integer getExodmet() {
        return exodmet;
    }

}