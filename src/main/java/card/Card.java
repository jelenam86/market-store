package main.java.card;

import main.java.client.Client;

public abstract class Card {

    private Client owner;

    public Card(Client owner) {
	this.owner = owner;
    }

    public Client getOwner() {
	return owner;
    }

    public void setOwner(Client owner) {
	if (owner == null)
	    throw new NullPointerException("The card must have an owner.");
	this.owner = owner;
    }
}
