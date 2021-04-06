class Main {

  public static void main(String[] args) {
    Pessoa maria = new Pessoa("maria", "claro");
    System.out.println(maria);
    System.out.println(maria.getClass());

    maria.setNome("do carmo");
    System.out.println(maria);

    maria.setSobrenome("ferrera");
    System.out.println(maria);

    System.out.println(maria.getNome());
    System.out.println(maria.getSobrenome());
    System.out.println(maria.getNomeCompleto());
    
    System.out.println();
    Funcionario funcionario = new Funcionario(1, "mario", "bros", 100);
    System.out.println(funcionario);
    System.out.println(funcionario.getClass());

    System.out.println("parcela 1º " + funcionario.getSalarioPrimeiraParcela());
    System.out.println("parcela 2º " + 
    funcionario.getSalarioSegundaParcela());
    System.out.println();

    funcionario.setSalario(50);
    System.out.println("parcela 1º " + funcionario.getSalarioPrimeiraParcela());
    System.out.println("parcela 2º " + funcionario.getSalarioSegundaParcela());
    System.out.println();

    Professor prof = new Professor("Fabrício", "Valadares", 1, 100);
    System.out.println(prof);
    System.out.println(prof.getClass());

    System.out.println("parcela 1º"+prof.getSalarioPrimeiraParcela());
    System.out.println("parcela 2º"+ prof.getSalarioSegundaParcela());

    prof.setSalario(
      1000000
      );
    System.out.println("parcela 1º "+ prof.getSalarioPrimeiraParcela());
    System.out.println("parcela 2º "+ prof.getSalarioSegundaParcela());
  }




}