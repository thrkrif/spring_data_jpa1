package jpabook.jpashop.domain.item;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@DiscriminatorColumn(name = "dtype")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long Id;

    private String name;
    private int price;
    private int stockQuantity;


}
