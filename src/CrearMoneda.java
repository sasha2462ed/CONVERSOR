import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrearMoneda {
	

    
    public static <E> void main(String[] args) {
    Moneda monedas = new Moneda();
    
    JFrame ventana = new JFrame();
 
    ventana.setSize(500, 300);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLocationRelativeTo(null);
    ventana.setTitle("Conversor de Monedas");
    
    JPanel panel = new JPanel();
    JTextField Moneda = new JTextField("", 20);
    JLabel ValorMoneda = new JLabel("Elija Opcion");
    //JTextField Moneda = new JTextField("Cantidad", 20);
    JButton Salir = new JButton("Salir");
    JButton Convertir = new JButton("Convertir");
    JButton Ok = new JButton("Ok");
    JComboBox<String> Monedas = new JComboBox<>();
    JComboBox<String> MenuOpcion = new JComboBox<>();
   
 
    

    MenuOpcion.setFont(new java.awt.Font("Calibri", 1, 14)); 
    MenuOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conversor de Temperatura", "Conversor de Moneda" }));
    MenuOpcion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    MenuOpcion.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            OpcionMenu(evt);
        }

		private void OpcionMenu(ActionEvent evt) {
			
			MenuOpcion.getSelectedItem();
			
			
			
		}
    });
    
    Ok.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	
            Opcion(evt);
         
        }

		private void Opcion(ActionEvent evt) {
				
		    
			String Option = (String) MenuOpcion.getSelectedItem();
			
			if(Option == "Conversor de Moneda") {
				
				
				
				JPanel panel2 = new JPanel();
				JLabel ValorMoneda = new JLabel("Ingrese la cantidad");
		
			    JButton Salir = new JButton("Salir");
			    JButton Convertir = new JButton("Convertir");
			    
			    
			    Moneda.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
			    Moneda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
			    Moneda.addKeyListener(new java.awt.event.KeyAdapter() {
			        public void keyTyped(java.awt.event.KeyEvent evt) {
		                VerificarNumero(evt);
		            }

					private void VerificarNumero(KeyEvent evt) {
						
			            char validar = evt.getKeyChar();
			            
			            if(Character.isLetter(validar)){
			               // getToolkit().beep();
			                evt.consume();
			                
			                 JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
			            }
						
						
					}
		        });
			
			    
			    panel2.add(ValorMoneda);
			    panel2.add(Moneda);
			    panel2.add(Convertir);
			    panel2.add(Salir);
			    
			   
			    
			    Salir.addActionListener(new java.awt.event.ActionListener() {
			        public void actionPerformed(java.awt.event.ActionEvent evt) {
			        	System.exit(0);
			          
			        }

			    });
	
			    
			    Convertir.addActionListener(new java.awt.event.ActionListener() {
			        public void actionPerformed(java.awt.event.ActionEvent evt) {
			        	
			        	   if(Moneda.getText().isEmpty()){
					             JOptionPane.showMessageDialog(null, "Rellene el campo Cantidad");
					        } else {
						    
			            Convert(evt);
					        }
			        }

					private void Convert(ActionEvent evt) {
						
						JPanel panel3 = new JPanel();
					   
					    JButton Ok = new JButton("Ok");
					    JComboBox<String> TiposMonedas = new JComboBox<>();
				
					    TiposMonedas.setFont(new java.awt.Font("Calibri", 1, 14)); 
					    TiposMonedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
					    	       "Convertir Dolar a Euros",
					    	       "Convertir Dolar a Libras Esterlinas",
					    	       "Convertir Dolar a Yen Japonés",
					    	       "Convertir Dolar a Won sul-coreano",
					    	   
					    	       "Convertir de Euros a Dolar",
					    	       "Convertir de Libras Esterlinas a Dolar",
					    	       "Convertir de Yen Japonés a Dolar",
					    	       "Convertir de Won sul-coreano a Dolar"}));
					    TiposMonedas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
					    TiposMonedas.addActionListener(new java.awt.event.ActionListener() {
					        public void actionPerformed(java.awt.event.ActionEvent evt) {
					            Tipos(evt);
					            
					        }

							private void Tipos(ActionEvent evt) {
								
							    
								
								TiposMonedas.getSelectedItem();
								
								
								
							}
					    });
					    
					    panel3.add(TiposMonedas);
					    panel3.add(Ok);
					    
					    
					    Ok.addActionListener(new java.awt.event.ActionListener() {
					        public void actionPerformed(java.awt.event.ActionEvent evt) {
					            Convert(evt);
					            
					        }

							private void Convert(ActionEvent evt) {
								
								JPanel panel4 = new JPanel();
								JButton Ok = new JButton("Ok");
								JButton Salir = new JButton("Salir");
							  
								
							    String Tipo = (String) TiposMonedas.getSelectedItem();
							    double Cantidad = (Double) Double.parseDouble(Moneda.getText());
							    
							 
							    Moneda convertir = new Moneda();
							    double valor = convertir.Convertir(Cantidad, Tipo);	
							    
							    JLabel Total = new JLabel("La conversion es: $" + valor);
							    
							    
							    panel4.add(Total);
							    panel4.add(Ok);
							    panel4.add(Salir);
							    
							    Ok.addActionListener(new java.awt.event.ActionListener() {
							        public void actionPerformed(java.awt.event.ActionEvent evt) {
							        	
							        
							        	  Moneda.setText("");
							          
									   
									    panel4.setVisible(false);
									    panel.setVisible(true);
									    
									    ventana.add(panel, BorderLayout.CENTER);
									    ventana.pack();
									    ventana.setVisible(true);
									    
									    
									   
									    
									    
									    
								
										  
							        	
							          
							        }

							    });
							    Salir.addActionListener(new java.awt.event.ActionListener() {
							        public void actionPerformed(java.awt.event.ActionEvent evt) {
							        	
							        	  
							          	System.exit(0);
							          
							        }

							    });
							    
							    
							    
							    ventana.add(panel4, BorderLayout.CENTER);
							    ventana.pack();
							    ventana.setVisible(true);
							    panel3.setVisible(false);
							    
								
							}
					    });
					    
					    ventana.add(panel3, BorderLayout.CENTER);
					    ventana.pack();
					    ventana.setVisible(true);
					    panel2.setVisible(false);
						
			
						
						
					}
			    });
					   
			    ventana.add(panel2, BorderLayout.CENTER);
			    ventana.pack();
			    ventana.setVisible(true);
			    panel.setVisible(false);
			   
				
			}else if (Option == "Conversor de Temperatura") {
				
				JPanel panel6 = new JPanel();
				JButton Ok = new JButton("Ok");
			    JLabel Total = new JLabel("Estamos trabajando en ello >w<");
			    
			    
			    panel6.add(Ok);
			    panel6.add(Total);
			    
			    Ok.addActionListener(new java.awt.event.ActionListener() {
			        public void actionPerformed(java.awt.event.ActionEvent evt) {
			        	
			        
					    
					   
					    panel6.setVisible(false);
					    panel.setVisible(true);
					    
					    ventana.add(panel, BorderLayout.CENTER);
					    ventana.pack();
					    ventana.setVisible(true);
					    
					    
					   
					    
					    
					    
				
						  
			        	
			          
			        }

			    });
			    
			    ventana.add(panel6, BorderLayout.CENTER);
			    ventana.pack();
			    ventana.setVisible(true);
			    panel.setVisible(false);
			    
			    
			    
			    
			}
				
			
		}
    });
    
    panel.add(ValorMoneda);
    panel.add(MenuOpcion);
    panel.add(Ok);

    
    ventana.add(panel, BorderLayout.CENTER);
    ventana.pack();
    ventana.setVisible(true);
   
}
    
    
    
    
    
}