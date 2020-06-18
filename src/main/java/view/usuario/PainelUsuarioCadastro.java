package view.usuario;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import net.miginfocom.swing.MigLayout;
import view.acervo.MainAcervo;
import view.endereco.PainelEnderecoCadastro;

import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;

public class PainelUsuarioCadastro extends JPanel {
	private static final PainelEnderecoCadastro painelEnderecoCadastro = new PainelEnderecoCadastro();
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtEmail;
	private JTextField txtDDDFixo;
	private JTextField txtFoneFixo;
	private JTextField txtDDDMovel;
	private JTextField txtFoneMovel;
	private static JLayeredPane layeredPane;

	/**
	 * Create the panel.
	 */
	public PainelUsuarioCadastro() {
		setLayout(new MigLayout("", "[64.00px][135.00,grow][][99.00,grow][63.00,grow]", "[22px][][][][][][][][][][]"));
		
		
		
		JLabel lblNome = new JLabel("Nome");
		add(lblNome, "cell 1 1");
		
		JLabel lblDDDFixo = new JLabel("DDD Fixo:");
		add(lblDDDFixo, "cell 3 1");
		
		JLabel lblFoneFixo = new JLabel("Telefone Fixo:");
		add(lblFoneFixo, "cell 4 1");
		
		txtNome = new JTextField();
		add(txtNome, "cell 1 2 2 1,growx");
		txtNome.setColumns(10);
		
		txtDDDFixo = new JTextField();
		add(txtDDDFixo, "cell 3 2,growx,aligny top");
		txtDDDFixo.setColumns(10);
		
		txtFoneFixo = new JTextField();
		add(txtFoneFixo, "cell 4 2,growx");
		txtFoneFixo.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		add(lblSobrenome, "cell 1 3");
		
		JLabel lblDDDMovel = new JLabel("DDD M\u00F3vel:");
		add(lblDDDMovel, "cell 3 3");
		
		JLabel lblFoneMovel = new JLabel("Telefone M\u00F3vel:");
		add(lblFoneMovel, "cell 4 3");
		
		txtSobrenome = new JTextField();
		add(txtSobrenome, "cell 1 4 2 1,growx");
		txtSobrenome.setColumns(10);
		
		txtDDDMovel = new JTextField();
		add(txtDDDMovel, "cell 3 4,growx");
		txtDDDMovel.setColumns(10);
		
		txtFoneMovel = new JTextField();
		add(txtFoneMovel, "cell 4 4,growx");
		txtFoneMovel.setColumns(10);
		
		JLabel lblDtNascimento = new JLabel("Data de Nascimento");
		add(lblDtNascimento, "cell 1 5");
		
		try {
			MaskFormatter maskFormatter = new MaskFormatter("##/##/####");
			JFormattedTextField txtDataNascimento = new JFormattedTextField(maskFormatter);
			add(txtDataNascimento, "cell 1 6,growx");
		} catch (ParseException e1) {
			System.out.println("Erro na máscara de formatação de data no painel de cadastro de usuário.");
			e1.printStackTrace();
		}
		
		try {
			MaskFormatter maskFormatter = new MaskFormatter("##");
		} catch (ParseException e1) {
			System.out.println("Erro na máscara de formatação ddo DDD no painel de alteração de usuário.");
			e1.printStackTrace();
		}
		
		JButton btnEndereco = new JButton("Endere\u00E7o");
		btnEndereco.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				painelEnderecoCadastro.setVisible(true);
				}
		});
		
		add(btnEndereco, "cell 3 6 2 1,growx");
		
		JLabel lblEmail = new JLabel("Email");
		add(lblEmail, "cell 1 7");
		
		txtEmail = new JTextField();
		add(txtEmail, "cell 1 8 3 1,growx");
		txtEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnCadastrar, "cell 2 10");
			
	    }


}


