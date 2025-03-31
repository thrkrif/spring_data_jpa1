package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable // Member 클래스에서 @Embedded 작성하거나 여기에 어노테이션 달아도 되는데 그냥 두개 다 해주는게 보기 좋다.
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
