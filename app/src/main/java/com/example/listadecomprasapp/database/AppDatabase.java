package com.example.listadecomprasapp.database;

import android.content.ClipData;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.listadecomprasapp.DAO.ItemListaDAO;
import com.example.listadecomprasapp.DAO.ListaDeComprasDAO;
import com.example.listadecomprasapp.DAO.ProdutoDAO;
import com.example.listadecomprasapp.DAO.UsuarioDAO;
import com.example.listadecomprasapp.model.ItemLista;
import com.example.listadecomprasapp.model.ListaDeCompras;
import com.example.listadecomprasapp.model.Produto;
import com.example.listadecomprasapp.model.Usuario;
import com.example.listadecomprasapp.util.Converters;

@Database(entities = {Usuario.class, Produto.class, ItemLista.class, ListaDeCompras.class},
            version = 1)
@TypeConverters(value = Converters.class)
public abstract class AppDatabase extends RoomDatabase {
    private static volatile AppDatabase INSTANCE;
    public abstract UsuarioDAO usuarioDAO();
    public abstract ProdutoDAO produtoDAO();
    public abstract ListaDeComprasDAO listaDeComprasDAO();
    public abstract ItemListaDAO itemListaDAO();

    public static AppDatabase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (AppDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"lista_app").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }
}
