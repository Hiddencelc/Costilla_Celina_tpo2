package igu;

import javax.swing.JOptionPane;
import logica.Controladora;

public class AltaMascota extends javax.swing.JFrame {

    //declaro una instancia de mi controlador de la logica
    
    Controladora control;

    //modifico mi constructor para que reciba como parametro un controlador y le asigno la instancia creada
    
    public AltaMascota(Controladora control) {
        initComponents();
        this.control = control;
        generarCliente(); // inicio mi texfield NroCliente con el método generado

    }
    
    //metodo para generar de forma automática el NroCliente y setearlo directactamente al texField NroCliente

    void generarCliente() {
        Integer cliente = control.generarNroCliente();
        if (cliente == null) {
            txtCliente.setText("0001");
        } else {

            Integer incrementar = cliente;
            incrementar += 1;
            txtCliente.setText("000" + incrementar);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        panelPrincipal = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        panelDatosMascota = new javax.swing.JPanel();
        labelIdCliente = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelRaza = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        panelComboBox = new javax.swing.JPanel();
        cboAlergico = new javax.swing.JComboBox<>();
        labelAlergico = new javax.swing.JLabel();
        labelAtencion = new javax.swing.JLabel();
        cboAtencion = new javax.swing.JComboBox<>();
        panelDuenio = new javax.swing.JPanel();
        labelDuenio = new javax.swing.JLabel();
        txtDuenio = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        labelObservaciones = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        panelImg = new javax.swing.JPanel();
        labelImg = new javax.swing.JLabel();
        panelTitulo = new javax.swing.JPanel();
        panelIcon = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        panelAlta = new javax.swing.JPanel();
        labelAlta = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(204, 204, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatos.setBackground(new java.awt.Color(153, 153, 255));
        panelDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelDatosMascota.setBackground(new java.awt.Color(255, 248, 251));
        panelDatosMascota.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        labelIdCliente.setBackground(new java.awt.Color(255, 248, 251));
        labelIdCliente.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelIdCliente.setForeground(new java.awt.Color(102, 102, 102));
        labelIdCliente.setText("Cliente N°:");
        labelIdCliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        labelNombre.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(102, 102, 102));
        labelNombre.setText("Nombre:");
        labelNombre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        labelRaza.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelRaza.setForeground(new java.awt.Color(102, 102, 102));
        labelRaza.setText("Raza:");
        labelRaza.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        labelColor.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelColor.setForeground(new java.awt.Color(102, 102, 102));
        labelColor.setText("Color:");
        labelColor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(153, 204, 255));
        txtCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));

        txtNombre.setBackground(new java.awt.Color(153, 204, 255));
        txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));

        txtRaza.setBackground(new java.awt.Color(153, 204, 255));
        txtRaza.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 102, 255), new java.awt.Color(0, 102, 255)));

        txtColor.setBackground(new java.awt.Color(153, 204, 255));
        txtColor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });

        javax.swing.GroupLayout panelDatosMascotaLayout = new javax.swing.GroupLayout(panelDatosMascota);
        panelDatosMascota.setLayout(panelDatosMascotaLayout);
        panelDatosMascotaLayout.setHorizontalGroup(
            panelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                        .addComponent(labelIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                        .addComponent(labelRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRaza))
                    .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                        .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosMascotaLayout.setVerticalGroup(
            panelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                        .addComponent(labelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelDatosMascotaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtColor)))
                .addContainerGap())
        );

        panelComboBox.setBackground(new java.awt.Color(255, 248, 251));
        panelComboBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        cboAlergico.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cboAlergico.setForeground(new java.awt.Color(51, 51, 51));
        cboAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        cboAlergico.setBorder(null);

        labelAlergico.setBackground(new java.awt.Color(255, 255, 255));
        labelAlergico.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelAlergico.setForeground(new java.awt.Color(51, 51, 51));
        labelAlergico.setText("Alérgico:");

        labelAtencion.setBackground(new java.awt.Color(255, 255, 255));
        labelAtencion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelAtencion.setForeground(new java.awt.Color(51, 51, 51));
        labelAtencion.setText("Atención Especial:");

        cboAtencion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        cboAtencion.setForeground(new java.awt.Color(51, 51, 51));
        cboAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));
        cboAtencion.setBorder(null);

        javax.swing.GroupLayout panelComboBoxLayout = new javax.swing.GroupLayout(panelComboBox);
        panelComboBox.setLayout(panelComboBoxLayout);
        panelComboBoxLayout.setHorizontalGroup(
            panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComboBoxLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelComboBoxLayout.setVerticalGroup(
            panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComboBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlergico)
                    .addComponent(cboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelDuenio.setBackground(new java.awt.Color(255, 248, 251));
        panelDuenio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        labelDuenio.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelDuenio.setForeground(new java.awt.Color(51, 51, 51));
        labelDuenio.setText("Nombre Dueño:");

        txtDuenio.setBackground(new java.awt.Color(153, 204, 255));
        txtDuenio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));

        txtTelefono.setBackground(new java.awt.Color(153, 204, 255));
        txtTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));

        labelTelefono.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelTelefono.setForeground(new java.awt.Color(51, 51, 51));
        labelTelefono.setText("Cel. Dueño:");

        labelObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        labelObservaciones.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        labelObservaciones.setForeground(new java.awt.Color(51, 51, 51));
        labelObservaciones.setText("Observaciones:");

        txtObservaciones.setBackground(new java.awt.Color(153, 204, 255));
        txtObservaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(51, 102, 255), new java.awt.Color(51, 102, 255)));

        javax.swing.GroupLayout panelDuenioLayout = new javax.swing.GroupLayout(panelDuenio);
        panelDuenio.setLayout(panelDuenioLayout);
        panelDuenioLayout.setHorizontalGroup(
            panelDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDuenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDuenioLayout.createSequentialGroup()
                        .addComponent(labelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDuenioLayout.createSequentialGroup()
                        .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDuenioLayout.createSequentialGroup()
                        .addComponent(labelObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDuenioLayout.setVerticalGroup(
            panelDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDuenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDuenio)
                    .addComponent(txtDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDuenioLayout.createSequentialGroup()
                        .addComponent(labelObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(panelDuenioLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtObservaciones)))
                .addContainerGap())
        );

        btnLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 180, 19));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(51, 51, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDatosMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(panelDatosMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(panelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(panelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 400));

        panelImg.setBackground(new java.awt.Color(255, 255, 255));
        panelImg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/R3.jpg"))); // NOI18N

        javax.swing.GroupLayout panelImgLayout = new javax.swing.GroupLayout(panelImg);
        panelImg.setLayout(panelImgLayout);
        panelImgLayout.setHorizontalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelImgLayout.setVerticalGroup(
            panelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, Short.MAX_VALUE)
        );

        panelPrincipal.add(panelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 400, 400));

        panelTitulo.setBackground(new java.awt.Color(153, 153, 255));

        panelIcon.setBackground(new java.awt.Color(255, 255, 255));

        labelIcon.setBackground(new java.awt.Color(255, 255, 255));
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png"))); // NOI18N

        javax.swing.GroupLayout panelIconLayout = new javax.swing.GroupLayout(panelIcon);
        panelIcon.setLayout(panelIconLayout);
        panelIconLayout.setHorizontalGroup(
            panelIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelIconLayout.setVerticalGroup(
            panelIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtTitulo.setEditable(false);
        txtTitulo.setBackground(new java.awt.Color(255, 248, 251));
        txtTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(51, 51, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitulo.setText("PELUQUERIA CANINA");
        txtTitulo.setBorder(null);

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTitulo)
                    .addComponent(panelIcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 560, 50));

        panelAlta.setBackground(new java.awt.Color(255, 255, 255));
        panelAlta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelAlta.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        labelAlta.setForeground(new java.awt.Color(0, 102, 102));
        labelAlta.setText("Formulario de Alta:");

        javax.swing.GroupLayout panelAltaLayout = new javax.swing.GroupLayout(panelAlta);
        panelAlta.setLayout(panelAltaLayout);
        panelAltaLayout.setHorizontalGroup(
            panelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAltaLayout.setVerticalGroup(
            panelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipal.add(panelAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         
        
            
        //limpiamos el formulario usando el metodo setText y pasando parametros vacios.
        txtNombre.setText("");
        txtRaza.setText("");
        txtColor.setText("");

        // en los comboBox seleccionamos el index 0 que mostrara el -
        cboAlergico.setSelectedIndex(0);
        cboAtencion.setSelectedIndex(0);

        //limpiamos el formulario usando el metodo setText y pasando parametros vacios.
        txtDuenio.setText("");
        txtObservaciones.setText("");
        txtTelefono.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //declaramos variables para guardar la seleccion del usuario en cada campo usando el metodo getText
        
        Integer cliente = Integer.parseInt(txtCliente.getText()); // parseo el String ya que el contructor mascota recibe un Integer
       
        String nombre = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();

        String alergico = cboAlergico.getSelectedItem().toString();
        String atencion = cboAtencion.getSelectedItem().toString();

        String duenio = txtDuenio.getText();
        String obs = txtObservaciones.getText();
        String telefono = txtTelefono.getText();

        //valido que los campos requeridos/obligatorios estén llenos,sino lanzo un mje de error, caso contrario
        //llamo al metodo crear mascota de mi controladora y le paso los parámetros validados. También lanzo mje de ok
      
        if (nombre.isEmpty() || raza.isEmpty()|| alergico.isEmpty()||alergico.contains("-")|| atencion.isEmpty()
                || duenio.isEmpty() ||telefono.isEmpty()){

            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.\nSólo el campo observaciones puede quedar vacío", "CAMPOS REQUERIDOS", 0);
        } else {

            control.crearMascota(cliente, nombre, raza, color, alergico, atencion, duenio, telefono, obs);
            JOptionPane.showMessageDialog(this, "Datos guardados con éxito.", "INGRESO DE DATOS CORRECTOS", 1);
          
         // solo si guardamos el formulario, el numero de cliente aparece directamente.
        
            generarCliente();
           
        }
        
        


    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboAlergico;
    private javax.swing.JComboBox<String> cboAtencion;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel labelAlergico;
    private javax.swing.JLabel labelAlta;
    private javax.swing.JLabel labelAtencion;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelDuenio;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelIdCliente;
    private javax.swing.JLabel labelImg;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JPanel panelAlta;
    private javax.swing.JPanel panelComboBox;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatosMascota;
    private javax.swing.JPanel panelDuenio;
    private javax.swing.JPanel panelIcon;
    private javax.swing.JPanel panelImg;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDuenio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
