package com.example.listadecomprasapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_itemlista",
        foreignKeys = {
            @ForeignKey(entity = Produto.class,parentColumns = "produto_id",childColumns = "itemlista_idproduto"),
                @ForeignKey(entity = ListaDeCompras.class,parentColumns = "listadecompras_id",childColumns = "itemlista_idlista")
        })
public class ItemLista {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="itemlista_id")
    private long ID;
    @ColumnInfo(name = "itemlista_idproduto")
    private long IDProduto;
    @ColumnInfo(name = "itemlista_idlista")
    private long IDLista;
    @ColumnInfo(name = "itemlista_quantidade")
    private double qtde;


    public ItemLista() {
    }

    public ItemLista(long IDProduto, long IDLista, double qtde) {
        this.IDProduto = IDProduto;
        this.IDLista = IDLista;
        this.qtde = qtde;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(long IDProduto) {
        this.IDProduto = IDProduto;
    }

    public long getIDLista() {
        return IDLista;
    }

    public void setIDLista(long IDLista) {
        this.IDLista = IDLista;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

}
