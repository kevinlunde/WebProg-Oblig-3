package oblig3.demo;

public class Bilett {
    private String film;
    private String antall;
    private String fornavn;
    private String etternavn;
    private String tlf;
    private String epost;

    public Bilett(String film, String antall, String fornavn, String etternavn, String tlf, String epost){
        this.film =film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.tlf = tlf;
        this.epost = epost;
    }

    public Bilett(){

    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        film = film;
    }

    public String getAntall() {
        return antall;
    }

    public void setAntall(String antall) {
        antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        etternavn = etternavn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        epost = epost;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        tlf = tlf;
    }
}