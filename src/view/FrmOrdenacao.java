/*Atualizações
 * Alunos :  Erick Silva de Oliveira.
 *Alunos : Thiago Antônio de Carvalho Mota
 */
package view;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class FrmOrdenacao extends javax.swing.JFrame {
    
    public FrmOrdenacao() {
        initComponents();
    }
    
    public static String bubbleSort(String[] vetor){
               boolean troca = true;
               String aux = "";
               while (troca) {
                   troca = false;
                   for (int i = 0; i < vetor.length - 1; i++) {
                       if (vetor[i].length() > vetor[i + 1].length()) {
                           aux = vetor[i];
                           vetor[i] = vetor[i + 1];
                           vetor[i + 1] = aux;
                           troca = true;
                       }
                   }
               }
            /*for(int j = 0; j < vetor.length; j++){
                System.out.println("Palavra: " + vetor[j] + "Tamanho: " + vetor[j].length());
            }*/
            try {
                // Cria arquivo
                File file = new File("Ordenados.txt");

                // Se o arquivo nao existir, ele gera
                if (!file.exists()) {
                    file.createNewFile();                   
                }

                // Prepara para escrever no arquivo
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);

                // Escreve e fecha arquivo
                for(int j = 0; j < vetor.length; j++){
                    bw.write(vetor[j]/* + "Tamanho: " + vetor[j].length()*/);
                    bw.newLine();
                }
                return file.getAbsoluteFile().toString();
            } catch (Exception e) {

            }
            return "teste";                           
    }  
   public static String selectionSort(String[] array) { 
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
               if (array[i].length() < array[menor].length()) {
                  menor = i;
               }
            }
            if (menor != fixo) {
              String t = array[fixo];
              array[fixo] = array[menor];
              array[menor] = t;
            }
        }

        /*
        alterações precisas
        
        for(int j = 0; j < array.length; j++){
            System.out.println("teste");
            System.out.println("Palavra: " + array[j] + "Tamanho: " + array[j].length());
        }*/
        
       try {
           // Cria arquivo
           File file = new File("Ordenados.txt");

           // Se o arquivo nao existir, ele gera
           if (!file.exists()) {
               file.createNewFile();
           }

           // Prepara para escrever no arquivo
           FileWriter fw = new FileWriter(file.getAbsoluteFile());
           BufferedWriter bw = new BufferedWriter(fw);

           // Escreve e fecha arquivo
           for (int j = 0; j < array.length; j++) {
               bw.write(array[j]/* + "Tamanho" + array[j].length()*/);
               bw.newLine();
           }
           return file.getAbsoluteFile().toString();
       } catch (Exception e) {

       }
       return "teste";
    }
    
   public static String insertionSort(String[] vetor) {
        int j;
        String key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
          key = vetor[j];
          for (i = j - 1; (i >= 0) && (vetor[i].length() > key.length()); i--)
          {
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }
        for(int t = 0; t < vetor.length; t++){            
            System.out.println("Palavra: " + vetor[t] + "Tamanho: " + vetor[t].length());
        }
        
               try {
           // Cria arquivo novo motificador 
           File file = new File("Ordenados.txt");

           // Se o arquivo nao existir, ele gera
           if (!file.exists()) {
               file.createNewFile();
           }

           // Prepara para escrever no arquivo novo
           FileWriter fw = new FileWriter(file.getAbsoluteFile());
           BufferedWriter bw = new BufferedWriter(fw);

           // Escreve e fecha arquivo
           for (int t = 0; t < vetor.length; t++) {
               bw.write(vetor[t]/* + "Tamanho" + vetor[t].length()*/);
               bw.newLine();
           }
           //System.out.println(file.getAbsoluteFile());           
           bw.close();
           return file.getAbsoluteFile().toString();
       } catch (Exception e) {

       }
       return "teste";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        txtNomeArquivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 410));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 410));

        jPanel1.setBackground(new java.awt.Color(27, 187, 125));

        jLabel1.setFont(new java.awt.Font("DokChampa", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ordenador de Dicionários");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(56, 65, 84));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Carregar Arquivo");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtNomeArquivo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(91, 95, 99));
        jLabel3.setText("Ordenações");

        jButton1.setBackground(new java.awt.Color(56, 65, 84));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SelectionSort");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(56, 65, 84));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BubbleSort");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(56, 65, 84));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("InsertionSort");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(56, 65, 84));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Sair");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(91, 95, 99));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Carregue um Arquivo TXT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(66, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(txtNomeArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(235,235,235));
        jButton2.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(58,65,84));
        jButton2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(235,235,235));
        jButton1.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(58,65,84));
        jButton1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(235,235,235));
        jButton3.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(58,65,84));
        jButton3.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(235,235,235));
        jButton4.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new Color(58,65,84));
        jButton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int numerosdeLinhas = 0; 
        String arquivo = txtNomeArquivo.getText(); 
        System.out.println(arquivo); 
        String linha = "1"; 
        int i = 0;       
        
        try { 
            FileReader arq = new FileReader(arquivo); 
            BufferedReader br = new BufferedReader(arq);            
            while(linha != null){                                               
                numerosdeLinhas = numerosdeLinhas + 1;                
                //System.out.println(br.readLine());
                linha = br.readLine();                
            }
            numerosdeLinhas = (numerosdeLinhas/2)-1;
            System.out.println(numerosdeLinhas);
            arq.close();                 
        } catch (IOException e) { 
            System.err.printf("Erro na abertura do arquivo: %s.\n", 
            e.getMessage()); 
        } 
        System.out.println(numerosdeLinhas);
        String vetor[] = new String[numerosdeLinhas]; 
        linha = ""; 
        numerosdeLinhas = vetor.length - 1;         
        try { 
           FileReader arq1 = new FileReader(arquivo); 
           BufferedReader br1 = new BufferedReader(arq1);
           linha = br1.readLine();
           linha = br1.readLine(); 
           while(linha != null){ 
                vetor[i] = br1.readLine();
                if(i < numerosdeLinhas){ 
                    i++; 
                }
                linha = br1.readLine(); 
            } 
            arq1.close(); 
        } catch (IOException e) { 
            System.err.printf(e.getMessage()); 
        } 
        for(int t = 0; t < vetor.length; t++){ 
            //System.out.println("Palavra: " + vetor[t]);            
        }
        long tempoInicial = System.currentTimeMillis();        
        txtNomeArquivo.setText(selectionSort(vetor));        
        long tempoFinal = (System.currentTimeMillis());
        tempoFinal = (tempoFinal - tempoInicial)/1000;
        JOptionPane.showMessageDialog(null, "A Ordenação através do SelectionSort teve a duração de " + tempoFinal + " segundos");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fc = new JFileChooser();
        File arquivo = null;
        int value = fc.showOpenDialog(null);
        if ( value == JFileChooser.APPROVE_OPTION ){
            arquivo = fc.getSelectedFile();
            txtNomeArquivo.setText(arquivo.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int numerosdeLinhas = 0; 
        String arquivo = txtNomeArquivo.getText(); 
        System.out.println(arquivo); 
        String linha = "1"; 
        int i = 0;       
        
        try { 
            FileReader arq = new FileReader(arquivo); 
            BufferedReader br = new BufferedReader(arq);            
            while(linha != null){                                               
                numerosdeLinhas = numerosdeLinhas + 1;                
                //System.out.println(br.readLine());
                linha = br.readLine();                
            }
            numerosdeLinhas = (numerosdeLinhas/2)-1;
            System.out.println(numerosdeLinhas);
            arq.close();                 
        } catch (IOException e) { 
            System.err.printf("Erro na abertura do arquivo: %s.\n", 
            e.getMessage()); 
        } 
        System.out.println(numerosdeLinhas);
        String vetor[] = new String[numerosdeLinhas]; 
        linha = ""; 
        numerosdeLinhas = vetor.length - 1;         
        try { 
           FileReader arq1 = new FileReader(arquivo); 
           BufferedReader br1 = new BufferedReader(arq1);
           linha = br1.readLine();
           linha = br1.readLine(); 
           while(linha != null){ 
                vetor[i] = br1.readLine();
                if(i < numerosdeLinhas){ 
                    i++; 
                }
                linha = br1.readLine(); 
            } 
            arq1.close(); 
        } catch (IOException e) { 
            System.err.printf(e.getMessage()); 
        } 
        for(int t = 0; t < vetor.length; t++){ 
            System.out.println("Palavra: " + vetor[t]); 
        }
        long tempoInicial = System.currentTimeMillis();
        String nomeDestino = bubbleSort(vetor);
        txtNomeArquivo.setText(nomeDestino);
        long tempoFinal = (System.currentTimeMillis());
        tempoFinal = (tempoFinal - tempoInicial)/1000;
        JOptionPane.showMessageDialog(null, "A Ordenação através do BubbleSort teve a duração de " + tempoFinal + " segundos");
        System.out.println("Em minutos: " + tempoFinal);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int numerosdeLinhas = 0; 
        String arquivo = txtNomeArquivo.getText(); 
        System.out.println(arquivo); 
        String linha = "1"; 
        int i = 0;       
        
        try { 
            FileReader arq = new FileReader(arquivo); 
            BufferedReader br = new BufferedReader(arq);            
            while(linha != null){                                               
                numerosdeLinhas = numerosdeLinhas + 1;                
                //System.out.println(br.readLine());
                linha = br.readLine();                
            }
            numerosdeLinhas = (numerosdeLinhas/2)-1;
            System.out.println(numerosdeLinhas);
            arq.close();                 
        } catch (IOException e) { 
            System.err.printf("Erro na abertura do arquivo: %s.\n", 
            e.getMessage()); 
        } 
        System.out.println(numerosdeLinhas);
        String vetor[] = new String[numerosdeLinhas];        
        linha = ""; 
        numerosdeLinhas = vetor.length - 1;         
        try { 
           FileReader arq1 = new FileReader(arquivo); 
           BufferedReader br1 = new BufferedReader(arq1);
           linha = br1.readLine();
           linha = br1.readLine(); 
           while(linha != null){ 
                vetor[i] = br1.readLine();
                if(i < numerosdeLinhas){ 
                    i++; 
                }
                linha = br1.readLine(); 
            } 
            arq1.close(); 
        } catch (IOException e) { 
            System.err.printf(e.getMessage()); 
        } 
        for(int t = 0; t < vetor.length; t++){ 
            System.out.println("Palavra: " + vetor[t]); 
        }
        long tempoInicial = System.currentTimeMillis();
        insertionSort(vetor);
        txtNomeArquivo.setText(insertionSort(vetor));        
        long tempoFinal = (System.currentTimeMillis());
        tempoFinal = (tempoFinal - tempoInicial)/1000;
        JOptionPane.showMessageDialog(null, "A Ordenação através do InsertionSort teve a duração de " + tempoFinal + " segundos");        
        System.out.println("Em minutos: " + tempoFinal);        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setBackground(new Color(167, 19, 20, 255));
        jButton7.setForeground(Color.WHITE);        
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setBackground(new Color(58,65,84));
        jButton7.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOrdenacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNomeArquivo;
    // End of variables declaration//GEN-END:variables
}
