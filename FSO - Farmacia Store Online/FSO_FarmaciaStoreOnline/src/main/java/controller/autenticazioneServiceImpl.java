package controller;

import model.utente;

public class autenticazioneServiceImpl implements autenticazioneService {
    @Override
    public boolean doCheckUsernameAlredyUsed(utente username) {
        return false;
    }

    @Override
    public boolean doCheckPassword(String username, String password) {
        return false;
    }
}
