package model;

public class utente {
    public utente(String username, String password, String provincia, String citta, String via, String iban, String preferenza, long telefono) {
        this.username = username;
        this.password = password;
        this.provincia = provincia;
        this.citta = citta;
        this.via = via;
        this.iban = iban;
        this.preferenza = preferenza;
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getPreferenza() {
        return preferenza;
    }

    public void setPreferenza(String preferenza) {
        this.preferenza = preferenza;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    private String username, password, provincia, citta, via, iban, preferenza;
    private long telefono;
}
