package sqltest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sqltest.demo.entity.*;

@Repository
public interface ILopRepository extends JpaRepository<Lop, Long> {

}


