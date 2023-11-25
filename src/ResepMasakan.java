
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ResepMasakan extends javax.swing.JFrame {

    /**
     * Creates new form ResepMasakan
     */
    public ResepMasakan() {
        
        initComponents();
    
        pilihan.addItem("Ayam Bakar Madu");
        pilihan.addItem("Ayam Pedas Manis");
        pilihan.addItem("Nasi Goreng");
        pilihan.addItem("Mie Goreng");
        pilihan.addItem("Ayam Goreng");
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihan = new javax.swing.JComboBox<>();
        pilihbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresep = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hapusbtn = new javax.swing.JButton();
        tambahfield = new javax.swing.JTextField();
        tambahbtn = new javax.swing.JButton();
        hapusbtn2 = new javax.swing.JButton();
        smpn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Aplikasi Resep Makanan");

        pilihan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });

        pilihbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pilihbtn.setText("Pilih");
        pilihbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihbtnActionPerformed(evt);
            }
        });

        list.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(list);

        txtresep.setColumns(20);
        txtresep.setRows(5);
        jScrollPane1.setViewportView(txtresep);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Nama Masakan :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Resep Masakan :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Pilihan Masakan");

        hapusbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hapusbtn.setText("Hapus");
        hapusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbtnActionPerformed(evt);
            }
        });

        tambahfield.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tambahfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahfieldActionPerformed(evt);
            }
        });

        tambahbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tambahbtn.setText("Tambah");
        tambahbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahbtnActionPerformed(evt);
            }
        });

        hapusbtn2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hapusbtn2.setText("Hapus");
        hapusbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbtn2ActionPerformed(evt);
            }
        });

        smpn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        smpn.setText("Simpan Resep");
        smpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smpnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Menambahkan Masakan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(tambahbtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hapusbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tambahfield, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(pilihbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(hapusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(smpn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))))
                            .addComponent(jLabel3))))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pilihbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 265, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambahfield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambahbtn)
                            .addComponent(hapusbtn2))
                        .addGap(70, 70, 70)
                        .addComponent(smpn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihbtnActionPerformed
        items.addElement(pilihan.getSelectedItem());
        list.setModel(items);
        if(pilihan.getSelectedItem().equals("Nasi Goreng")){
            txtresep.setText("\n BAHAN \n"
                    + "1. Nasi putih 1 piring\n" +
"2. Bawang putih 2 siung, cincang halus\n" +
"3. Kecap manis atau kecap asin sesuai selera\n" +
"4. Saus sambal sesuai selera\n" +
"5. Saus tiram sesuai selera\n" +
"6. Garam secukupnya\n" +
"7. Kaldu bubuk rasa ayam atau sapi sesuai selera\n" +
"8. Daun bawang 1 batang, cincang halus\n" +
"9. Telur ayam 1 butir\n" +
"10. Sosis ayam 1 buah, iris tipis\n" +
"11. Margarin atau minyak goreng 3 sdm"
                    + "\n CARA PEMBUATAN \n"
                    + "1. Siapkan penggorengan dengan api sedang, tuang margarin atau minyak goreng.\n" +
"2. Masukkan bawang putih dan daun bawang yang sudah dicincang halus. Tumis hingga berbau harum atau hingga warnanya keemasan.\n" +
"3. Masukkan sosis dan 1 butir telur ayam. Tumis sebentar.\n" +
"4. Masukkan bumbu halus dan nasi. Aduk hingga tercampur rata.\n" +
"5. Tuang kecap manis, saus sambal, saus tiram, garam, dan kaldu bubuk. Aduk hingga warna nasi berubah secara merata.\n" +
"6. Nasi goreng biasa yang sederhana dan enak siap disajikan.");
        }else if   (pilihan.getSelectedItem().equals("Mie Goreng")){
            txtresep.setText("BAHAN \n" +
"1. 200 gr mie kuning kering\n" +
"2. daun bawang secukupnya, potong-potong\n" +
"3. 1 sdm saus cabai\n" +
"4. 2 sdm kecap manis\n" +
"5. 1 siung bawang merah, haluskan\n" +
"6. 2 siung bawang putih, haluskan\n" +
"7. 1/2 sdt lada bubuk\n" +
"8. 1/4 sdt kaldu bubuk\n" +
"9. garam secukupnya"
+ "\n CARA PEMBUATAN \n"
+ "1. Rebus mie kuning sampai matang dengan sedikit minyak. Tiriskan\n" +
"2. Tumis bawang sampai matang dan harum\n" +
"3. Masukkan daun bawang ke dalam tumisan dan tumis sampai layu\n" +
"4. Masukkan lada bubuk, saus cabai, kecap manis dan kaldu bubuk. Aduk-aduk sampai rata\n" +
"5. Masukkan mie kuning dan tuangi dengan air sedikit\n" +
"6. Masak sampai bumbu merata dan air habis\n" +
"7. Mie goreng kecap sudah siap disajikan");
        }else if   (pilihan.getSelectedItem().equals("Ayam Bakar Madu")){
            txtresep.setText("BAHAN \n" +
"1. 10 buah sayap ayam atau 1 ayam utuh\n" +
"2. 3 sdm minyak goreng\n" +
"3. 3 siung bawang putih, parut\n" +
"4. 2 sdm air jeruk nipis/lemon\n" +
"5. 4 sdm saus tomat\n" +
"6. 4 sdm kecap manis\n" +
"7. 150 ml madu\n" +
"8. 1 sdt merica hitam butiran, memarkan agak halus\n" +
"9. 1 sdt garam\n"
+ "\n CARA PEMBUATAN \n"
+ "1. Potong masing-masing sayap ayam menjadi dua, buang ujungnya yang runcing.Jika memakai ayam utuh \npotong menjadi 8-12 bagian.\n" +
"2. Taruh bahan-bahan bumbu dalam wadah, aduk hingga benar-benar rata.\n" +
"3. Aduk potongan ayam atau sayap ayam dengan 3/4 bagian bumbu hingga rata. Diamkan selama 1 jam.\n" +
"4. Panaskan panggangan api arang atau oven. Susun ayam berbumbu dalam loyang datar \nPanggang sambil balik-balik hingga daging ayam kaku.\n" +
"5. Di tahap akhir, olesi ayam dengan sisa Bumbu hingga rata.\n" +
"6. Panggang kembali hingga matang dan kering.\n" +
"7. Angkat, sajikan hangat dengan Pelengkapnya.\n");
        }else if   (pilihan.getSelectedItem().equals("Ayam Pedas Manis")){
            txtresep.setText("BAHAN \n" +
"1. 10 buah sayap ayam atau 1 ayam utuh\n" +
"2. 3 sdm minyak goreng\n" +
"3. 3 siung bawang putih, parut\n" +
"4. 2 sdm air jeruk nipis/lemon\n" +
"5. 4 sdm saus tomat\n" +
"6. 4 sdm kecap manis\n" +
"7. 150 ml madu\n" +
"8. 1 sdt merica hitam butiran, memarkan agak halus\n" +
"9. 1 sdt garam\n"
+ "\n CARA PEMBUATAN \n"
+ "1. Potong masing-masing sayap ayam menjadi dua, buang ujungnya yang runcing.Jika memakai ayam utuh \npotong menjadi 8-12 bagian.\n" +
"2. Taruh bahan-bahan bumbu dalam wadah, aduk hingga benar-benar rata.\n" +
"3. Aduk potongan ayam atau sayap ayam dengan 3/4 bagian bumbu hingga rata. Diamkan selama 1 jam.\n" +
"4. Panaskan panggangan api arang atau oven. Susun ayam berbumbu dalam loyang datar \nPanggang sambil balik-balik hingga daging ayam kaku.\n" +
"5. Di tahap akhir, olesi ayam dengan sisa Bumbu hingga rata.\n" +
"6. Panggang kembali hingga matang dan kering.\n" +
"7. Angkat, sajikan hangat dengan Pelengkapnya.\n"
+ "\n CARA PEMBUATAN \n"
+ "1. Potong ayam serong memanjang lalu cuci bersih. Campur jadi 1 bahan marinasi, diamkan 1 jam.\n" +
"2. Campur semua bahan lapisan tepung, balurkan ayam satu persatu ke lapisan tepung. \nGoreng ayam di minyak goreng yang sudah dipanaskan di api kompor sedang sambil dibolak-balik. Lakukan sampai semua ayam habis.\n" +
"3. Tuang secukupnya minyak dan margarin, tumis baceman bawang putih hingga harum, \nmasukkan semua bahan saus juga ayam yang sudah digoreng. Aduk sampai semua ayam terbalur dengan saus.");
        }else if   (pilihan.getSelectedItem().equals("Ayam Goreng")){
            txtresep.setText("BAHAN \n" +
"1. 4 pon ayam yang dipotong menjadi 8 bagian\n" +
"2. 2 cangkir mentega susu\n" +
"3. 1 sendok makan garam\n" +
"4. 2 sendok teh bubuk lada hitam\n" +
"5. 2 sendok makan saus sambal\n" +
"6. 2 cangkir tepung\n" +
"7. 1 sendok teh paprika\n" +
"8. minyak kanola untuk memasak" 
+ "\n CARA PEMBUATAN \n"
+ "1. Campurkan ayam, garam, lada hitam, saus sambal, dan mentega susu ke dalam mangkuk besar. \nSetelah itu, masukkan mangkuk tersebut ke dalam kulkas selama empat jam.\n" +
"2. Ambil mangkuk berukuran sedang untuk mencampurkan tepung dengan paprika. \n" +
"3. Keluarkan ayam dari campuran mentega susu, tambahkan ayam ke dalam tepung. \n" +
"4. Letakkan ayam di loyang dan biarkan selama 30 menit.\n" +
"5. Tuangkan minyak kanola dan panaskan hingga mencapai 365 derajat Fahrenheit \nLalu, goreng ayam yang telah dibumbui ke dalam panci selama 10-12 menit.\n" +
"6.Ayam goreng krispi siap disajikan!\n" );
        }
    }//GEN-LAST:event_pilihbtnActionPerformed

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
     
    }//GEN-LAST:event_pilihanActionPerformed

    private void hapusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbtnActionPerformed
        items.removeElementAt(list.getSelectedIndex());
        list.setModel(items);
        txtresep.setText("");
    }//GEN-LAST:event_hapusbtnActionPerformed

    private void tambahfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahfieldActionPerformed

    private void tambahbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahbtnActionPerformed
       String newRecipe = tambahfield.getText();
    
       if(!newRecipe.isEmpty()){
           items.addElement(newRecipe);
           pilihan.addItem(newRecipe);
           tambahfield.setText("");
       }else if (pilihan.getSelectedItem()!= null){
          
       }
        int result = JOptionPane.showConfirmDialog(this, "Apakah Kamu Yakin Ingin Menambahkan Menu Masakan ini??","Konfimasi",JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(this, "Resep Masakan Telah Ditambahkan!");
    }//GEN-LAST:event_tambahbtnActionPerformed

    private void hapusbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbtn2ActionPerformed
         tambahfield.setText("");
    }//GEN-LAST:event_hapusbtn2ActionPerformed

    private void smpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smpnActionPerformed
        String namaresepterpilih = pilihan.getSelectedItem().toString();
        String detailresep = txtresep.getText();
        simpankefile (namaresepterpilih, detailresep);
        JOptionPane.showMessageDialog(this, "Resep Masakan Telah Disimpan!");
    }//GEN-LAST:event_smpnActionPerformed
 DefaultListModel items = new DefaultListModel();
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResepMasakan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapusbtn;
    private javax.swing.JButton hapusbtn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private javax.swing.JComboBox<String> pilihan;
    private javax.swing.JButton pilihbtn;
    private javax.swing.JButton smpn;
    private javax.swing.JButton tambahbtn;
    private javax.swing.JTextField tambahfield;
    private javax.swing.JTextArea txtresep;
    // End of variables declaration//GEN-END:variables

    private void simpankefile(String namaresep, String detailresep){
        try (BufferedWriter penulis = new BufferedWriter (new FileWriter(namaresep + ".txt"))){
            penulis.write(detailresep);
            penulis.flush();
     } catch (IOException e){
         e.printStackTrace();
     }
        
    }
}
