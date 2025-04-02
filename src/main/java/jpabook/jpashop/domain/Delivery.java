package jpabook.jpashop.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery") // 주종관계에서 '종' 을 의미함. Delivery 클래스의 delivery 멤버가 주인임을 의미함.
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING) // enum은 Enumerated 어노테이션 추가 , 꼭 STRING 으로 쓰시오!
    private DeliveryStatus status; // READY, COMP
}
