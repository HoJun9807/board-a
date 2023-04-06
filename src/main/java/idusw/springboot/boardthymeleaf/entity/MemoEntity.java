package idusw.springboot.boardthymeleaf.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity //엔티티 클래스임으로 나타내는 애노테이션
@Table(name = "a_memo") //a_memo 테이블

@ToString // lombok 라이브러리 사용
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //Oracle - SEQUENCE , Mysql - IDENTITY
    private Long mno;

    @Column(length = 200, nullable = false)
    private  String memoText;
}
