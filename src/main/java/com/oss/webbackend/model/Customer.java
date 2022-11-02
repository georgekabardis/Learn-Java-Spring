package com.oss.webbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "cmacco", nullable = false)
    private Long cmacco;

    private Short book;
    private String cust;
    private String type;
    private String name;
    private String odos;
    private String arit;
    private String syni;
    private String city;
    private String nomo;
    private String xora;
    private String tkod;
    private String pbox;
    private String area;
    private Integer efor;
    private String epag;
    private String epag_d;
    private String afm;
    private String thlefono;
    private String telex;
    private String fax;
    private String responce;
    private String account;
    private String dhmosio;
    private String cate;
    private String drom;

    private String cfpa;
    private String paradosh;
    private String praktoreio;
    private String sxol;
    private String addres;
    private String dtitle;
    private String coin;
    private String key2;
    private Double psekpt;
    private String pubfo;
    private String resent;
    private String timok;
    private String coper;
    private Double plafon;
    private String fname;
    private String name_sea;
    private String nolist;
    private String nolisthow;
    private String user_create;
    private Calendar date_create;
    private String user_modify;
    private Calendar date_modify;
    private String email;
    private Short level_acces;
    private String aggroup;
    private String agmash;
    private String agmash_comp;
    private String agsupl_sw;
    private String bankacco;
    private Short hmer_ejof;
    private String saleman;
    private String aplosw;
    private String mobile;
    private String custkart;
    private Short opswre;
    private Short bookcu;
    private Double krdy;
    private String kape;
    private String visitd;
    private String visitw;
    private String stor;
    private String bank;
    private String name_more;
    private String trex2;
    private String mtp;
    private String casflc;
    private String storb;
    private String etbank;
    private String namelf;
    private Byte afxo;
    private Short aade_vat_exce;


}