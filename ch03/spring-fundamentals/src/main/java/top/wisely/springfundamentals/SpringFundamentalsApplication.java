package top.wisely.springfundamentals;


import io.github.wiselyman.annotations.EnableABC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableABC
public class SpringFundamentalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFundamentalsApplication.class, args);
	}

}
