package sqltest.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.Date;
import java.util.Set;

@Data
@Entity(name="SinhVien")
@Table(name="SinhVien")
public class SinhVien {
    @Id
    @Column(name ="Mssv", length = 10)
    @Size(min = 10, max =10, message="MSSV phai co 10 chu so")
    private String mssv;

    @Size(max=50, message = "Ho ten toi da 50 ky tu")
    @NotNull(message = "Ho ten khong duoc de trong")
    @Column(name ="HoTen", length = 50)
    private String hoTen;

    @Past(message = "Ngaya Sinh phai trong qua khu")
    @Temporal(TemporalType.DATE)
    @Column(name ="NgaySinh")
    private Date ngaySinh;

    @Email(message = "email phai hop le")
    @NotNull(message = "Email khong duoc de trong")
    @Column(name ="Email")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "MaLop",
            referencedColumnName = "MaLop",
            foreignKey = @ForeignKey(name="FK_SINHVIEN_LOP")
    )

    private Lop lop;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name="SinhVien_MonHoc",
            joinColumns = {@JoinColumn(name="MSSV")},
            inverseJoinColumns = {@JoinColumn(name ="MaMon")}
    )

    private Set<MonHoc> monHocs;
}
