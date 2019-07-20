 //clifford garate 
//INTERFACES III - RETO 2
package CALCULADORA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JTextArea;

public class calculadora extends JFrame{
    private JTextArea campo1,campo2,campo3,campoOculto,campoOculto2,camposigno;
    private GridLayout cuadricula1;
   
    private JButton botones[];
    private final String nombres[] = {"=", "1", "2", "3", "+", "4","5","6","-","7","8","9","*",".","0","C","/"};
    private class ManejadorBoton implements ActionListener{
       
        public void actionPerformed(ActionEvent evento)
        {   
          
            if(evento.getSource() == botones[0]){
                
             
                if("+".equals(camposigno.getText())){
                    campoOculto.setText(campo2.getText()); //segundo numero en campo oculto
                        Double rpt;
                     Double n1 = Double.parseDouble(String.valueOf(campoOculto2.getText()));
              Double n2 = Double.parseDouble(String.valueOf(campoOculto.getText()));
              rpt=n1+n2;
              String RPT = String.valueOf(rpt);
              campo2.setText(RPT);
              campo1.setText("");
                }
                 if("-".equals(camposigno.getText())){
                     campoOculto.setText(campo2.getText()); //segundo numero en campo oculto
                     Double rpt1;
                     Double n1 = Double.parseDouble(String.valueOf(campoOculto2.getText()));
              Double n2 = Double.parseDouble(String.valueOf(campoOculto.getText()));
              rpt1=n1-n2;
              String RPT = String.valueOf(rpt1);
              campo2.setText(RPT);
              campo1.setText("");
                }
                 if("*".equals(camposigno.getText())){
                     campoOculto.setText(campo2.getText()); //segundo numero en campo oculto
                     Double rpt2;
                     Double n1 = Double.parseDouble(String.valueOf(campoOculto2.getText()));
              Double n2 = Double.parseDouble(String.valueOf(campoOculto.getText()));
              rpt2=n1*n2;
              String RPT = String.valueOf(rpt2);
              campo2.setText(RPT);
              campo1.setText("");
                }
                  if("/".equals(camposigno.getText())){
                      campoOculto.setText(campo2.getText()); //segundo numero en campo oculto
                      Double rpt3;
                     Double n1 = Double.parseDouble(String.valueOf(campoOculto2.getText()));
              Double n2 = Double.parseDouble(String.valueOf(campoOculto.getText()));
              rpt3=n1/n2;
              String RPT = String.valueOf(rpt3);
              campo2.setText(RPT);
              campo1.setText("");
                }
                 
            }
            if(evento.getSource() == botones[15])
            { 
              campo2.setText("");
              campo1.setText("");
              
            }
             if(evento.getSource() == botones[1])
            { 
              
              campo2.setText(campo2.getText()+"1");
            }
              if(evento.getSource() == botones[2])
            { 
              campo2.setText(campo2.getText()+"2");
            }
               if(evento.getSource() == botones[4])
            { 
               campoOculto.setText(campo2.getText()); //primer numero en campo oculto
               campoOculto2.setText(campoOculto.getText()); //se pasa el primer numero al campo oculto 2
               camposigno.setText("+");  // se pasa el signo al campo signo
              campo2.setText(campo2.getText()+"+");
              campo1.setText(campo2.getText());
             
              campo2.setText("");
              
            }
                if(evento.getSource() == botones[3])
            { 
              campo2.setText(campo2.getText()+"3");
            }
                 if(evento.getSource() == botones[5])
            { 
             campo2.setText(campo2.getText()+"4");
            }
                  if(evento.getSource() == botones[8])
            { 
              campoOculto.setText(campo2.getText()); //primer numero en campo oculto
               campoOculto2.setText(campoOculto.getText()); //se pasa el primer numero al campo oculto 2
                camposigno.setText("-"); // se pasa el signo al campo signo
             campo2.setText(campo2.getText()+"-");
             campo1.setText(campo2.getText());
             campo2.setText("");
            } if(evento.getSource() == botones[6])
            { 
              campo2.setText(campo2.getText()+"5");
            } if(evento.getSource() == botones[7])
            { 
              campo2.setText(campo2.getText()+"6");
            } if(evento.getSource() == botones[12])
            { 
                 campoOculto.setText(campo2.getText()); //primer numero en campo oculto
               campoOculto2.setText(campoOculto.getText()); //se pasa el primer numero al campo oculto 2
               camposigno.setText("*"); // se pasa el signo al campo signo
             campo2.setText(campo2.getText()+"*");
             campo1.setText(campo2.getText());
             campo2.setText("");
            } if(evento.getSource() == botones[9])
            { 
              campo2.setText(campo2.getText()+"7");
            } if(evento.getSource() == botones[10])
            { 
              campo2.setText(campo2.getText()+"8");
            } if(evento.getSource() == botones[16])
            { 
             campoOculto.setText(campo2.getText()); //primer numero en campo oculto
             campoOculto2.setText(campoOculto.getText()); //se pasa el primer numero al campo oculto 2
             camposigno.setText("/"); // se pasa el signo al campo signo
             campo2.setText(campo2.getText()+"/");
             campo1.setText(campo2.getText());
             campo2.setText("");
            }
             if(evento.getSource() == botones[11])
            { 
              campo2.setText(campo2.getText()+"9");
            }
              if(evento.getSource() == botones[14])
            { 
              campo2.setText(campo2.getText()+"0");
            }
               if(evento.getSource() == botones[13])
            { 
              campo2.setText(campo2.getText()+".");
            }
               
        }
    }
    public calculadora (){
        super("calculadora by:Clifford");
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        contenedor.setBackground(Color.WHITE);
        campo1 = new JTextArea(1,20);
        campo1.setEditable(false);
        campo1.setFont(new Font("Arial", Font.BOLD,20));
        contenedor.add(campo1);	
        
        campo2 = new JTextArea(1,20);
        campo2.setEditable(false);
        campo2.setFont(new Font("Arial", Font.BOLD,20));
        contenedor.add(campo2);
        
         campo3 = new JTextArea(1,20);
        campo3.setEditable(false);
        campo3.setFont(new Font("Arial", Font.BOLD,20));
        contenedor.add(campo3);
        
        campoOculto = new JTextArea(1,20);
        campoOculto.setEditable(false);
        campoOculto.setVisible(false);
       
        
        campoOculto2 = new JTextArea(1,20);
        campoOculto2.setEditable(false);
        campoOculto2.setVisible(false);
        
        camposigno = new JTextArea(1,20);
        camposigno.setEditable(false);
        camposigno.setVisible(false);
        
        
        cuadricula1 = new GridLayout(6,10,1,1);
        setLayout(cuadricula1);
        
        botones = new JButton[nombres.length];
		for(int cuenta = 0; cuenta < nombres.length; cuenta++){
			botones[cuenta] = new JButton(nombres[cuenta]);
			add(botones[cuenta]);  
                            //manejador     
                        ManejadorBoton mb = new ManejadorBoton();
                        botones[cuenta].addActionListener(mb); 
                } 
               
       
       
        setVisible(true);
        setSize(400, 420);
    }
    public static void main(String[] args) {
        calculadora  App = new calculadora();
        App.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
