package kz.aitu.shelterhuntspringboot.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "adverts")
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long price;
    private String description;
    private List<Integer> reviews_ids;
    private List<String> photos_links;
    private String country;
    private String city;
    private String street;
    private String building;
    private String apartment_number;
}