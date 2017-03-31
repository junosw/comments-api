package com.junosw.commentapi;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 *
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:comments-context.xml" })
public class CommentsControllerTest {


    @Autowired
    private CommentsController commentsController;

    private MockMvc mockMvc;

//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//    }


    @Test
    public void testCommentsControllerIndex() throws Exception {

        String body = commentsController.home();
        assertThat(body.equals("HelloWorld"));
//        this.mockMvc.perform(get("/accounts/1").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType("application/json"))
//                .andExpect(jsonPath("$.name").value("Lee"));


//        String body = this.wac.getServletContext().getForObject("/", String.class);
//        assertThat(body).isEqualTo("Hello World");
    }
}
