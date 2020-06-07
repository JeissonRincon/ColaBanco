package banco.Vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jeisson
 */
public class VistaPrincipal extends JFrame{
    
    
    private JPanel pPrincipal;
    private JLabel lNumClientes;
    private JTextField tClientes,tCola,tAtendidos;
    private JButton bIniciar,bAtender,bEntrar;
    
    private ServiciosGraficos servicios;
    
        public VistaPrincipal(){
            
            
         servicios = ServiciosGraficos.getService();
         this.crearPaneles();
         this.crearTextField();
         this.crearBotones();
            
        this.setTitle("Vista Principal");
        setSize(1200,700);
        this.setLocationRelativeTo(this);       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setVisible(true);
        }
        
   public void crearPaneles(){
       pPrincipal = servicios.construirJPanel(0, 0, 1200, 700,
               Color.orange, null);
       this.add(pPrincipal);
       
   }
   
   public void crearTextField(){
        tClientes = servicios.construirJTextField(" ", 50, 10, 40, 40, 
                Color.WHITE, Color.BLACK, Color.BLUE, null, null, "c");
        pPrincipal.add(tClientes);
        
        tCola = servicios.construirJTextField(" ", 10, 60, 500, 500,
                Color.WHITE, Color.BLACK, Color.BLUE, null, null, "c");
        pPrincipal.add(tCola);
                
        tAtendidos = servicios.construirJTextField(" ", 520, 60, 500, 500, 
                Color.WHITE, Color.BLACK, Color.BLUE, null, null, "c");
        pPrincipal.add(tAtendidos);
   
   }
   
   public void crearBotones(){
       
       bIniciar = servicios.construirJButton("Iniciar", 100, 10, 100, 40,null, null, 
               null, Color.GRAY, Color.BLACK, null, "c", true);
       pPrincipal.add(bIniciar);
   
   }
   
   
}
