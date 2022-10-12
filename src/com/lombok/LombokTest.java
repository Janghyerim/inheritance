package com.lombok;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Getter  //자주쓰이는 키워드
 * @Setter
*/
//@NoArgsConstructor
//@AllArgsConstructor //단축키 @All+Ctrl+Space
@Data //한번에 불러옴.

public class LombokTest {

	private String name;
	private int age;
	private int ban;
	private int no;
	private String addr;
	
	

}
