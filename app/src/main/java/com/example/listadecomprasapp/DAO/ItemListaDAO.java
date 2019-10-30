package com.example.listadecomprasapp.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.listadecomprasapp.model.ItemLista;
import com.example.listadecomprasapp.model.ListaDeCompras;
import com.example.listadecomprasapp.model.Produto;

import java.util.List;

@Dao
public interface ItemListaDAO {
    @Insert
    long insert(ItemLista itemLista);

    @Query("SELECT * from tbl_itemlista INNER JOIN tbl_produto ON tbl_itemlista.itemlista_idproduto = tbl_produto.produto_id WHERE tbl_itemlista.itemlista_idlista = :id_lista")
    List<ItemLista> listaDeProdutos(long id_lista);
}
