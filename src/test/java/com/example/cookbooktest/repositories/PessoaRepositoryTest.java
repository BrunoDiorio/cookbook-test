package com.example.cookbooktest.repositories;

import com.example.cookbooktest.domain.Pessoa;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * Exemplo de implementacao de teste automatizado com mockito
 */
public class PessoaRepositoryTest {

    @Mock
    PessoaRepository pessoaRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findPessoaById() {
        Pessoa p = new Pessoa();
        p.setId(1L);
        p.setName("teste");

        Mockito.when(pessoaRepository.save(p)).thenReturn(p);
        Pessoa p_ = pessoaRepository.save(p);

        assertEquals(p, p_);
        Mockito.verify(pessoaRepository, Mockito.times(1)).save(p);
    }
}
