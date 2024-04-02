package com.example.Data.Retrieval.CarbonCell.Assignment.repository;

import com.example.Data.Retrieval.CarbonCell.Assignment.model.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
