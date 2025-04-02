package jpabook.jpashop.domain;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {
    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "member_id") // FK : member_id가 된다는 뜻, 내가 연관관계 주인이야
    private Member member;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "delivery_id") // 1:1 관계에선 액세스 많이 하는 곳에 FK 설정하기
    private Delivery delivery = new Delivery();

    private LocalDateTime orderDate; // 주문 시간

    @Enumerated(EnumType.STRING) // enum은 Enumerated 어노테이션 추가 , 꼭 STRING 으로 쓰시오!
    private Orderstatus orderStatus; // 주문 상태 [ORDER, CANCLE]



}
