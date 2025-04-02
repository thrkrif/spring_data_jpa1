package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address adderss;

    // 하나의 멤버가 여러개의 상품을 주문 한다 : 일대다관계
    @OneToMany(mappedBy = "member") // 연관관계의 주인은 Order 클래스의 member 필드임을 의미. 여기선 값 수정 불가
    private List<Order> oders = new ArrayList<>();

}
