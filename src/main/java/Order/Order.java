package Order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Map;

@Entity
public class Order {

    @Id @Getter private Integer id;
    @Getter @Setter private String name;
    @Getter @Setter private String tel;
    @Getter @Setter private String city;
    @Getter @Setter private String postcode;
    @Getter @Setter private String street;
    @Getter @Setter private String no;
    @Getter @Setter private String nip;
    @Getter @Setter private String invoice;
    @Getter @Setter private String weight;
    @Getter @Setter private Date date;
    @Getter @Setter private Date sendDate;
    @Getter @Setter private Map<String,String> materialUsed;
    @Getter @Setter private String dpdNo;
    @Getter @Setter private Integer brytyNo;
    @Getter @Setter private Date montazDate;
    @Getter @Setter private String tkaninaOpis;
    @Getter @Setter private String iloscWymiar;
    @Getter @Setter private String gora;
    @Getter @Setter private String dol;
    @Getter @Setter private String boki;
    @Getter @Setter private String przeszycie;
    @Getter @Setter private String dodatkiUwagi;

    @Getter @Setter float razemBrutto;
    @Getter @Setter float tkSzycie;
    @Getter @Setter float karniszInne;
    @Getter @Setter float montaz;
    @Getter @Setter float platnosc;

    @Getter @Setter private String montazysta;
    @Getter @Setter private String krawiec;
    @Getter @Setter private String opiekun;

    public Order() {

    }
    public Order(Integer id, String name, String tel, String city, String postcode, String street, String no, String nip, String invoice, String weight, Date date, Date sendDate, Map<String, String> materialUsed, String dpdNo, Integer brytyNo, Date montazDate, String tkaninaOpis, String iloscWymiar, String gora, String dol, String boki, String przeszycie, String dodatkiUwagi) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.city = city;
        this.postcode = postcode;
        this.street = street;
        this.no = no;
        this.nip = nip;
        this.invoice = invoice;
        this.weight = weight;
        this.date = date;
        this.sendDate = sendDate;
        this.materialUsed = materialUsed;
        this.dpdNo = dpdNo;
        this.brytyNo = brytyNo;
        this.montazDate = montazDate;
        this.tkaninaOpis = tkaninaOpis;
        this.iloscWymiar = iloscWymiar;
        this.gora = gora;
        this.dol = dol;
        this.boki = boki;
        this.przeszycie = przeszycie;
        this.dodatkiUwagi = dodatkiUwagi;
    }
}
