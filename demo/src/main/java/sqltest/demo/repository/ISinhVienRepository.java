package sqltest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sqltest.demo.entity.SinhVien;

@Repository
public interface ISinhVienRepository extends JpaRepository<SinhVien, Long> {
}
