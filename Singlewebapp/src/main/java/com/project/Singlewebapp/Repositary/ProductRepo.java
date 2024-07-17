package com.project.Singlewebapp.Repositary;


import com.project.Singlewebapp.model.Prodduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Prodduct,Integer> {
}
