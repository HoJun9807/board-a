package idusw.springboot.boardthymeleaf.domain;

import lombok.*; // 상용 코드(boiler-plate code)를 생성해주는 라이브러리


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@ToString
@EqualsAndHashCode
public class Memo {
    private Long mno;
    private String memoText;
}