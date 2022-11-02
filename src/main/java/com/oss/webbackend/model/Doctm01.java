package com.oss.webbackend.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "DOCTM01")
public class Doctm01 {
    @EmbeddedId
    private Doctm01Id id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "PERIOD", referencedColumnName = "PERIOD", nullable = false),
            @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
    })
    private Doctm doctm;

    @Column(name = "ITTY", nullable = false, length = 1)
    private String itty;

    @Column(name = "ITEM", nullable = false, length = 16)
    private String item;

    @Column(name = "DESCR", length = 60)
    private String descr;

    @Column(name = "QUANT", nullable = false, precision = 13, scale = 5)
    private BigDecimal quant;

    @Column(name = "PRICE", nullable = false, precision = 17, scale = 8)
    private BigDecimal price;

    @Column(name = "AMOUNT", nullable = false, precision = 13, scale = 2)
    private BigDecimal amount;

    @Column(name = "VATPS", precision = 5, scale = 2)
    private BigDecimal vatps;

    @Column(name = "AMVAT", nullable = false, precision = 11, scale = 2)
    private BigDecimal amvat;

    @Column(name = "DISC_AM", nullable = false, precision = 11, scale = 2)
    private BigDecimal discAm;

    @Column(name = "AMCOST", nullable = false, precision = 13, scale = 2)
    private BigDecimal amcost;

    @Column(name = "KOP", length = 6)
    private String kop;

    @Column(name = "AX_CO", nullable = false)
    private Integer axCo;

    @Column(name = "USER_MODIFY", length = 10)
    private String userModify;

    @Column(name = "DATE_MODIFY")
    private LocalDate dateModify;

    @Column(name = "LEVEL_ACCES")
    private Integer levelAcces;

    @Column(name = "SUPLOR_ID")
    private Integer suplorId;

    @Column(name = "SUPLOR_SENU")
    private Integer suplorSenu;

    @Column(name = "LNSW", nullable = false)
    private Boolean lnsw = false;

    @Column(name = "PERIOD_SX")
    private Integer periodSx;

    @Column(name = "ID_SX")
    private Integer idSx;

    @Column(name = "SENU_SX")
    private Integer senuSx;

    @Column(name = "PROPOS", length = 10)
    private String propos;

    @Column(name = "EESA_SW")
    private Integer eesaSw;

    @Column(name = "FIFES_SX")
    private Long fifesSx;

    @Column(name = "PROP_ID")
    private Integer propId;

    @Column(name = "PROP_SENU")
    private Integer propSenu;

    @Column(name = "TRIG_EN200", length = 1)
    private String trigEn200;

    @Column(name = "DISCGEN_AM", nullable = false, precision = 11, scale = 2)
    private BigDecimal discgenAm;

    @Column(name = "MINESEG")
    private Integer mineseg;

    @Column(name = "AMOUNT_CN", precision = 17, scale = 4)
    private BigDecimal amountCn;

    @Column(name = "AMVAT_CN", precision = 17, scale = 4)
    private BigDecimal amvatCn;

    @Column(name = "GRBY_PRINT", length = 1)
    private String grbyPrint;

    @Column(name = "DISC_PS", precision = 5, scale = 2)
    private BigDecimal discPs;

    @Column(name = "SALEMAN", length = 12)
    private String saleman;

    @Column(name = "EKTYSW", length = 1)
    private String ektysw;

    @Column(name = "BARCEKTYSW", length = 1)
    private String barcektysw;

    @Column(name = "DOEKREMO")
    private Long doekremo;

    @Column(name = "ITKMEG", length = 12)
    private String itkmeg;

    @Column(name = "ITMEGE", length = 12)
    private String itmege;

    @Column(name = "ITXROM", length = 12)
    private String itxrom;

    @Column(name = "AMEJOD", precision = 11, scale = 2)
    private BigDecimal amejod;

    @Column(name = "PSKERD", precision = 5, scale = 2)
    private BigDecimal pskerd;

    @Column(name = "PRICE_POL", precision = 15, scale = 6)
    private BigDecimal pricePol;

    @Column(name = "QUANT_K", precision = 12, scale = 5)
    private BigDecimal quantK;

    @Column(name = "PRICE_QK", length = 1)
    private String priceQk;

    @Column(name = "STEC", length = 2)
    private String stec;

    @Column(name = "ITEM_SX", length = 16)
    private String itemSx;

    @Column(name = "LOGST", length = 12)
    private String logst;

    @Column(name = "ARITPROT")
    private Integer aritprot;

    @Column(name = "AITY", length = 4)
    private String aity;

    @Column(name = "DASMKL", length = 20)
    private String dasmkl;

    @Column(name = "AMESFAN", precision = 13, scale = 2)
    private BigDecimal amesfan;

    @Column(name = "STANTIK")
    private Integer stantik;

    @Column(name = "DISC_AM2", precision = 11, scale = 2)
    private BigDecimal discAm2;

    @Column(name = "DISC_PS2", precision = 5, scale = 2)
    private BigDecimal discPs2;

    @Column(name = "STCU", length = 12)
    private String stcu;

    @Column(name = "AAPSTO")
    private Integer aapsto;

    @Column(name = "STAI_ETOS")
    private Integer staiEtos;

    @Column(name = "STEGGYID")
    private Integer steggyid;

    @Column(name = "ORDSENU")
    private Integer ordsenu;

    @Column(name = "EIDBAR", precision = 12, scale = 5)
    private BigDecimal eidbar;

    @Column(name = "SYNTMET", precision = 12, scale = 6)
    private BigDecimal syntmet;

    @Column(name = "PRICE_CN", precision = 16, scale = 7)
    private BigDecimal priceCn;

    @Column(name = "OPSWTRIGG")
    private Boolean opswtrigg;

    @Column(name = "PRICE_K", precision = 17, scale = 8)
    private BigDecimal priceK;

    @Column(name = "FLDVA1", length = 15)
    private String fldva1;

    @Column(name = "FLDVA2", length = 15)
    private String fldva2;

    @Column(name = "FLDVA3", length = 3)
    private String fldva3;

    @Column(name = "QUANTMI", precision = 12, scale = 5)
    private BigDecimal quantmi;

    @Column(name = "DOTRIGPRSU")
    private Boolean dotrigprsu;

    @Column(name = "ACTION", length = 4)
    private String action;

    @Column(name = "DISC_AM3", precision = 11, scale = 2)
    private BigDecimal discAm3;

    @Column(name = "DISC_PS3", precision = 5, scale = 2)
    private BigDecimal discPs3;

    @Column(name = "ITSYSK", length = 12)
    private String itsysk;

    @Column(name = "ITSYQU", precision = 12, scale = 5)
    private BigDecimal itsyqu;

    @Column(name = "SYSKD", length = 20)
    private String syskd;

    @Column(name = "EGGYOSW")
    private Boolean eggyosw;

    @Column(name = "VATCATE", length = 12)
    private String vatcate;

    @Column(name = "OPSWVERS")
    private Long opswvers;

    @Column(name = "CATEVAT", length = 12)
    private String catevat;

    @Column(name = "LOTC", length = 30)
    private String lotc;

    @Column(name = "IDLOT")
    private Long idlot;

    @Column(name = "BARCODE", length = 30)
    private String barcode;

    @Column(name = "MMSW")
    private Boolean mmsw;

    @Column(name = "MMSENU", length = 12)
    private String mmsenu;

    public Doctm01Id getId() {
        return id;
    }

    public void setId(Doctm01Id id) {
        this.id = id;
    }

    public Doctm getDoctm() {
        return doctm;
    }

    public void setDoctm(Doctm doctm) {
        this.doctm = doctm;
    }

    public String getItty() {
        return itty;
    }

    public void setItty(String itty) {
        this.itty = itty;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public BigDecimal getQuant() {
        return quant;
    }

    public void setQuant(BigDecimal quant) {
        this.quant = quant;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getVatps() {
        return vatps;
    }

    public void setVatps(BigDecimal vatps) {
        this.vatps = vatps;
    }

    public BigDecimal getAmvat() {
        return amvat;
    }

    public void setAmvat(BigDecimal amvat) {
        this.amvat = amvat;
    }

    public BigDecimal getDiscAm() {
        return discAm;
    }

    public void setDiscAm(BigDecimal discAm) {
        this.discAm = discAm;
    }

    public BigDecimal getAmcost() {
        return amcost;
    }

    public void setAmcost(BigDecimal amcost) {
        this.amcost = amcost;
    }

    public String getKop() {
        return kop;
    }

    public void setKop(String kop) {
        this.kop = kop;
    }

    public Integer getAxCo() {
        return axCo;
    }

    public void setAxCo(Integer axCo) {
        this.axCo = axCo;
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

    public Integer getSuplorId() {
        return suplorId;
    }

    public void setSuplorId(Integer suplorId) {
        this.suplorId = suplorId;
    }

    public Integer getSuplorSenu() {
        return suplorSenu;
    }

    public void setSuplorSenu(Integer suplorSenu) {
        this.suplorSenu = suplorSenu;
    }

    public Boolean getLnsw() {
        return lnsw;
    }

    public void setLnsw(Boolean lnsw) {
        this.lnsw = lnsw;
    }

    public Integer getPeriodSx() {
        return periodSx;
    }

    public void setPeriodSx(Integer periodSx) {
        this.periodSx = periodSx;
    }

    public Integer getIdSx() {
        return idSx;
    }

    public void setIdSx(Integer idSx) {
        this.idSx = idSx;
    }

    public Integer getSenuSx() {
        return senuSx;
    }

    public void setSenuSx(Integer senuSx) {
        this.senuSx = senuSx;
    }

    public String getPropos() {
        return propos;
    }

    public void setPropos(String propos) {
        this.propos = propos;
    }

    public Integer getEesaSw() {
        return eesaSw;
    }

    public void setEesaSw(Integer eesaSw) {
        this.eesaSw = eesaSw;
    }

    public Long getFifesSx() {
        return fifesSx;
    }

    public void setFifesSx(Long fifesSx) {
        this.fifesSx = fifesSx;
    }

    public Integer getPropId() {
        return propId;
    }

    public void setPropId(Integer propId) {
        this.propId = propId;
    }

    public Integer getPropSenu() {
        return propSenu;
    }

    public void setPropSenu(Integer propSenu) {
        this.propSenu = propSenu;
    }

    public String getTrigEn200() {
        return trigEn200;
    }

    public void setTrigEn200(String trigEn200) {
        this.trigEn200 = trigEn200;
    }

    public BigDecimal getDiscgenAm() {
        return discgenAm;
    }

    public void setDiscgenAm(BigDecimal discgenAm) {
        this.discgenAm = discgenAm;
    }

    public Integer getMineseg() {
        return mineseg;
    }

    public void setMineseg(Integer mineseg) {
        this.mineseg = mineseg;
    }

    public BigDecimal getAmountCn() {
        return amountCn;
    }

    public void setAmountCn(BigDecimal amountCn) {
        this.amountCn = amountCn;
    }

    public BigDecimal getAmvatCn() {
        return amvatCn;
    }

    public void setAmvatCn(BigDecimal amvatCn) {
        this.amvatCn = amvatCn;
    }

    public String getGrbyPrint() {
        return grbyPrint;
    }

    public void setGrbyPrint(String grbyPrint) {
        this.grbyPrint = grbyPrint;
    }

    public BigDecimal getDiscPs() {
        return discPs;
    }

    public void setDiscPs(BigDecimal discPs) {
        this.discPs = discPs;
    }

    public String getSaleman() {
        return saleman;
    }

    public void setSaleman(String saleman) {
        this.saleman = saleman;
    }

    public String getEktysw() {
        return ektysw;
    }

    public void setEktysw(String ektysw) {
        this.ektysw = ektysw;
    }

    public String getBarcektysw() {
        return barcektysw;
    }

    public void setBarcektysw(String barcektysw) {
        this.barcektysw = barcektysw;
    }

    public Long getDoekremo() {
        return doekremo;
    }

    public void setDoekremo(Long doekremo) {
        this.doekremo = doekremo;
    }

    public String getItkmeg() {
        return itkmeg;
    }

    public void setItkmeg(String itkmeg) {
        this.itkmeg = itkmeg;
    }

    public String getItmege() {
        return itmege;
    }

    public void setItmege(String itmege) {
        this.itmege = itmege;
    }

    public String getItxrom() {
        return itxrom;
    }

    public void setItxrom(String itxrom) {
        this.itxrom = itxrom;
    }

    public BigDecimal getAmejod() {
        return amejod;
    }

    public void setAmejod(BigDecimal amejod) {
        this.amejod = amejod;
    }

    public BigDecimal getPskerd() {
        return pskerd;
    }

    public void setPskerd(BigDecimal pskerd) {
        this.pskerd = pskerd;
    }

    public BigDecimal getPricePol() {
        return pricePol;
    }

    public void setPricePol(BigDecimal pricePol) {
        this.pricePol = pricePol;
    }

    public BigDecimal getQuantK() {
        return quantK;
    }

    public void setQuantK(BigDecimal quantK) {
        this.quantK = quantK;
    }

    public String getPriceQk() {
        return priceQk;
    }

    public void setPriceQk(String priceQk) {
        this.priceQk = priceQk;
    }

    public String getStec() {
        return stec;
    }

    public void setStec(String stec) {
        this.stec = stec;
    }

    public String getItemSx() {
        return itemSx;
    }

    public void setItemSx(String itemSx) {
        this.itemSx = itemSx;
    }

    public String getLogst() {
        return logst;
    }

    public void setLogst(String logst) {
        this.logst = logst;
    }

    public Integer getAritprot() {
        return aritprot;
    }

    public void setAritprot(Integer aritprot) {
        this.aritprot = aritprot;
    }

    public String getAity() {
        return aity;
    }

    public void setAity(String aity) {
        this.aity = aity;
    }

    public String getDasmkl() {
        return dasmkl;
    }

    public void setDasmkl(String dasmkl) {
        this.dasmkl = dasmkl;
    }

    public BigDecimal getAmesfan() {
        return amesfan;
    }

    public void setAmesfan(BigDecimal amesfan) {
        this.amesfan = amesfan;
    }

    public Integer getStantik() {
        return stantik;
    }

    public void setStantik(Integer stantik) {
        this.stantik = stantik;
    }

    public BigDecimal getDiscAm2() {
        return discAm2;
    }

    public void setDiscAm2(BigDecimal discAm2) {
        this.discAm2 = discAm2;
    }

    public BigDecimal getDiscPs2() {
        return discPs2;
    }

    public void setDiscPs2(BigDecimal discPs2) {
        this.discPs2 = discPs2;
    }

    public String getStcu() {
        return stcu;
    }

    public void setStcu(String stcu) {
        this.stcu = stcu;
    }

    public Integer getAapsto() {
        return aapsto;
    }

    public void setAapsto(Integer aapsto) {
        this.aapsto = aapsto;
    }

    public Integer getStaiEtos() {
        return staiEtos;
    }

    public void setStaiEtos(Integer staiEtos) {
        this.staiEtos = staiEtos;
    }

    public Integer getSteggyid() {
        return steggyid;
    }

    public void setSteggyid(Integer steggyid) {
        this.steggyid = steggyid;
    }

    public Integer getOrdsenu() {
        return ordsenu;
    }

    public void setOrdsenu(Integer ordsenu) {
        this.ordsenu = ordsenu;
    }

    public BigDecimal getEidbar() {
        return eidbar;
    }

    public void setEidbar(BigDecimal eidbar) {
        this.eidbar = eidbar;
    }

    public BigDecimal getSyntmet() {
        return syntmet;
    }

    public void setSyntmet(BigDecimal syntmet) {
        this.syntmet = syntmet;
    }

    public BigDecimal getPriceCn() {
        return priceCn;
    }

    public void setPriceCn(BigDecimal priceCn) {
        this.priceCn = priceCn;
    }

    public Boolean getOpswtrigg() {
        return opswtrigg;
    }

    public void setOpswtrigg(Boolean opswtrigg) {
        this.opswtrigg = opswtrigg;
    }

    public BigDecimal getPriceK() {
        return priceK;
    }

    public void setPriceK(BigDecimal priceK) {
        this.priceK = priceK;
    }

    public String getFldva1() {
        return fldva1;
    }

    public void setFldva1(String fldva1) {
        this.fldva1 = fldva1;
    }

    public String getFldva2() {
        return fldva2;
    }

    public void setFldva2(String fldva2) {
        this.fldva2 = fldva2;
    }

    public String getFldva3() {
        return fldva3;
    }

    public void setFldva3(String fldva3) {
        this.fldva3 = fldva3;
    }

    public BigDecimal getQuantmi() {
        return quantmi;
    }

    public void setQuantmi(BigDecimal quantmi) {
        this.quantmi = quantmi;
    }

    public Boolean getDotrigprsu() {
        return dotrigprsu;
    }

    public void setDotrigprsu(Boolean dotrigprsu) {
        this.dotrigprsu = dotrigprsu;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BigDecimal getDiscAm3() {
        return discAm3;
    }

    public void setDiscAm3(BigDecimal discAm3) {
        this.discAm3 = discAm3;
    }

    public BigDecimal getDiscPs3() {
        return discPs3;
    }

    public void setDiscPs3(BigDecimal discPs3) {
        this.discPs3 = discPs3;
    }

    public String getItsysk() {
        return itsysk;
    }

    public void setItsysk(String itsysk) {
        this.itsysk = itsysk;
    }

    public BigDecimal getItsyqu() {
        return itsyqu;
    }

    public void setItsyqu(BigDecimal itsyqu) {
        this.itsyqu = itsyqu;
    }

    public String getSyskd() {
        return syskd;
    }

    public void setSyskd(String syskd) {
        this.syskd = syskd;
    }

    public Boolean getEggyosw() {
        return eggyosw;
    }

    public void setEggyosw(Boolean eggyosw) {
        this.eggyosw = eggyosw;
    }

    public String getVatcate() {
        return vatcate;
    }

    public void setVatcate(String vatcate) {
        this.vatcate = vatcate;
    }

    public Long getOpswvers() {
        return opswvers;
    }

    public void setOpswvers(Long opswvers) {
        this.opswvers = opswvers;
    }

    public String getCatevat() {
        return catevat;
    }

    public void setCatevat(String catevat) {
        this.catevat = catevat;
    }

    public String getLotc() {
        return lotc;
    }

    public void setLotc(String lotc) {
        this.lotc = lotc;
    }

    public Long getIdlot() {
        return idlot;
    }

    public void setIdlot(Long idlot) {
        this.idlot = idlot;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Boolean getMmsw() {
        return mmsw;
    }

    public void setMmsw(Boolean mmsw) {
        this.mmsw = mmsw;
    }

    public String getMmsenu() {
        return mmsenu;
    }

    public void setMmsenu(String mmsenu) {
        this.mmsenu = mmsenu;
    }

}