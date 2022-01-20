package boostcourse.backend.reservation;

import boostcourse.backend.reservation.config.AppConfig;
import boostcourse.backend.reservation.config.DbConfig;
import boostcourse.backend.reservation.config.WebMvcContextConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AppConfig.class, DbConfig.class, WebMvcContextConfig.class})
public class ReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}

}
