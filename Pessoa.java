class Pessoa 
{


  private String nome;

  private String sobrenome;


  public Pessoa(String nome, String sobrenome) 
  {
    setNomeCompleto(nome, sobrenome);
  }
  private void setNomeCompleto(String nome, String sobrenome)
  {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  public Pessoa(){ setNomeCompleto("", ""); }
  public void setNome(String valor) 
  {
    nome = valor;
  }
  public String getNome() 
  {
    return nome;
  }
  public void setSobrenome(String valor) 
  {
    this.sobrenome = valor;
  }
  public String getSobrenome() 
  {
    return sobrenome;
  }
  public String getNomeCompleto() 
  {
    return getNome()+" "+getSobrenome();
  }
  public String toString() 
  {
    return "nomecompleto "+getNomeCompleto();
  }
}