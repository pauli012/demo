package Order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderCounts {
    @Id Integer id;
    @Getter @Setter float kwotaNetto;
    @Getter @Setter float tkSzycie;
    @Getter @Setter float karniszInne;
    @Getter @Setter float montaz;
    @Getter @Setter float platnosc;
    @Getter @Setter float razemBrutto;


}
