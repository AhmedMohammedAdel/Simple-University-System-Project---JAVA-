/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InstructorJFrames;

import GeneralJframes.Login_instructor;
import GeneralJframes.Welcome_Page;
import com.mycompany.universityproject.arrays;
import com.mycompany.universityproject.course;
import com.mycompany.universityproject.department;
import com.mycompany.universityproject.instructor;
import com.mycompany.universityproject.student;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class ABOUT extends javax.swing.JFrame {

    /**
     * Creates new form courses
     */
    public ABOUT() {
        initComponents();
                initComponents();   
            setBackground(new Color(0, 0, 0, 0));
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
        jPanel8 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        fac5 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        fac6 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        fac4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        fac2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        fac3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        back = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(31, 34, 46));
        jPanel8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel8MouseMoved(evt);
            }
        });
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\homeic.png")); // NOI18N

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 480, 80));

        jPanel19.setBackground(new java.awt.Color(204, 0, 51));
        jPanel19.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel19MouseMoved(evt);
            }
        });
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Log out");

        jLabel47.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\couric.png")); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 950, 480, 70));

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));
        jPanel18.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel18MouseMoved(evt);
            }
        });
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\info.png")); // NOI18N

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("about");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 480, 80));

        user.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                userAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\insic.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\360.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 1110));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\341.png")); // NOI18N
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -210, -1, 700));

        jLabel54.setBackground(new java.awt.Color(204, 0, 153));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 255, 0));
        jLabel54.setText("EN Y.");
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 230, 70));

        fac5.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        fac5.setForeground(new java.awt.Color(255, 255, 255));
        fac5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fac5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel7.add(fac5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 240, 90));

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\Untitled-2.png")); // NOI18N
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\block-fac-2.png")); // NOI18N
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 600, 390, 280));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\326.png")); // NOI18N
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel55.setBackground(new java.awt.Color(204, 0, 153));
        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 51, 102));
        jLabel55.setText("SALA.");
        jPanel9.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 60, 70));

        fac6.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        fac6.setForeground(new java.awt.Color(255, 255, 255));
        fac6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fac6AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel9.add(fac6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 220, 100));

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\Untitled-2.png")); // NOI18N
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\block-fac-2.png")); // NOI18N
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 230, 390, 280));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\336.png")); // NOI18N
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -210, -1, 700));

        jLabel53.setBackground(new java.awt.Color(204, 0, 153));
        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 51, 102));
        jLabel53.setText(" FEES");
        jPanel6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 50, 60));

        fac4.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        fac4.setForeground(new java.awt.Color(255, 255, 255));
        fac4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fac4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel6.add(fac4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 230, 110));

        jLabel28.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\Untitled-2.png")); // NOI18N
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\block-fac-2.png")); // NOI18N
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, 390, 280));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                name1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 240, 80));

        name.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 230, 100));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\341.png")); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -190, -1, 680));

        jLabel50.setBackground(new java.awt.Color(204, 0, 153));
        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 255, 0));
        jLabel50.setText("Name");
        jPanel3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 230, 70));

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\Untitled-2.png")); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\block-fac-2.png")); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 390, 280));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\341.png")); // NOI18N
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -170, -1, 660));

        jLabel51.setBackground(new java.awt.Color(204, 0, 153));
        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 255, 0));
        jLabel51.setText("USER");
        jPanel4.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 230, 70));

        fac2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fac2.setForeground(new java.awt.Color(255, 255, 255));
        fac2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fac2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(fac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 240, 110));

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\Untitled-2.png")); // NOI18N
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\block-fac-2.png")); // NOI18N
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 390, 280));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\326.png")); // NOI18N
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        jLabel52.setBackground(new java.awt.Color(204, 0, 153));
        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 255, 0));
        jLabel52.setText("ID SET");
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 230, 70));

        fac3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        fac3.setForeground(new java.awt.Color(255, 255, 255));
        fac3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fac3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel5.add(fac3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 240, 90));

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\Untitled-2.png")); // NOI18N
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\block-fac-2.png")); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 230, 390, 280));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmed\\Documents\\NetBeansProjects\\UniversityProject\\src\\main\\java\\images\\BACK.png")); // NOI18N
        jLabel15.setText("jLabel15");
        back.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 1560, 1020));

        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1020));

        setBounds(0, 0, 1920, 1020);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseMoved

        jPanel8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jPanel8MouseMoved

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        new instructorDash().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel19MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseMoved
        jPanel19.setBackground(new Color(153, 0, 0));

        jPanel19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jPanel19MouseMoved

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
        new Welcome_Page().setVisible(true);
        new Login_instructor().setVisible(true);
    }//GEN-LAST:event_jPanel19MouseClicked

    private void jPanel18MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseMoved
    }//GEN-LAST:event_jPanel18MouseMoved

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked

    }//GEN-LAST:event_jPanel18MouseClicked

    private void fac5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fac5AncestorAdded
        String namee = "" + arrays.instructors[Login_instructor.getins()].getEnrolledYear() ; 
        fac5.setText(namee);
    }//GEN-LAST:event_fac5AncestorAdded

    private void fac6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fac6AncestorAdded
        String namee = "" + arrays.instructors[Login_instructor.getins()].getBasicSalary() ;
        fac6.setText(namee);
    }//GEN-LAST:event_fac6AncestorAdded

    private void fac4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fac4AncestorAdded
        String namee = "" + arrays.instructors[Login_instructor.getins()].getTelephone() ; 
        fac4.setText(namee);
    }//GEN-LAST:event_fac4AncestorAdded

    private void name1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_name1AncestorAdded
        String namees = arrays.instructors[Login_instructor.getins()].getLastname() ;
        name1.setText(namees);
    }//GEN-LAST:event_name1AncestorAdded

    private void nameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameAncestorAdded
        String namee = "-" + arrays.instructors[Login_instructor.getins()].getFirstname() ;
        name.setText(namee);

    }//GEN-LAST:event_nameAncestorAdded

    private void fac2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fac2AncestorAdded
        String namee = "" + arrays.instructors[Login_instructor.getins()].getUsername() ;
        fac2.setText(namee);
    }//GEN-LAST:event_fac2AncestorAdded

    private void fac3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fac3AncestorAdded
        String namee = "" + arrays.instructors[Login_instructor.getins()].getId() ;
        fac3.setText(namee);
    }//GEN-LAST:event_fac3AncestorAdded

    private void userAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_userAncestorAdded
        try {
            String userr = arrays.instructors[Login_instructor.getins()].getUsername();
            user.setText(userr);
        } catch (java.lang.NullPointerException sww) {
        }

        /*
        try {
            user () ;
            user.setText(adminstration.admins[m].getUsername());
        } catch ( java.lang.StackOverflowError ss ) {
        }
        */
    }//GEN-LAST:event_userAncestorAdded
    public class AlternateRowRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            if (row % 2 == 0) {
                c.setBackground(new Color(32, 34, 47));
            } else {
                c.setBackground(new Color(0, 0, 0));
            }
            c.setForeground(Color.WHITE);

            return c;
        }
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
            java.util.logging.Logger.getLogger(ABOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABOUT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABOUT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back;
    private javax.swing.JLabel fac2;
    private javax.swing.JLabel fac3;
    private javax.swing.JLabel fac4;
    private javax.swing.JLabel fac5;
    private javax.swing.JLabel fac6;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
