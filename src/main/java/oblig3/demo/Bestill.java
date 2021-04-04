package oblig3.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Bestill {

    private final List<Bilett> Biletter = new ArrayList<>();

    @PostMapping("/kjop")
    public void lagreBilett(Bilett innBilett){
        Biletter.add(innBilett);

    }

    @GetMapping("/hentBilett")
    public List<Bilett> hentBilett(){
        return Biletter;
    }

    @GetMapping("/slett")
    public void slett(){
        Biletter.clear();
    }
}
