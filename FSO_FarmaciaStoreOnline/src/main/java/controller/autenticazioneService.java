package controller;

import model.utente;

public interface autenticazioneService {
    public boolean doCheckUsernameAlredyUsed(utente username);
    public boolean doCheckPassword(String username, String password);

}
