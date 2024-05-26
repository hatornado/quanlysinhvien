package sqltest.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.Set;
import lombok.Data;

@Data
@Entity(name ="Lop")
@Table(name="lop")
public class Lop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MaLop")
    private Integer maLop;

    @Size(min=1, max=7, message =" Ten phai tu 1->7 ky tu")
    @NotNull(message = "Khong duoc de trong")
    @Column(name = "TenLop", length = 7)
    private String tenLop;

    @OneToMany(mappedBy = "lop", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<SinhVien> sinhViens;
}
