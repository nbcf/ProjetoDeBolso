package projetodebolso.control.tablemodel;

//package projetodebolso;
//
//import io.github.nbcf.se.model.Produto;
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
//public class TableModelProduto extends AbstractTableModel {
//       private List<Produto> valores = new ArrayList();
//       private final String id;
//       private final String nome;
//       private final String fabricante;
//       private final String descricao;
//       private final String tipoProduto;
//       private final String categoria;      
//       private final String tipoUnidade;
//       private final String quantUnidade; 
//       private final String tipoQuantidade;
//  
//       
//       
//  
//public TableModelProduto(List<Produto> produto, 
//        String nomeColunaId, 
//        String nomeColunaNome, 
//        String nomeColunaFabricante, 
//        String nomeColunaDescricao,
//        String nomeColunaTipoProduto,
//        String nomeColunaCategoria,
//        String nomeColunaTipoUnidade,
//        String nomeColunaQuantidadeUnidade,
//        String nomeColunaTipoQuantidade) {
//    
//        this.valores            = produto;
//        this.id                 = nomeColunaId;
//        this.nome               = nomeColunaNome;
//        this.fabricante         = nomeColunaFabricante;
//        this.descricao          = nomeColunaDescricao;
//        this.tipoProduto        = nomeColunaTipoProduto;
//        this.categoria          = nomeColunaCategoria;
//        this.tipoUnidade        = nomeColunaTipoUnidade;
//        this.quantUnidade       = nomeColunaQuantidadeUnidade;
//        this.tipoQuantidade     = nomeColunaTipoQuantidade;
//      
//        
//    }
//
//       @Override
//    public int getRowCount() {
//        return valores.size();
//    }
//       @Override
//    public int getColumnCount() {
//        return 9;
//    }
//       @Override
//    public Object getValueAt(int rowIndex, int columnIndex) {
//        
//    Produto produto = valores.get(rowIndex);
//        switch (columnIndex) {
//            case 0:
//                return produto.getId();
//            case 1:
//                return produto.getNome();
//            case 2:
//                return produto.getFabricante();
//            case 3:
//                return produto.getDescricao();
//            case 4:
//                return produto.getTipoproduto();
//            case 5:
//                return produto.getCategoria();
//            case 6:
//                return produto.getTipounidade();
//            case 7:
//                return produto.getQuantidade();
//            case 8:
//                return produto.getTipoquantidade();
//            default:
//               return "";
//        }
//    }
//        
//    public void adicionar(Produto addCat){
//	valores.add(addCat);
//	fireTableRowsInserted(valores.size() - 1, valores.size() - 1);
//	}
//    
//    public void remover(Produto removerCat){
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
//            case 2:
//                return fabricante;     
//            case 3:
//                return descricao;
//            case 4:
//                return tipoProduto;     
//            case 5:
//                return categoria;
//            case 6:
//                return tipoUnidade;     
//            case 7:
//                return quantUnidade; 
//            case 8:
//                return tipoQuantidade;                 
//            default:
//     
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
//          else if (columnIndex == 0) {
//            return Integer.class;
//        } else if (columnIndex == 1){
//            return String.class;
//        } else if (columnIndex == 2) {
//            return Integer.class;
//        } else if (columnIndex == 3){
//            return String.class;
//        } else if (columnIndex == 4) {
//            return Integer.class;
//        } else if (columnIndex == 5){
//            return String.class;
//        } else if (columnIndex == 6){
//            return String.class;
//        } else if (columnIndex == 7) {
//            return Integer.class;
//        } else if (columnIndex == 8){
//            return String.class;
//        }
//
//          return null;
//    }
//    public Produto get(int row) {
//        return valores.get(row);
//    }
//}
