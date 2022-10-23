package org.xjh.spring.springLearn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.xjh.spring.springLearn.domain.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringLearnApplicationTest {

    @Test
    void name() {
        User user = new User("xjh", "111");
        assertEquals(user.name(), "xjh");
        assertEquals(user.password(), "111");

    }
}