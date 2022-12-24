package ticket;

import java.text.DecimalFormat;
import java.util.Random;

import javax.annotation.processing.Generated;

import clientTicket.Client;
import manager.Manager;
import attendant.Attendant;

public class Ticket {
  private int priority;
  private String message;
  private int idTicket;
  private Client client;
  private Attendant attendant;
  private Manager manager;

  public Ticket(int priority, String message) {
    this.client = client;
    this.priority = priority;
    this.AddClientmessage(message);
    idTicket();
  }

  private double idTicket() {
    int max = 1000;
    int min = 1;
    int range = max - min + 1;
    int idTicket = (int) (Math.random() * range) + min;
    return idTicket;
  }

  private String AddClientmessage(String message) {
    this.message = message;
    return this.message;
  }

  private int low() {
    int priority = 1;
    this.priority = 0;
    this.priority = priority;
    return this.priority;
  }

  private int medium() {
    int priority = low() + 1;
    this.priority = priority;
    return this.priority;
  }

  private int high() {
    int priority = medium() + 1;
    this.priority = priority;
    return this.priority;
  }

  public static void main(String[] args) {
    Ticket ticket = new Ticket(1, "Computador desliga sozinho");
    // System.out.println(ticket.message("Recebi meu ticket com numeração
    // faltando"));
    System.out.println("Prioridade: " + ticket.high());
    System.out.println("ID: " + ticket.idTicket());

  }
}