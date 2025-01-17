package com.example.cookers.global.jpa;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass // 부모클래스를 상속받는 자식클래스에서 정보(속성)를 매핑한다.
@EntityListeners(AuditingEntityListener.class)
@SuperBuilder
@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // @CreateDate, @LastModifyDate, @Id를 사용하기 위해 써준다.
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    private String thumnailImg;
}