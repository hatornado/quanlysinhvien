package sqltest.demo.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity(name ="MonHoc")
@Table(name="MonHoc")
public class MonHoc {
    @Id
    @Column(name ="MaMon", length = 10)
    @Size(min = 1, max =10, message="Ma mon co 1  den 10 chu so")
    private String maMon;

    @Column(name ="TenMonHoc", length = 10)
    @Size(min = 5, max =50, message="Ten mon phai tu 5 den 50 chu so")
    private String tenMonHoc;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name="SinhVien_MonHoc",
            joinColumns = {@JoinColumn(name="MaMon")},
            inverseJoinColumns = {@JoinColumn(name="MSSV")}
    )
    private Set<SinhVien> sinhViens;
}
