/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu_main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menu_superadmin.MenuUtamaSuperAdmin;

/**
 *
 * @author luthf
 */
public final class Pengembalian extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public Pengembalian() {
        initComponents();
        load_table();
        kosong();
        cbbpinjam();
        disableField();
    }

    String nilaiTanggal;
    double keterlambatanval;

    private void disableField() {
        tanggalPeminjaman.setEnabled(false);
        nis.setEnabled(false);
        nama.setEnabled(false);
        kelas.setEnabled(false);
        judulBuku.setEnabled(false);
        kodeBuku.setEnabled(false);
        jumlahBuku.setEnabled(false);
        keterlambatan.setEnabled(false);
        denda.setEnabled(false);

    }

    private void teangan() {
        Object[] baris = {"Kode Pengembalian", "Tanggal Pengembalian", "Kode Peminjaman", "Tanggal Peminjaman", "NIS", "Nama", "Kelas", "Kode Buku", "Nama Buku", "Jumlah Buku", "Keterlambatan", "Denda"};
        DefaultTableModel tablek = new DefaultTableModel(null, baris);
        tabledor.setModel(tablek);
        String carii = cari.getText();

        try {
            Statement state = handler_class.Koneksi.konek().createStatement();
            String sql = "select * from pengembalian WHERE kode_pengembalian LIKE '%" + carii + "%'OR nama_buku LIKE '%"+carii+"%'";
            ResultSet cari = state.executeQuery(sql);

            while (cari.next()) {
                String a = cari.getString(1);
                String b = cari.getString(2);
                String c = cari.getString(3);
                String d = cari.getString(4);
                String e = cari.getString(5);
                String f = cari.getString(6);
                String g = cari.getString(7);
                String h = cari.getString(8);
                String i = cari.getString(9);
                String j = cari.getString(10);
                String k = cari.getString(11);
                String l = cari.getString(12);
                Object[] data = {a, b, c, d, e, f, g, h, i, j, k, l};
                tablek.addRow(data);
            }
        } catch (Exception e) {
            System.out.println("Data Tidak ada!");
        }
    }

    private void cbbpinjam() {
        kodePeminjaman.removeAllItems();
        kodePeminjaman.addItem("~Pilih~");
        try {
            String Sql = "SELECT*FROM peminjaman";
            Statement st = handler_class.Koneksi.konek().createStatement();
            ResultSet pinjam = st.executeQuery(Sql);
            while (pinjam.next()) {
                String AliasKode = pinjam.getString("kode_peminjaman");
                kodePeminjaman.addItem(AliasKode);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Gagal Menampilkan Data\n" + e.getMessage());
        }
    }

    protected void load_table() {
        Object[] baris = {"Kode Pengembalian", "Tanggal Pengembalian", "Kode Peminjaman", "Tanggal Peminjaman", "Nis", "Nama", "Kelas", "Kode Buku", "Nama Buku", "Jumlah Buku", "Keterlambatan", "Denda"};
        DefaultTableModel tablek = new DefaultTableModel(null, baris);
        tabledor.setModel(tablek);

        try {
            Statement state = handler_class.Koneksi.konek().createStatement();
            String sql = "select * from pengembalian ";
            ResultSet cari = state.executeQuery(sql);

            while (cari.next()) {
                String a = cari.getString(1);
                String b = cari.getString(2);
                String c = cari.getString(3);
                String d = cari.getString(4);
                String e = cari.getString(5);
                String f = cari.getString(6);
                String g = cari.getString(7);
                String h = cari.getString(8);
                String i = cari.getString(9);
                String j = cari.getString(10);
                String k = cari.getString(11);
                String l = cari.getString(12);
                Object[] data = {a, b, c, d, e, f, g, h, i, j, k, l};
                tablek.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    private void tanggal() {
        Date date = tanggalPengembalian.getDate();

        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Format "tahun-bulan-tanggal"
            nilaiTanggal = dateFormat.format(date);
            System.out.println(nilaiTanggal);
        } else {
            nilaiTanggal = "0000-00-00";
        }

    }

    private void kosong() {
        kodePengembalian.setText("");
        tanggalPengembalian.setDate(null);
        kodePeminjaman.setSelectedItem("~Pilih Kode Peminjaman~");
        tanggalPeminjaman.setText("");
        nis.setText("NIS");
        nama.setText("Nama");
        kelas.setText("Kelas");
        kodeBuku.setText("Kode Buku");
        judulBuku.setText("Judul Buku");
        jumlahBuku.setText("Jumlah Buku");
        keterlambatan.setText("Keterlambatan");
        denda.setText("Denda");
        tanggalPeminjaman.setText("Tanggal Peminjaman (YYYY-MM-DD)");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kodePengembalian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledor = new javax.swing.JTable();
        cari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        tanggalPeminjaman = new javax.swing.JTextField();
        kodeBuku = new javax.swing.JTextField();
        judulBuku = new javax.swing.JTextField();
        keterlambatan = new javax.swing.JTextField();
        jumlahBuku = new javax.swing.JTextField();
        kodePeminjaman = new javax.swing.JComboBox<>();
        nis = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        denda = new javax.swing.JTextField();
        tanggalPengembalian = new com.toedter.calendar.JDateChooser();
        btnHitungDenda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Pengembalian Buku");

        kodePengembalian.setBackground(new java.awt.Color(208, 239, 239));
        kodePengembalian.setForeground(new java.awt.Color(153, 153, 153));
        kodePengembalian.setText("Kode Pengembalian");

        tabledor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Pengembalian", "Tgl Pengembalian", "Kode Peminjaman", "Tgl Peminjaman", "NIS", "Nama", "Kelas", "Kode Buku", "Nama Buku", "Jumlah Buku", "Keterlambatan", "Denda"
            }
        ));
        tabledor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabledor);

        cari.setForeground(new java.awt.Color(153, 153, 153));

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(0, 0, 0));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 0, 0));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBersih.setBackground(new java.awt.Color(0, 0, 0));
        btnBersih.setForeground(new java.awt.Color(255, 255, 255));
        btnBersih.setText("Bersihkan Form");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(0, 0, 0));
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        tanggalPeminjaman.setBackground(new java.awt.Color(208, 239, 239));
        tanggalPeminjaman.setForeground(new java.awt.Color(153, 153, 153));
        tanggalPeminjaman.setText("Tanggal Peminjaman (YYYY-MM-DD)");
        tanggalPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalPeminjamanActionPerformed(evt);
            }
        });

        kodeBuku.setBackground(new java.awt.Color(208, 239, 239));
        kodeBuku.setForeground(new java.awt.Color(153, 153, 153));
        kodeBuku.setText("Kode Buku");
        kodeBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeBukuActionPerformed(evt);
            }
        });

        judulBuku.setBackground(new java.awt.Color(208, 239, 239));
        judulBuku.setForeground(new java.awt.Color(153, 153, 153));
        judulBuku.setText("Judul Buku");

        keterlambatan.setBackground(new java.awt.Color(208, 239, 239));
        keterlambatan.setForeground(new java.awt.Color(153, 153, 153));
        keterlambatan.setText("Keterlambatan");
        keterlambatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keterlambatanActionPerformed(evt);
            }
        });

        jumlahBuku.setBackground(new java.awt.Color(208, 239, 239));
        jumlahBuku.setForeground(new java.awt.Color(153, 153, 153));
        jumlahBuku.setText("Jumlah Buku");
        jumlahBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahBukuActionPerformed(evt);
            }
        });

        kodePeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodePeminjamanActionPerformed(evt);
            }
        });

        nis.setBackground(new java.awt.Color(208, 239, 239));
        nis.setForeground(new java.awt.Color(153, 153, 153));
        nis.setText("NIS");
        nis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nisActionPerformed(evt);
            }
        });

        kelas.setBackground(new java.awt.Color(208, 239, 239));
        kelas.setForeground(new java.awt.Color(153, 153, 153));
        kelas.setText("Kelas");
        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });

        nama.setBackground(new java.awt.Color(208, 239, 239));
        nama.setForeground(new java.awt.Color(153, 153, 153));
        nama.setText("Nama");
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        denda.setBackground(new java.awt.Color(208, 239, 239));
        denda.setForeground(new java.awt.Color(153, 153, 153));
        denda.setText("Denda");
        denda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dendaActionPerformed(evt);
            }
        });

        btnHitungDenda.setText("Hitung Denda");
        btnHitungDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungDendaActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Hitung Denda Keterlambatan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("Tanggal Pengembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addGap(24, 24, 24)
                        .addComponent(btnBersih)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodePeminjaman, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kodePengembalian, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tanggalPeminjaman, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(nis, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tanggalPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(judulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHitungDenda))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jumlahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(keterlambatan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kodePengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanggalPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keterlambatan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kodePeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(denda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitungDenda))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jumlahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSimpan)
                        .addComponent(jButton3)
                        .addComponent(btnBersih)
                        .addComponent(btnKeluar))
                    .addComponent(btnEdit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keterlambatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keterlambatanActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_keterlambatanActionPerformed

    private void jumlahBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahBukuActionPerformed

    private void kodeBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeBukuActionPerformed

    private void nisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nisActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void dendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dendaActionPerformed

    private void kodePeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodePeminjamanActionPerformed
        // TODO add your handling code here:
        try {
            String Sql = "select * from peminjaman where kode_peminjaman='" + kodePeminjaman.getSelectedItem() + "'";
            Statement state = handler_class.Koneksi.konek().createStatement();
            ResultSet pinjam = state.executeQuery(Sql);
            while (pinjam.next()) {
                tanggalPeminjaman.setText(pinjam.getString("tanggal_pinjam"));
                nis.setText(pinjam.getString("nis"));
                nama.setText(pinjam.getString("nama"));
                kelas.setText(pinjam.getString("kelas"));
                kodeBuku.setText(pinjam.getString("kode_buku"));
                judulBuku.setText(pinjam.getString("judul_buku"));
                jumlahBuku.setText(pinjam.getString("jumlah_buku"));
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_kodePeminjamanActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        tanggal();
        try {
            Connection connection = handler_class.Koneksi.konek();
            Statement state = connection.createStatement();

            // Ambil jumlah_buku yang sedang dipinjam dari tabel buku
            ResultSet rs = state.executeQuery("SELECT jumlah_buku FROM buku WHERE kode_buku = '" + kodeBuku.getText() + "'");
            int jumlahBukuSekarang = 0;
            if (rs.next()) {
                jumlahBukuSekarang = rs.getInt("jumlah_buku");
            }

            // Hitung jumlah buku yang akan dikembalikan
            int jumlahBukuKembali = Integer.parseInt(jumlahBuku.getText());

            // Update jumlah buku yang tersedia di tabel buku
            int jumlahBukuTerbaru = jumlahBukuSekarang + jumlahBukuKembali;
            String updateBukuSQL = "UPDATE buku SET jumlah_buku = " + jumlahBukuTerbaru + " WHERE kode_buku = '" + kodeBuku.getText() + "'";
            state.executeUpdate(updateBukuSQL);

            // Insert data ke tabel pengembalian
            String sql = "INSERT INTO pengembalian VALUES ('" + kodePengembalian.getText() + "','" + nilaiTanggal + "','" + kodePeminjaman.getSelectedItem().toString() + "','" + tanggalPeminjaman.getText() + "','" + nis.getText() + "','" + nama.getText() + "','" + kelas.getText() + "','" + kodeBuku.getText() + "','" + judulBuku.getText() + "','" + jumlahBuku.getText() + "','" + keterlambatan.getText() + "','" + denda.getText() + "')";
            state.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Tersimpan" + e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        tanggal();
        try {
            Statement state = handler_class.Koneksi.konek().createStatement();
            String sql = "update pengembalian set tanggal_pengembalian='" + nilaiTanggal + "',kode_peminjaman='" + kodePeminjaman.getSelectedItem().toString() + "',tanggal_pinjam='" + tanggalPeminjaman.getText() + "',nis='" + nis.getText() + "',nama='" + nama.getText() + "',kelas='" + kelas.getText() + "',kode_buku='" + kodeBuku.getText() + "',nama_buku='" + judulBuku.getText() + "',jumlah_buku='" + jumlahBuku.getText() + "',keterlambatan='" + keterlambatan.getText() + "',denda='" + denda.getText() + "' where kode_pengembalian='" + kodePengembalian.getText() + "'";
            state.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Di Edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Di Edit" + e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        String userLevel = LoginPanel.userLevel;
        System.out.println(userLevel);
        if ("superadmin".equals(userLevel)) {
            new MenuUtamaSuperAdmin().show();
            dispose();
        } else {
            new MenuUtama().show();
            dispose();
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btnBersihActionPerformed

    private void tanggalPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalPeminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalPeminjamanActionPerformed

    private void tabledorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledorMouseClicked
        // TODO add your handling code here:
        int baris = tabledor.rowAtPoint(evt.getPoint());
        String a = tabledor.getValueAt(baris, 0).toString();
        kodePengembalian.setText(a);
        String b = tabledor.getValueAt(baris, 1).toString();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(b);
            tanggalPengembalian.setDate(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Format tanggal tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
        String c = tabledor.getValueAt(baris, 2).toString();
        kodePeminjaman.setSelectedItem(c);
        String d = tabledor.getValueAt(baris, 3).toString();
        tanggalPeminjaman.setText(d);
        String e = tabledor.getValueAt(baris, 4).toString();
        nis.setText(e);
        String f = tabledor.getValueAt(baris, 5).toString();
        nama.setText(f);
        String g = tabledor.getValueAt(baris, 6).toString();
        kelas.setText(g);
        String h = tabledor.getValueAt(baris, 7).toString();
        kodeBuku.setText(h);
        String i = tabledor.getValueAt(baris, 8).toString();
        judulBuku.setText(i);
        String j = tabledor.getValueAt(baris, 9).toString();
        jumlahBuku.setText(j);
        String k = tabledor.getValueAt(baris, 10).toString();
        keterlambatan.setText(k);
        String l = tabledor.getValueAt(baris, 11).toString();
        denda.setText(l);
    }//GEN-LAST:event_tabledorMouseClicked

    private void btnHitungDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungDendaActionPerformed
        // TODO add your handling code here:
        tanggal(); // Pastikan nilai tanggalPeminjaman dan tanggalPengembalian telah diatur sebelum digunakan.

// Ambil tanggal peminjaman dan tanggal pengembalian dari komponen UI
        String tanggalPeminjamanStr = tanggalPeminjaman.getText();
        Date tanggalPengembalianDate = tanggalPengembalian.getDate();

// Format tanggal menggunakan SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Parsing tanggal peminjaman
            Date tanggalPeminjamanDate = dateFormat.parse(tanggalPeminjamanStr);

            // Hitung selisih hari antara tanggal peminjaman dan tanggal kembali
            long selisihMillis = tanggalPengembalianDate.getTime() - tanggalPeminjamanDate.getTime();
            long selisihHari = selisihMillis / (24 * 60 * 60 * 1000);

            // Cek apakah selisih hari lebih dari 30
            long keterlambatanval = Math.max(0, selisihHari - 30);
            double dendaval = keterlambatanval * 5000;

            // Set nilai keterlambatan ke komponen UI (keterlambatan)
            keterlambatan.setText(String.valueOf(keterlambatanval));
            denda.setText(String.valueOf(dendaval));
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Format tanggal tidak valid");
        }


    }//GEN-LAST:event_btnHitungDendaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // TODO add your handling code here:
        try {
            Connection connection = handler_class.Koneksi.konek();
            Statement state = connection.createStatement();

            // Ambil data jumlah_buku yang dikembalikan dari tabel pengembalian
            ResultSet rs = state.executeQuery("SELECT jumlah_buku, kode_buku FROM pengembalian WHERE kode_pengembalian = '" + kodePengembalian.getText() + "'");
            int jumlahBukuKembali = 0;
            String kodeBuku = "";
            if (rs.next()) {
                jumlahBukuKembali = rs.getInt("jumlah_buku");
                kodeBuku = rs.getString("kode_buku");
            }

            // Ambil jumlah_buku yang tersedia di tabel buku
            rs = state.executeQuery("SELECT jumlah_buku FROM buku WHERE kode_buku = '" + kodeBuku + "'");
            int jumlahBukuSekarang = 0;
            if (rs.next()) {
                jumlahBukuSekarang = rs.getInt("jumlah_buku");
            }

            // Update jumlah buku yang tersedia di tabel buku
            int jumlahBukuTerbaru = jumlahBukuSekarang - jumlahBukuKembali;
            String updateBukuSQL = "UPDATE buku SET jumlah_buku = " + jumlahBukuTerbaru + " WHERE kode_buku = '" + kodeBuku + "'";
            state.executeUpdate(updateBukuSQL);

            // Hapus data dari tabel pengembalian
            String sql = "DELETE FROM pengembalian WHERE kode_pengembalian = '" + kodePengembalian.getText() + "'";
            state.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
        load_table();
        kosong();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        teangan();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHitungDenda;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField denda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judulBuku;
    private javax.swing.JTextField jumlahBuku;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField keterlambatan;
    private javax.swing.JTextField kodeBuku;
    private javax.swing.JComboBox<String> kodePeminjaman;
    private javax.swing.JTextField kodePengembalian;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nis;
    private javax.swing.JTable tabledor;
    private javax.swing.JTextField tanggalPeminjaman;
    private com.toedter.calendar.JDateChooser tanggalPengembalian;
    // End of variables declaration//GEN-END:variables
}
