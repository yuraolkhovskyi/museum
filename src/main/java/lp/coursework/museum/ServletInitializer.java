package lp.coursework.museum;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MuseumApplication.class);
	}


	public static void main(String[] args) {
		ZonedDateTime utcDateTime = ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC);
		String subject = String.format("%s job successfully finished at %s", "!jobName!", DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(utcDateTime));
		System.out.println(subject);
	}

}
