package com.project.bookymyshow.repositories;

        import com.project.bookymyshow.models.Movie;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>
{

}