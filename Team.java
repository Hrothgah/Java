public class Team {
  Giocatore giocatore;

  public Team(Giocatore giocatore){
    this.giocatore = giocatore;
  }

  public static void main(String[] args){
    Giocatore mioGiocatore = new Giocatore("Pino","Pilone", 10, 1);

    Team mioTeam = new Team(mioGiocatore);

    System.out.println(mioTeam.giocatore.getNome());
    System.out.println(mioTeam.giocatore.getTipo());
    System.out.println(mioTeam.giocatore.getLivello());
    System.out.println(mioTeam.giocatore.getRank());
  }

}

class Giocatore {
  private String nome;
  private String tipo;
  private int livello;
  private int rank;

  public Giocatore(String nome, String tipo, int livello, int rank){
    this.nome = nome;
    this.tipo = tipo;
    this.livello = livello;
    this.rank = rank;
  }

  public String getNome(){
    return this.nome;
  }

  public String getTipo(){
    return this.tipo;
  }

  public int getLivello(){
    return this.livello;
  }

  public int getRank(){
    return this.rank;
  }
}
