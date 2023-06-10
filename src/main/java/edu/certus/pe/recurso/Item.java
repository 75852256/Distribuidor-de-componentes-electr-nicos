package edu.certus.pe.recurso;

public class Item {
    int idItem;
    String nombreItem;

    public Item(int idItem , String nombreItem) {
        this.idItem = idItem;
        this.nombreItem = nombreItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }
}
