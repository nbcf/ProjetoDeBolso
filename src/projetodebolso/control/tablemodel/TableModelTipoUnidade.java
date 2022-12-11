package projetodebolso.control.tablemodel;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package projetodebolso;
//
//
//import io.github.nbcf.se.model.Tipounidade;
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.table.AbstractTableModel;
//
//
//
// /**
//* @author NILDO BUENO CORREIA FILHO 
// * CPF: 10333054725
// * EMAIL: nil_bueno@hotmail.com    
// * JAVA VERSION 8 - 14
// * NETBEANS     8.2 - 12
// * 
// * Created on 30/12/2021, 03:20:27
// */
//public class TableModelTipoUnidade extends AbstractTableModel {
//       private List<Tipounidade> valores = new ArrayList();
//       private final String id;
//       private final String nome;
//  
//public TableModelTipoUnidade(List<Tipounidade> tipounidade, String nomeColunaId, String nomeColunaNome) {
//        this.valores =  tipounidade;
//        this.id      = nomeColunaId;
//        this.nome    = nomeColunaNome;
//    }
//
//       @Override
//    public int getRowCount() {
//        return valores.size();
//    }
//       @Override
//    public int getColumnCount() {
//        return 2;
//    }
//       @Override
//    public Object getValueAt(int rowIndex, int columnIndex) {
//        
//    Tipounidade tipounidade = valores.get(rowIndex);
//        switch (columnIndex) {
//            case 0:
//                return tipounidade.getId();
//            case 1:
//                return tipounidade.getNome();
//            default:
//               return "";
//        }
//    }
//        
//    public void adicionar(Tipounidade addCat){
//	valores.add(addCat);
//	fireTableRowsInserted(valores.size() - 1, valores.size() - 1);
//	}
//    
//    public void remover(Tipounidade removerCat){
//	valores.remove(removerCat);
//	fireTableRowsInserted(valores.size() - 1, valores.size() - 1);
//	}
//    
//    @Override
//    public String getColumnName(int coluna) {
//        switch (coluna) {
//            case 0:
//                return id;     
//            case 1:
//                return nome;
//            default:
//         return "";
//    }
//  }
//       @Override
//     public boolean isCellEditable(int rowIndex, int columnIndex) {
//     return false;
//    }
//    
//       @Override
//     public Class<?> getColumnClass(int columnIndex) {
//        if (columnIndex == 0) {
//            return Integer.class;
//        } else if (columnIndex == 1){
//            return String.class;
//        }
//        return null;
//    }
//
//    public Tipounidade get(int row) {
//        return valores.get(row);
//    }
//}
