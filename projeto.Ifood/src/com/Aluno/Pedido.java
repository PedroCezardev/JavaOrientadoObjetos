package com.Aluno;

public class Pedido{
    private int id;
    private String items;
    private String status;

    Pedido(int id, String items, String status){
        this.id = id;
        this.items = items;
        this.status = status;
    }

    // Exibir informações
    void exibirInfo() {
        System.out.println("Id do Pedido: " + id);
        System.out.println("Itens de compra: " + items);
        System.out.println("status do Pedido: " + status);
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getItems() {
        return this.items;
    }

    public String getStatus() {
        return this.status;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Escrever métodos:  adicionarItem(item: Item): void
    //        removerItem(item: Item): void
    //        calcularTotal(): double
}