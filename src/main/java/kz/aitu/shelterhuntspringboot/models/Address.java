package kz.aitu.shelterhuntspringboot.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addresses")
public class Address {
    @Id
    private int id;
    private String country;
    private String city;
    private String street;
    private String building;
    private String apartment_number;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Advert advert;
}
