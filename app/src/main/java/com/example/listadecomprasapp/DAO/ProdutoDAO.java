package com.example.listadecomprasapp.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.listadecomprasapp.model.Produto;

import java.util.List;

@Dao
public interface ProdutoDAO {
    @Insert
    long insert(Produto produto);

    @Update
    int update(Produto produto);

    @Query("SELECT * from tbl_produto")
    List<Produto> getAll();
}
