package br.com.fundamentosjava.Observer.Obs01;

public class AniversarioSurpresa {
    public static void main(String[] args) {

        Namorada namorada = new Namorada();
        PorteiroSubject porteiroSubject = new PorteiroSubject();

        porteiroSubject.addChegadaAniversanteObserver(namorada);

        porteiroSubject.start();
    }
}
