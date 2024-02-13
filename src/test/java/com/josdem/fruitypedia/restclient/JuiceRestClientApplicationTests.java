package com.josdem.fruitypedia.restclient;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class JuiceRestClientApplicationTests {

    private final ApplicationContext applicationContext;

    @Test
    @DisplayName("it loads the application")
    void shouldLoadApplication(TestInfo testInfo) {
        log.info("Running {}", testInfo.getDisplayName());
        JuiceRestClientApplication.main(new String[]{});
        assertNotNull(applicationContext, "it should have a context");
    }

}
