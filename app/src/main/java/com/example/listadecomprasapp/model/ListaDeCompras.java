package com.example.listadecomprasapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "tbl_listadecompras",
        foreignKeys = @ForeignKey(entity = Usuario.class,parentColumns = "usuario_id",childColumns = "listadecompras_idUsuario" ))
public class ListaDeCompras {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "listadecompras_id")
    private long ID;
    @ColumnInfo(name = "listadecompras_idUsuario")
    private long IDUsuario;
    @ColumnInfo(name = "listadecompras_nome")
    private String nome;
    @ColumnInfo(name = "listadecompras_data")
    private Date dataLista;
    @ColumnInfo(name = "listadecompras_utilizada")
    private boolean utilizada;

    public ListaDeCompras() {
    }

    public ListaDeCompras(long IDUsuario, String nome, Date dataLista, boolean utilizada) {
        this.IDUsuario = IDUsuario;
        this.nome = nome;
        this.dataLista = dataLista;
        this.utilizada = utilizada;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(long IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataLista() {
        return dataLista;
    }

    public void setDataLista(Date dataLista) {
        this.dataLista = dataLista;
    }

    public boolean isUtilizada() {
        return utilizada;
    }

    public void setUtilizada(boolean utilizada) {
        this.utilizada = utilizada;
    }
}
