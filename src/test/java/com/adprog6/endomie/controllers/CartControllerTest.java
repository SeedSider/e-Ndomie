package com.adprog6.endomie.controllers;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = CVController.class)
public class CartControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void cartContainsYourCartString() throws Exception {
        mockMvc.perform(get("/cart"))
                .andExpect(content().string(containsString("Your Cart")));
    }

}


