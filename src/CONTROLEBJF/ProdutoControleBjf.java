/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLEBJF;


import bean.ProdutoBjf;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author duals
 */
public class ProdutoControleBjf extends AbstractTableModel{
     List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }
     public ProdutoBjf getBean(int row){
        return (ProdutoBjf) lista.get(row);
    }

    @Override
    public int getRowCount() {
         return lista.size();
    }

    @Override
    public int getColumnCount() {
           return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProdutoBjf produto = (ProdutoBjf) lista.get(rowIndex);
        if(columnIndex == 0){
            return produto.getIdprodutoBjf();
        }
        if(columnIndex == 1){
            return produto.getNomeBjf();
        }
        if(columnIndex == 2){
            return produto.getPrecoBjf();
        }
        if(columnIndex == 3){
            return produto.getCategoriaBjf();
        }
        return "";
     
     }
}
