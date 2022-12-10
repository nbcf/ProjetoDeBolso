 /**
* @author NILDO BUENO CORREIA FILHO 
 * CPF: 10333054725
 * EMAIL: nil_bueno@hotmail.com    
 * JAVA VERSION - 8;14;17
 * NETBEANS     - 8;12;16  >> ...Muitos anos fazendo isso
 * 
 * não tenho celular, 
 * por gentileza entrem 
 * em contato pelo email acima. 
 * ;)
 * Created on 03/05/2011, 03:20:27
 */

package View;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;

public class SimuladorVendaContratosView1 extends javax.swing.JFrame {
     private static DefaultTableModel modelo;
     private static BigDecimal p1a6_1;
     private static BigDecimal p1a6_2;
     private static BigDecimal p1a6_3;
     private static BigDecimal p1a6_4;
     private static BigDecimal p1a6_5;
     private static BigDecimal p1a6_6;
     private static BigDecimal p7a11_7;
     private static BigDecimal p7a11_8;
     private static BigDecimal p7a11_9;
     private static BigDecimal p7a11_10;
     private static BigDecimal p7a11_11;
    private static Integer BolNumParcela1 ;
    private static Integer BolNumParcela2 ;
    private static Integer BolNumParcela3 ;
    private static Integer BolNumParcela4 ;
    private static Integer BolNumParcela5 ;
    private static Integer BolNumParcela6 ;
    private static Integer BolNumParcela7 ;
    private static Integer BolNumParcela8 ;
    private static Integer BolNumParcela9 ;
    private static Integer BolNumParcela10 ;
    private static Integer BolNumParcela11 ;
    private static Date  Bol1DateVencimento ;
    private static Date  Bol2DateVencimento ;
    private static Date  Bol3DateVencimento ;
    private static Date  Bol4DateVencimento ;
    private static Date  Bol5DateVencimento ;
    private static Date  Bol6DateVencimento ;
    private static Date  Bol7DateVencimento ;
    private static Date  Bol8DateVencimento ;
    private static Date  Bol9DateVencimento ;
    private static Date  Bol10DateVencimento ;
    private static Date  Bol11DateVencimento ;

    public SimuladorVendaContratosView1() {
        initComponents();
        setSize(635, 447);//[][]
        setResizable(true);
        setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tipoContrato = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 102, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO PARCELA", "VALOR DA PARCELA", "DATA VENCIMENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("GERAR DATAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("VALOR TOTAL:");

        jLabel3.setText("PLANO PGTO:");

        jTextField2.setText("11");
        jTextField2.setEnabled(false);

        jLabel4.setText("INTERVALO DIAS:");

        jLabel5.setText("PRIMEIRO PGTO:");

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        jLabel6.setText("TIPO CONT.");

        tipoContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipoContrato, 0, 1, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIMULADOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButton2.setText("Fechar Simulação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
calculaSimulador();
Jtable();

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimuladorVendaContratosView1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox tipoContrato;
    // End of variables declaration//GEN-END:variables

    public void calculaSimulador(){
       Double valor_contrato   = (Double) Double.parseDouble(jTextField1.getText());
       int pPagamento = (Integer)Integer.parseInt(jTextField2.getText());
       Double vendaNormal = valor_contrato / pPagamento;
            Double  clt_pb         =    (valor_contrato * 70) / 100;
            Double restantateB    =     valor_contrato - clt_pb;
            Double  d_1a6_parcela  = (clt_pb /  6 ) ;
            Double  d_7a11_parcela = (restantateB / 5)  ;

                GregorianCalendar cal2 = new GregorianCalendar();
                Date dt_1pgto = new Date();
                dt_1pgto = jDateChooser1.getDate();
                int     rs ;
                int     pPagamentoAjusteint = pPagamento +1;
                int     intervaloVencimento = Integer.parseInt(jTextField3.getText());

        for(int i = 0 ; i < pPagamento ; i++){
        rs =  intervaloVencimento * i;
        cal2.setTime(dt_1pgto);
        cal2.add(GregorianCalendar.DATE, rs);
            if(tipoContrato.getSelectedItem().equals("B")){
                    int cb = i+1;
                    if(cb == 1){
                       p1a6_1 = new BigDecimal(d_1a6_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                       Bol1DateVencimento = cal2.getTime();
                       BolNumParcela1 = cb;
                    }
                    if(cb == 2)
                    {
                       p1a6_2 = new BigDecimal(d_1a6_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                       Bol2DateVencimento = cal2.getTime();
                       BolNumParcela2 = cb;
                    }
                    if(cb == 3)
                    {
                      p1a6_3 = new BigDecimal(d_1a6_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                      Bol3DateVencimento = cal2.getTime();
                      BolNumParcela3 = cb;
                    }
                    if(cb == 4)
                    {
                       p1a6_4 = new BigDecimal(d_1a6_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                       Bol4DateVencimento = cal2.getTime();
                       BolNumParcela4 = cb;
                    }
                    if(cb == 5)
                    {
                       p1a6_5 = new BigDecimal(d_1a6_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                       Bol5DateVencimento = cal2.getTime();
                       BolNumParcela5 = cb;
                    }
                    if(cb == 6)
                    {
                         p1a6_6 = new BigDecimal(d_1a6_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                         Bol6DateVencimento = cal2.getTime();
                         BolNumParcela6 = cb;
                    }

                    if(cb == 7)
                    {
                        p7a11_7 = new BigDecimal(d_7a11_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                        Bol7DateVencimento = cal2.getTime();
                        BolNumParcela7 = cb;
                    }
                    if(cb == 8)
                    {
                         p7a11_8 = new BigDecimal(d_7a11_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                         Bol8DateVencimento = cal2.getTime();
                         BolNumParcela8 = cb;
                    }
                    if(cb == 9)
                    {
                         p7a11_9 = new BigDecimal(d_7a11_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                         Bol9DateVencimento = cal2.getTime();
                         BolNumParcela9 = cb;
                    }
                    if(cb == 10)
                    {
                       p7a11_10 = new BigDecimal(d_7a11_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                       Bol10DateVencimento = cal2.getTime();
                       BolNumParcela10 = cb;
                    }
                    if(cb == 11)
                    {
                         p7a11_11 = new BigDecimal(d_7a11_parcela).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                         Bol11DateVencimento = cal2.getTime();
                         BolNumParcela11 = cb;
                    }

                    
            }
            if(tipoContrato.getSelectedItem().equals("A"))
            {
                int cc = i+1;
                 if(cc == 1)
                    {
                       p1a6_1 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                        Bol1DateVencimento = cal2.getTime();
                       BolNumParcela1 = cc;
                    }
                    if(cc == 2)
                    {
                    p1a6_2 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                       Bol2DateVencimento = cal2.getTime();
                       BolNumParcela2 = cc;
                    }
                    if(cc == 3)
                    {
                        p1a6_3 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                      Bol3DateVencimento = cal2.getTime();
                      BolNumParcela3 = cc;
                    }
                    if(cc == 4)
                    {
                        p1a6_4 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                       Bol4DateVencimento = cal2.getTime();
                       BolNumParcela4 = cc;
                    }
                    if(cc == 5)
                    {
                         p1a6_5 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                        Bol5DateVencimento = cal2.getTime();
                        BolNumParcela5 = cc;
                    }
                    if(cc == 6)
                    {
                          p1a6_6 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                        Bol6DateVencimento = cal2.getTime();
                        BolNumParcela6 = cc;
                    }

                    if(cc == 7)
                    {
                         p7a11_7 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                        Bol7DateVencimento = cal2.getTime();
                        BolNumParcela7 = cc;
                    }
                    if(cc == 8)
                    {
                         p7a11_8 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                        Bol8DateVencimento = cal2.getTime();
                        BolNumParcela8 = cc;
                    }
                    if(cc == 9)
                    {
                         p7a11_9 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                        Bol9DateVencimento = cal2.getTime();
                        BolNumParcela9 = cc;
                    }
                    if(cc == 10)
                    {
                         p7a11_10 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                        Bol10DateVencimento = cal2.getTime();
                        BolNumParcela10 = cc;
                    }
                    if(cc == 11)
                    {
                          p7a11_11 = new BigDecimal(vendaNormal).setScale(2, RoundingMode.UP);//.add(new BigDecimal("0.01"));
                         Bol11DateVencimento = cal2.getTime();
                         BolNumParcela11 = cc;
                    }
                }
            }
        }

    public void Jtable(){
             jTable1.getColumnModel().getColumn(1).setPreferredWidth(220);
             jTable1.getColumnModel().getColumn(2).setPreferredWidth(220);

             modelo = (DefaultTableModel)jTable1.getModel();
             modelo.setNumRows(0);

            Object colecaoMultDBolNumParcela[][] = new Object[][]{
            {BolNumParcela1, BolNumParcela2, BolNumParcela3},
            {BolNumParcela4, BolNumParcela5, BolNumParcela6},
            {BolNumParcela7, BolNumParcela8, BolNumParcela9},
            {BolNumParcela10,BolNumParcela11}};

             Object colecaoMultDValor[][] = new Object[][]{{p1a6_1,p1a6_2,p1a6_3},
            {p1a6_4,p1a6_5,p1a6_6},
            {p7a11_7,p7a11_8,p7a11_9},
            {p7a11_10,p7a11_11}};

              DateFormat formatDatacr = new SimpleDateFormat("dd/MM/yyyy");
              String dataFormatada1 = formatDatacr.format(Bol1DateVencimento);
              String dataFormatada2 = formatDatacr.format(Bol2DateVencimento);
              String dataFormatada3 = formatDatacr.format(Bol3DateVencimento);
              String dataFormatada4 = formatDatacr.format(Bol4DateVencimento);
              String dataFormatada5 = formatDatacr.format(Bol5DateVencimento);
              String dataFormatada6 = formatDatacr.format(Bol6DateVencimento);
              String dataFormatada7 = formatDatacr.format(Bol7DateVencimento);
              String dataFormatada8 = formatDatacr.format(Bol8DateVencimento);
              String dataFormatada9 = formatDatacr.format(Bol9DateVencimento);
              String dataFormatada10 = formatDatacr.format(Bol10DateVencimento);
              String dataFormatada11 = formatDatacr.format(Bol11DateVencimento);

             Object colecaoMultDdataFormatada[][] = new Object[][]{{dataFormatada1,dataFormatada2,dataFormatada3},
            {dataFormatada4,dataFormatada5,dataFormatada6},
            {dataFormatada7,dataFormatada8,dataFormatada9},
            {dataFormatada10,dataFormatada11}};

            for(int i = 0; i < colecaoMultDBolNumParcela.length; i++ ){

            for(int e = 0; e < colecaoMultDBolNumParcela[i].length; e++){

                System.out.println(colecaoMultDBolNumParcela[i][e]);

                modelo.addRow(new Object[]{colecaoMultDBolNumParcela[i][e],colecaoMultDValor[i][e],colecaoMultDdataFormatada[i][e]});
            }
         }
     }
}
