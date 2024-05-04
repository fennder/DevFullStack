package br.dev.abrindoportas.model;

public class Person {
  private String name;
  private int idade;

  public Person(String name, int idade) {
    this.name = name;
    this.idade = idade;
  }
  
  public Person() {

  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  

  @Override
  public String toString() {
    return "Person [name=" + name + ", idade=" + idade + ", getName()=" + getName() + ", getIdade()=" + getIdade()
        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
  }

  
}
