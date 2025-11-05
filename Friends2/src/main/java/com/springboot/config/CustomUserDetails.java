package com.springboot.config;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springboot.entity.Member;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor//생성자주입을 이걸로
public class CustomUserDetails implements UserDetails {
    //Member 인스턴스  선언
	private final Member member;
	
	//생성자 안할거임
	//public CustomUserDetails(Member member) {
		//this.member = member;
		
	//}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// 권한부여
		return Collections.singletonList(new SimpleGrantedAuthority(member.getRole()));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return member.getPasswd();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return member.getEmail();
	}
	//추가로 멤버정보접근 getter
	public long getId() {
		return member.getId();
	}
	//추가로 멤버정보접근 getter
		public String getName() {
			return member.getName();
		}

}
