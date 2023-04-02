package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller를 사용하면 문자열을 return 받으면 view의 이름으로 인식한다.
 * RestController를 사용하면 문자열을 return 받으면 HTTP 메시지 바디에 바로 입력한다.
 */
@Slf4j
@RestController
public class LogTestController {
   // private final Logger log = LoggerFactory.getLogger(getClass());  // @Slf4j를 추가하면 자동 등록

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log={}" + name);   // 올바르지 않은 로그 사용법,+을 사용할 경우 로그를 사용하지 않더라도 문자열을 더하는 계산이 발생함

        log.trace("trace log={}", name);    // 전체
        log.debug("debug log={}", name);    // 디버그 단계
        log.info("info log={}", name);  // 비즈니스 정보
        log.warn("warn log={}", name);  // 경고
        log.error("error log={}", name);    // 에러

        return "ok";
    }
}
