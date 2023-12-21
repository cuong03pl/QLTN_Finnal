/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDien;
import javax.swing.table.DefaultTableModel;
import DuLieuHeThong.Lop;
import DuLieuHeThong.SinhVien;
import Source.ChiTiet.DataSingleton;
import Source.ChiTiet.TableTrangChu;
import hocswing_b1.DangNhap;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Date;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import static org.apache.poi.ss.usermodel.CellType.BLANK;
import static org.apache.poi.ss.usermodel.CellType.BOOLEAN;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
/**
 *
 * @author HP
 */
public class TrangChuSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameDAD
     */
    public TrangChuSinhVien(String MaSV) {
        initComponents();
        if(listLop.isEmpty()){
            fakeData();
        }
        loadTableTrangChu(MaSV);
        myInit();
        clickdetail(MaSV);
        
    }
    public TrangChuSinhVien() {
        
    }
    ArrayList<SinhVien> listTatCaSinhVien = new ArrayList<>();
    
    DataSingleton dataSingleton = DataSingleton.getInstance();
     ArrayList<Lop> listLop = dataSingleton.getDanhSachLop();


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JButton();
        LaBel_QLTN = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        Reload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLopTrucNhat = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang Chủ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));

        btnTrangChu.setBackground(new java.awt.Color(0, 102, 51));
        javax.swing.ImageIcon originalIcon  = new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/logo-haui.png"));
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        btnTrangChu.setIcon(resizedIcon);
        btnTrangChu.setBorder(null);
        btnTrangChu.setFocusable(false);
        btnTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTrangChu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrangChu.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTrangChu.setMaximumSize(new java.awt.Dimension(40, 40));
        btnTrangChu.setMinimumSize(new java.awt.Dimension(40, 40));
        btnTrangChu.setRolloverEnabled(false);
        btnTrangChu.setVerifyInputWhenFocusTarget(false);
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        LaBel_QLTN.setBackground(new java.awt.Color(0, 135, 102));
        LaBel_QLTN.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LaBel_QLTN.setForeground(new java.awt.Color(255, 255, 255));
        LaBel_QLTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LaBel_QLTN.setText("Quản lý trực nhật sinh viên HAUI");
        LaBel_QLTN.setToolTipText("");
        LaBel_QLTN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LaBel_QLTN, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LaBel_QLTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(255, 204, 0));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        Reload.setText("Reload");
        Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Reload)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Reload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tblLopTrucNhat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblLopTrucNhat);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DANH SÁCH LỚP HỌC");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        btnDangXuat.setBackground(new java.awt.Color(0, 153, 255));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setToolTipText("");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // lấy ra các lớp của sinh viên đã đăng nhập
    public void loadTableTrangChu(String MaSV) {
        ArrayList<Lop> newList = new ArrayList<Lop>();
        for (Lop lop : listLop) {
            for (SinhVien sinhVien : lop.getListSV()) {
                if(sinhVien.getMaSV().equals(MaSV)){
                    newList.add(lop);
                }
            }
        }
        tblLopTrucNhat.setModel(new TableTrangChu(newList));
    }


    private static String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return null;
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                // Convert giá trị số sang chuỗi
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case BLANK:
                return "";
            default:
                return null;
        }
    }

    boolean readExcelFile(String filePath, int numSheet, String maLop) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            // Lấy sheet đầu tiên từ workbook
            Sheet sheet = workbook.getSheetAt(numSheet);
            // Bỏ qua dòng tiêu đề
            int startRow = sheet.getFirstRowNum() + 1;
            // Lặp qua từng hàng và thêm thông tin vào danh sách
            for (int rowIndex = startRow; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                System.out.println(rowIndex);
                if (row != null) {
                    // Đọc thông tin từ cột 0 và cột 1
                    Cell cellMaSV = row.getCell(0);
                   
                    Cell cellHoTen = row.getCell(1);

                    // Kiểm tra kiểu dữ liệu trước khi đọc giá trị
                    String maSV;
                    //dinh dạng lại mã sinh viên do quá lớn 
                      DecimalFormat decimalFormat = new DecimalFormat("#");
                    maSV = decimalFormat.format(cellMaSV.getNumericCellValue());
                    System.out.println(maSV);
                    String hoTen = getCellValueAsString(cellHoTen);
                    System.out.println(hoTen);
                    // Kiểm tra giá trị trước khi thêm vào danh sách
                    if (maSV != null && hoTen != null) {
                        ArrayList<String> listMaLop = new ArrayList<>();
                        listMaLop.add(maLop);
                        SinhVien newSV = new SinhVien(maSV, hoTen, listMaLop);
                        if (listTatCaSinhVien.contains(newSV)) {
//                            listTatCaSinhVien.get(listTatCaSinhVien.indexOf(newSV)).addMaLop(txtMaLop.getText());
                        } else {
                            newSV.setListMaLop(listMaLop);
                            listTatCaSinhVien.add(newSV);
                        }
                    }
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(TrangChuSinhVien.this, "Kiểm tra lại đường dẫn file!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    void fakeData() {
        
        readExcelFile("data_test\\fake_dslop.xlsx", 0, "IT001");
        ArrayList<SinhVien> listSvCuaLop1 = new ArrayList<>();
        for (SinhVien sv : listTatCaSinhVien) {
            if (sv.getListMaLop().contains("IT001")) {
                listSvCuaLop1.add(sv);
            }
        }
        readExcelFile("data_test\\fake_dslop.xlsx", 1, "IT002");
        ArrayList<SinhVien> listSvCuaLop2 = new ArrayList<>();
        for (SinhVien sv : listTatCaSinhVien) {
            if (sv.getListMaLop().contains("IT002")) {
                listSvCuaLop2.add(sv);
            }
        }
        readExcelFile("data_test\\fake_dslop.xlsx", 3, "IT003");
        ArrayList<SinhVien> listSvCuaLop3 = new ArrayList<>();
        for (SinhVien sv : listTatCaSinhVien) {
            if (sv.getListMaLop().contains("IT003")) {
                listSvCuaLop3.add(sv);
            }
        }
        try {
            // Tạo đối tượng SimpleDateFormat với định dạng ngày tháng mong muốn
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            // Chuyển đổi chuỗi thành đối tượng Date
            Date ngayBatDau1 = sdf.parse("1-1-2019");
            Date ngayKetThuc1 = sdf.parse("1-4-2019");
            Date ngayBatDau2 = sdf.parse("1-5-20120");
            Date ngayKetThuc2 = sdf.parse("1-7-2020");
            Date ngayBatDau3 = sdf.parse("1-8-20121");
            Date ngayKetThuc3 = sdf.parse("1-10-2021");
            Lop newLop3 = new Lop("IT003", "Đồ họa máy tính", ngayBatDau3, ngayKetThuc3, 12, listSvCuaLop3);
            Lop newLop = new Lop("IT001", "Lập Trình Java", ngayBatDau1, ngayKetThuc1, 10, listSvCuaLop1);
            Lop newLop2 = new Lop("IT002", "Lập Trình .Net", ngayBatDau2, ngayKetThuc2, 9, listSvCuaLop2);
            listLop.add(newLop);
            listLop.add(newLop2);
            listLop.add(newLop3);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
        
    }

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        DangNhap a = new DangNhap();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String TimKiem = txtTimKiem.getText().toString().toLowerCase();
        if (TimKiem.isEmpty() == false) {
            String regex = ".*" + Pattern.quote(TimKiem) + ".*";
            ArrayList<Lop> searchedLop = new ArrayList<>();
            for (Lop lop : listLop) {
                if(lop.getMaLop().toLowerCase().equals(TimKiem))
                        searchedLop.add(lop);
            }
            
            if (searchedLop.size()==0) {
                for (Lop lop : listLop) {
                    if(lop.getTenLop().toLowerCase().equals(TimKiem))
                        searchedLop.add(lop);
                }
            }
            DefaultTableModel newModel = new DefaultTableModel();
            tblLopTrucNhat.setModel(newModel);
            tblLopTrucNhat.setModel(new TableTrangChu(searchedLop));
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReloadActionPerformed
        // TODO add your handling code here:
            DefaultTableModel newModel = new DefaultTableModel();
                tblLopTrucNhat.setModel(newModel);
                loadTableTrangChu(null);
    }//GEN-LAST:event_ReloadActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed
    void myInit() {
        tblLopTrucNhat.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && tblLopTrucNhat.getSelectedRow() != -1) {
                    int selectedRow = tblLopTrucNhat.getSelectedRow();
                    
                }
            }
        });
    }
    
        public void clickdetail(String MaSV){
            tblLopTrucNhat.addMouseListener(new MouseAdapter() {
           
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int selectedRow = tblLopTrucNhat.getSelectedRow();
                    String classID = (String) tblLopTrucNhat.getValueAt(selectedRow, 0);

                   
                    showClassDetail(classID,selectedRow, MaSV); // mở trang detail
                    dispose();//dong trang cũ
                }
            }
        });
    }
    public void showClassDetail(String classID,int selectedRow, String MaSV) {
        // Gọi lại interface để chuyển sang JFrame chi tiết
        ChiTietQLTNSinhVien detailFrame = new ChiTietQLTNSinhVien(classID,selectedRow, this, MaSV);
        detailFrame.setVisible(true);
    }
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
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame trangChu = new TrangChuSinhVien();

                trangChu.setVisible(true);
                trangChu.getContentPane().setBackground(Color.white);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LaBel_QLTN;
    private javax.swing.JButton Reload;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLopTrucNhat;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
