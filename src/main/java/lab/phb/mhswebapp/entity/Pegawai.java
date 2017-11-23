package lab.phb.mhswebapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity

public class Pegawai {
    
    @Id
    @Getter @Setter
    private String id;
    
    @Getter @Setter
    private String nama;
    
    @Getter @Setter
    private String jabatan;
    
}
