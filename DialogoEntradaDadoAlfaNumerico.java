package cobaia;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DialogoEntradaDadoAlfaNumerico extends JDialog implements ActionListener, KeyListener {
	private JTextField campo;
	private JButton botao;
	private RetornoDialogo retorno;
	private Documentos doc;

	public DialogoEntradaDadoAlfaNumerico(Documentos doc) {
		this.doc = doc;
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setTitle("Informe : " + doc.getTipo());
		this.setSize(300, 100);
		this.campo = new JTextField("", doc.getTamanho()); // tamanho 11 CPF
		this.campo.addKeyListener(this);
		this.botao = new JButton("OK");
		this.botao.addActionListener(this);
		this.getContentPane().add(campo);
		this.getContentPane().add(botao);
		this.pack();
	}

	public void mostra() {
		this.setVisible(true);
	}

	public void quandoOk(RetornoDialogo retorno) {
		this.retorno = retorno;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String valor = campo.getText(); // "1"
		if (valor.length() != doc.getTamanho()) { // CPF tamanho 11
			JOptionPane.showMessageDialog(DialogoEntradaDadoAlfaNumerico.this,
					doc.getTipo() + " deve ter " + doc.getTamanho() + " caracteres ", "ERRO", JOptionPane.ERROR_MESSAGE);
			campo.requestFocus();
			campo.selectAll();
			return;
		}

		for (int i = doc.getAlfaIni(); i < doc.getAlfaFim(); i++) {
			if (valor.charAt(i) < 97 || valor.charAt(i) > 122) {
				JOptionPane.showMessageDialog(this, doc.getTipo() + " Deve ter apenas letras", "ERRO",
						JOptionPane.ERROR_MESSAGE);
				campo.requestFocus();
				campo.select(i, i + 1);
				return;
			}
		} // 1     0~10
		for (int i = doc.getNumIni(); i <= doc.getNumFim(); i++) {
			if (valor.charAt(i) < 48 || valor.charAt(i) > 57) {
				JOptionPane.showMessageDialog(this, doc.getTipo() + " insira os caracteres compativeis com: " + doc.getTipo(), "ERRO",
						JOptionPane.ERROR_MESSAGE);
				campo.requestFocus();
				campo.select(i, i + 1);
				return;
			}

		}

		doc.setValor(valor);
		// se especificado um retorno envia um CPF preenchido para ele
		if (retorno != null)
			retorno.recebe(doc);
		this.dispose(); // fecha o diálogo
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// deixa apertar backspace e delete
		if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_DELETE)
			return;
		// não deixa entrar mais de 11 caracteres (CPF)
		if (campo.getText().length() == doc.getTamanho())
			e.consume();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		/* NOPE */ }

	@Override
	public void keyReleased(KeyEvent e) {
		/* NOPE */ }

}
