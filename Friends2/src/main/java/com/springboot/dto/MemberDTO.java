package com.springboot.dto;

import java.sql.Timestamp;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MemberDTO {
	private Long id;  //번호
	private String email; //이메일
	@Email (message="올바른형식의  필수 입력 항목입니다")
	private String passwd; //비밀번호
	@NotEmpty(message="비밀번호는 필수 입력 항목입니다")
	private String name;  //이름
	@NotEmpty(message="이름은 필수 입력 항목입니다")
	private String gender; //성별
	private String role;// 권한
	private Timestamp joinDate; //가입일
}
