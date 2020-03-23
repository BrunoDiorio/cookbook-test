package com.example.cookbooktest.controller;

import com.example.cookbooktest.repositories.PessoaRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;


/**
 * Mock MVC teste
 */
public class PessoaControllerTest {

    @Mock
    PessoaRepository pessoaRepository;

    private PessoaController pessoaController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        pessoaController = new PessoaController(pessoaRepository);
    }

    @Test
    public void getIndexPage() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(pessoaController).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("index"));

    }
}
