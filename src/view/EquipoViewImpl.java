package vista;

import modelo.Equipo;
import modelo.EquipoModel;
import controlador.EquipoController;

/**
 *
 * @author Rafa
 */
public class EquipoViewImpl extends javax.swing.JFrame implements EquipoView {

    private EquipoController controller;

    private EquiposTableModel tableModel;
    private JPanelEquipo panelEquipo;
    private EquipoModel model;
    private GrupoCompleto grupoCompleto;

    /**
     * Creates new form VentanaPrincipal
     */
    public EquipoViewImpl() {
        tableModel = new EquiposTableModel();
        initComponents();

        this.panelEquipo = new JPanelEquipo(this);
        this.jPanelDown.add(this.panelEquipo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanelDown = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEquipos = new javax.swing.JTable();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UEFA Champions League");

        jPanelDown.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelDown.setLayout(new javax.swing.BoxLayout(jPanelDown, javax.swing.BoxLayout.LINE_AXIS));

        jTableEquipos.setModel(tableModel);
        jTableEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEquipos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelDown, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelDown, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Con este evento controlamos que hemos clicados en una fila de la tabla
    private void jTableEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEquiposMouseClicked
        // TODO add your handling code here:
        EquiposTableModel ctm = (EquiposTableModel) this.jTableEquipos.getModel();
        Equipo equipo = ctm.getRow(this.jTableEquipos.getSelectedRow());

        panelEquipo.setEquipo(equipo);
    }//GEN-LAST:event_jTableEquiposMouseClicked

    /**
     * @param args the command line arguments Main por defecto que no usaremos
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquipoViewImpl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanelDown;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEquipos;
    // End of variables declaration//GEN-END:variables

    public EquipoController getController() {
        return controller;
    }

    public void setController(EquipoController controller) {
        this.controller = controller;
    }

    public void dataModelChanged() {
        refresh();
    }

    public void display() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
                refresh();
            }
        });
    }

    protected void refresh() {

        //tableModel.setEquipos(...);
    }

    protected void fireNuevoContactoGesture(String nombre, String pais, String pos_grupo, String grupo) {
        if(grupo.length() < 2){
            getController().nuevoEquipoGesture(nombre, pais, pos_grupo, grupo);
        }
        else 
            this.grupoCompleto = new GrupoCompleto(this);
            
    }

    protected void fireActualizaEquipoGesture(String nombre, String pais, String pos_grupo, String grupo) {
        getController().actualizaEquipoGesture(nombre, pais, pos_grupo, grupo);
    }

    protected void fireBorraEquipoGesture(String nombre) {
        getController().borraEquipoGesture(nombre);
    }

    @Override
    public EquipoModel getModel() {
        return model;
    }

    @Override
    public void setModel(EquipoModel model) {
        this.model = model;
    }

}
