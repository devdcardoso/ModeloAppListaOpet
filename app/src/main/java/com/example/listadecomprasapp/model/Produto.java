package com.example.listadecomprasapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_produto")
public class Produto {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "produto_id")
    private long ID;
    @ColumnInfo(name = "produto_nome")
    private String nome;
    @ColumnInfo(name = "produto_unidade")
    private String unidade;

    public Produto() {
    }

    public Produto(String nome, String unidade) {
        this.nome = nome;
        this.unidade = unidade;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
