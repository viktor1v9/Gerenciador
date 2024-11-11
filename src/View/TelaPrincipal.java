package View;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.text.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class TelaPrincipal extends javax.swing.JFrame {

    GerenciaAluno objeto = new GerenciaAluno();
    GerenciaProfessor objeto2 = new GerenciaProfessor();
    
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador ");

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Novo Aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Gerenciar Alunos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Novo Professor");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Gerenciar Professores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        jMenu2.setText("Sobre");
        
        jMenuItem6.setText("Créditos");               
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
        	 public void actionPerformed(java.awt.event.ActionEvent evt) {
        		jMenuItem6ActionPerformed(evt);
        	}
        });
        jMenu2.add(jMenuItem6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        CadastroAluno objeto = new CadastroAluno();
        objeto.setVisible(true);
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        
        System.exit(0);
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        objeto.setVisible(true);
        objeto.carregaTabela();
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
       CadastroProfessor objeto = new CadastroProfessor();
       objeto.setVisible(true);
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        GerenciaProfessor objeto = new GerenciaProfessor();
        objeto.setVisible(true);
    }
    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
    	Credits obj = new Credits();
    	
    	JFrame frame = new JFrame();    
    	frame.setSize(500,300);
    	
    	JButton btn = new JButton("Créditos");
    	JButton btn2 = new JButton("Ferramentas utilizadas");
    	
    	JPanel swingPanel = new JPanel();
    	swingPanel.add(btn);
    	swingPanel.add(btn2);
    	
    	frame.add(swingPanel, BorderLayout.NORTH);
    	
    	JFXPanel fxPanel = new JFXPanel();
		frame.add(fxPanel, BorderLayout.CENTER);
		
		btn.addActionListener(e -> {
            Platform.runLater(() -> obj.initTela1(fxPanel));
        });
		
		btn2.addActionListener(e -> {
            Platform.runLater(() -> obj.initTela2(fxPanel));
        });
		
		frame.setVisible(true);
      
    }
    
   

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

   
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    
   
}
