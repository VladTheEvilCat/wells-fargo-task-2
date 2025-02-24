package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {}

    public Portfolio(Client client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() { return this.portfolioId; }

    public Client getCLient() { return this.client; }

    public void setClient(Client client) { this.client = client; }

    public String getCreationDate() { return this.creationDate; }
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
}
