package com.lombok;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Getter  //���־��̴� Ű����
 * @Setter
*/
//@NoArgsConstructor
//@AllArgsConstructor //����Ű @All+Ctrl+Space
@Data //�ѹ��� �ҷ���.

public class LombokTest {

	private String name;
	private int age;
	private int ban;
	private int no;
	private String addr;
	
	

}
