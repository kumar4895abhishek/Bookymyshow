package com.project.bookymyshow.repositories;

import com.project.bookymyshow.models.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long>
{

}