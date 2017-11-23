package lab.phb.mhswebapp.repo;

import lab.phb.mhswebapp.entity.Pegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepo 
        extends JpaRepository<Pegawai,String>{
}
