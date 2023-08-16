package com.project.bookymyshow.repositories;

import com.project.bookymyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Long>
{

}