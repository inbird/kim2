package com.hello.kim2;

import com.hello.dong.Member;
import com.hello.dong.test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Kim2Application {

	public static void main(String[] args) {
		Member member1 = new Member(10, "KIM");
		Member member2 = new Member(20, "LEE");
		Member member3 = new Member(30, "HONG");
		Member member4 = new Member(40, "PARK");

		System.out.println(member1.toString());
/**
		List<Member> list = new ArrayList<>();
		list.add(member1);
		list.add(member2);
		list.add(member3);
		list.add(member4);

		System.out.println("list = " + list.size());

		Member mem = list.get(0);
		System.out.println(list.indexOf(member2));
		System.out.println("mem = " + mem.getUserName());

		test ts = new test();


//		for( Member member : list){
//			System.out.println("member ID = " + member.getUserId());
//			System.out.println("member Name = " + member.getUserName());
//		}


**/
	}

}
