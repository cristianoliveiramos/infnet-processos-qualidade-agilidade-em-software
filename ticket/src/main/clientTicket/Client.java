package clientTicket;

import java.util.Scanner;

import emailAddres.*;
import validateCpf.ValidateCpf;

public class Client {

  private ValidateCpf cpf;
  private String name;
  private int age;
  private EmailAddress email;
  private boolean pwd;

  private Client(String name, int age, EmailAddress email, boolean pwd) {
    this.name = name;
    this.age = age;
    this.email = email;
    this.cpf = cpf;
    this.pwd = pwd;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public boolean pwd() {
    return this.pwd;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setPwd(boolean pwd) {
    this.pwd = pwd;
  }

  public static void main(String[] args) {
    Client cliente2 = new Client("Patrícia", 28, new EmailAddress("patricia@email.com"),
        new ValidateCpf(),
        false);

    System.out.println(cliente2.cpf.isCPF("13350310737"));
  }

  // public static void main(String[] args) {
  // Scanner ler = new Scanner(System.in);

  // Client cliente2 = new Client("Patrícia", 28, new
  // EmailAddress("patricia@email.com"),
  // new ValidateCpf(),
  // false);

  // System.out.printf("Informe um nome: ");
  // cliente2 = ler.next();

  // System.out.println(
  // "Nome: " + cliente2.name + "\nIdade: " + cliente2.age + "\nE-mail: " +
  // cliente2.email.getEmailAddress()
  // + "\ncpf: " + cliente2.cpf.imprimeCPF("13350310737"));
  // }

}