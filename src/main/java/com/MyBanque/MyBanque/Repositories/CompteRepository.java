package com.MyBanque.MyBanque.Repositories;

import com.MyBanque.MyBanque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
