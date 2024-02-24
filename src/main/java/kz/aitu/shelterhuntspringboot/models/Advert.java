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
    private String address;
    private String location;
    private long price;
    private String description;
    private List<Integer> photos_ids;
    private List<Integer> reviews_ids;

    public Advert(int id, String address, String location, int price, String description){
        setId(id);
        setAddress(address);
        setLocation(location);
        setPrice(price);
        setDescription(description);
    }


    public void addPhoto (int photos_id){
        photos_ids.add(photos_id);
    }
    public void addReview_id(int review_id){
        reviews_ids.add(review_id);
    }

    @Override
    public String toString() {
        return "[ID : " + id + "]" + "Address: " + address + " | Price: " + price +
                " tenge | Desc: " + description + " ||| photos: " + reviews_ids + " | reviews: " + photos_ids;
    }
}