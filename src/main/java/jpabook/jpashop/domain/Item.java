//package jpabook.jpashop.domain;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.ArrayList;
//
//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 싱글 테이블 타입으로 하겠다.
//@DiscriminatorColumn(name = "dtype") // 자식 클래스들 구분할 때 사용하는거
//@Getter @Setter
//public abstract class Item {
//    @Id
//    @GeneratedValue
//    @Column(name = "item_id")
//    private Long id;
//
//    // 공통 속성
//    private String name;
//    private int price;
//    private int stockQuantity;
//
//    private ArrayList
//}
