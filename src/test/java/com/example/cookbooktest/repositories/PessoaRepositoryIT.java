package com.example.cookbooktest.repositories;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PessoaRepositoryIT {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Before
    public void setUp() throws Exception {
    }
}
