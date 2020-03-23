package com.example.cookbooktest.repositories;

import com.example.cookbooktest.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
