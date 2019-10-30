package com.example.listadecomprasapp.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.listadecomprasapp.model.ListaDeCompras;

import java.util.List;

@Dao
public interface ListaDeComprasDAO {
    @Insert
    long insert(ListaDeCompras listaDeCompras);

    @Update
    int update(ListaDeCompras listaDeCompras);

    @Query("SELECT * from tbl_listadecompras where listadecompras_idUsuario = :id_usuario")
    List<ListaDeCompras> getListaUsuario(long id_usuario);

    @Query("SELECT * from tbl_listadecompras where listadecompras_id = :id LIMIT 1")
    ListaDeCompras getLista(long id);
}
