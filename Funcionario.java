


class Funcionario extends Pessoa
{
  
  private int matricula;

  private double salario;

  public Funcionario(int matricula, String nome, String sobrenome, double salario) 
  {
    super(nome, sobrenome);

    this.matricula = matricula;
    this.salario = salario;
  }
  public void setMatricula(int matricula) 
  {
    this.matricula = matricula;
  }

  public int getMatricula() 
  {
    return this.matricula;
  }
  public void setSalario(double salario) 
  {
    if (salario < 0) 
    {
      salario = 0;
    } 
    else 
    {
      this.salario = salario;
    }
  }
  public double getSalario() 
  {
    return this.salario;
  }

  public double getSalarioPrimeiraParcela() 
  {
    return getSalario() *60/ 100;
  }




  public double getSalarioSegundaParcela() 
  {
    return getSalario()*40/100;
  }

  public String toString() 
  {
    return "matricula - " + getMatricula() + " - nome - " + super.toString() + " - salario - " + getSalario();
  }

}

