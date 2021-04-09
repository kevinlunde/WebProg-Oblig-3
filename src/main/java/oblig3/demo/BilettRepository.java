package oblig3.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@SuppressWarnings("all")
public class BilettRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBilett(Bilett innBilett){
        String sql ="INSERT INTO Bilett (film, antall, fornavn, etternavn, tlf, epost) VALUES(?,?,?,?,?,?)";
        db.update(sql, innBilett.getFilm(), innBilett.getAntall(), innBilett.getFornavn(), innBilett.getEtternavn(), innBilett.getTlf(), innBilett.getEpost());
        }

        public List<Bilett> hentAlleBiletter(){
            String sql = "SELECT * From Bilett sort by etternavn";
            List<Bilett> alleBiletter = db.query(sql, new BeanPropertyRowMapper(Bilett.class));
            return alleBiletter;
    }

    public void slettAlleBiletter(){
        String sql = "DELETE FROM Bilett";
        db.update(sql);
    }

}
