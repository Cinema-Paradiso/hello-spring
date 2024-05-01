package hello.hellospring;

import hello.hellospring.domain.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		Member member = new Member();
		System.out.println("member = " + member);
		System.out.println(member.getClass());


	}
}
