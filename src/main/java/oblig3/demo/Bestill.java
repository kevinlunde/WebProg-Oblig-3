package oblig3.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Bestill {

    @Autowired
    private BilettRepository rep;

    @PostMapping("/kjop")
    public void lagreBilett(Bilett innBilett){
        rep.lagreBilett(innBilett);

    }

    @GetMapping("/hentBilett")
    public List<Bilett> hentBilett(){
        return rep.hentAlleBiletter();
    }

    @GetMapping("/slett")
    public void slett(){
        rep.slettAlleBiletter();
    }
}
