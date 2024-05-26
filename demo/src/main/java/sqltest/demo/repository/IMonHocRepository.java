package sqltest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sqltest.demo.entity.MonHoc;
import org.springframework.stereotype.Repository;

@Repository
public interface IMonHocRepository extends JpaRepository<MonHoc, Long> {
}
