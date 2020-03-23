package com.example.cookbooktest.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Classe exemplo de teste simples com junit4
 */
public class PessoaTest {

    Pessoa pessoa;

    @Before
    public void setUp(){
        pessoa = new Pessoa();
    }


    @Test
    public void getId() {
        this.pessoa.setId(10L);
        assertEquals(new Long(10L), this.pessoa.getId());
    }

    @Test
    public void getIdError() {
        assertNull(this.pessoa.getId());
    }

    @Test(expected = NullPointerException.class)
    public void getIdExeption() {
        this.pessoa.getId().longValue();
    }
}
