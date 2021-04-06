class Professor extends Funcionario
{
  public Professor(
    String nome, 
    String sobrenome, 
    int matricula, 
    double salario
  ) {
    super(matricula, nome, sobrenome, salario);
  }

  public double getSalarioPrimeiraParcela() 
  {
    return getSalario() * 100 / 100;
  }

  public double getSalarioSegundaParcela() 
  {
    return 0;
  }



}





