import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class utama extends JFrame {

	private JPanel contentPane;
	private JTextField txtNama;
	private JTextField txtNIM;
	private JTextField txtNilaiTgs;
	private JTextField txtNilaiUTS;
	private JTextField txtNilaiUAS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					utama frame = new utama();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public utama() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new LineBorder(new Color(100, 149, 237), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(10, 11, 580, 78);
		contentPane.add(panel);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		inputPanel.setBackground(new Color(230, 230, 250));
		inputPanel.setBounds(10, 100, 285, 246);
		contentPane.add(inputPanel);
		inputPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nama");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 26, 63, 14);
		inputPanel.add(lblNewLabel);
		
		JLabel lblNim = new JLabel("NIM");
		lblNim.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNim.setBounds(10, 54, 63, 14);
		inputPanel.add(lblNim);
		
		JLabel lblNilaiTugas = new JLabel("Nilai Tugas");
		lblNilaiTugas.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNilaiTugas.setBounds(10, 86, 63, 14);
		inputPanel.add(lblNilaiTugas);
		
		JLabel lblNilaiUts = new JLabel("Nilai UTS");
		lblNilaiUts.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNilaiUts.setBounds(10, 118, 63, 14);
		inputPanel.add(lblNilaiUts);
		
		JLabel lblNilaiUas = new JLabel("Nilai UAS");
		lblNilaiUas.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNilaiUas.setBounds(10, 150, 63, 14);
		inputPanel.add(lblNilaiUas);
		
		txtNama = new JTextField();
		txtNama.setBounds(83, 23, 116, 20);
		inputPanel.add(txtNama);
		txtNama.setColumns(10);
		
		txtNIM = new JTextField();
		txtNIM.setColumns(10);
		txtNIM.setBounds(83, 51, 116, 20);
		inputPanel.add(txtNIM);
		
		txtNilaiTgs = new JTextField();
		txtNilaiTgs.setColumns(10);
		txtNilaiTgs.setBounds(83, 83, 116, 20);
		inputPanel.add(txtNilaiTgs);
		
		txtNilaiUTS = new JTextField();
		txtNilaiUTS.setColumns(10);
		txtNilaiUTS.setBounds(83, 115, 116, 20);
		inputPanel.add(txtNilaiUTS);
		
		txtNilaiUAS = new JTextField();
		txtNilaiUAS.setColumns(10);
		txtNilaiUAS.setBounds(83, 150, 116, 20);
		inputPanel.add(txtNilaiUAS);
		
		JPanel outputPanel = new JPanel();
		outputPanel.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		outputPanel.setBackground(new Color(230, 230, 250));
		outputPanel.setBounds(305, 100, 285, 246);
		contentPane.add(outputPanel);
		outputPanel.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama           :");
		lblNama.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNama.setBounds(10, 31, 70, 14);
		outputPanel.add(lblNama);
		
		JLabel lblNim_1 = new JLabel("NIM               :");
		lblNim_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNim_1.setBounds(10, 57, 70, 14);
		outputPanel.add(lblNim_1);
		
		JLabel lblNama_1 = new JLabel("Rerata          :");
		lblNama_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNama_1.setBounds(10, 86, 70, 14);
		outputPanel.add(lblNama_1);
		
		JLabel lblGrade = new JLabel("Grade           :");
		lblGrade.setFont(new Font("Arial", Font.PLAIN, 12));
		lblGrade.setBounds(10, 117, 70, 14);
		outputPanel.add(lblGrade);
		
		JLabel lblKeterangan = new JLabel("Keterangan :");
		lblKeterangan.setFont(new Font("Arial", Font.PLAIN, 12));
		lblKeterangan.setBounds(10, 156, 70, 14);
		outputPanel.add(lblKeterangan);
		
		JLabel outNama = new JLabel("");
		outNama.setFont(new Font("Arial", Font.PLAIN, 12));
		outNama.setBounds(97, 31, 143, 14);
		outputPanel.add(outNama);
		
		JLabel outNIM = new JLabel("");
		outNIM.setFont(new Font("Arial", Font.PLAIN, 12));
		outNIM.setBounds(97, 57, 143, 14);
		outputPanel.add(outNIM);
		
		JLabel outRerata = new JLabel("");
		outRerata.setFont(new Font("Arial", Font.PLAIN, 12));
		outRerata.setBounds(97, 86, 143, 14);
		outputPanel.add(outRerata);
		
		JLabel outGrade = new JLabel("");
		outGrade.setFont(new Font("Arial", Font.PLAIN, 12));
		outGrade.setBounds(97, 117, 143, 14);
		outputPanel.add(outGrade);
		
		JLabel outKet = new JLabel("");
		outKet.setFont(new Font("Arial", Font.PLAIN, 12));
		outKet.setBounds(97, 156, 143, 14);
		outputPanel.add(outKet);
		
		JButton btnHitung = new JButton("Hitung");
		btnHitung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//untuk rerata   
		        String nama = txtNama.getText();
		        String nim = txtNIM.getText();
		        if (txtNilaiTgs.getText().isEmpty() || txtNilaiUTS.getText().isEmpty()||txtNilaiUAS.getText().isEmpty()){
		            JOptionPane.showMessageDialog(null, "Maaf , form masih kosong");
		        }
		        else {
		            Double rerata = (Double.parseDouble(txtNilaiTgs.getText())+
		                    Double.parseDouble(txtNilaiUTS.getText())+Double.parseDouble (txtNilaiUAS.getText()))/3;
		            outRerata.setText(rerata.toString().substring(0,5));
		            outNama.setText(nama);
		            outNIM.setText(nim);
		        }
		        //Untuk grade
		        Double a = Double.parseDouble(outRerata.getText());
		        char grade=' ';
		        if (a >= 90.00){
		            grade = 'A';
		            outGrade.setText(""+grade);
		        }
		        else if (a >= 80.00 && a <=89.00 ){
		            grade ='B';
		            outGrade.setText(""+grade);
		        }
		        else if (a >= 70.00 && a <= 79.00){
		            grade = 'C';
		            outGrade.setText(""+grade);
		        }
		        else if (a >= 40.00 && a <= 69.00){
		            grade = 'D';
		            outGrade.setText(""+grade);
		        }
		        else if (a <= 39.00){
		            grade = 'E';
		            outGrade.setText(""+grade);
		        }
		        //keterangan
		        if (grade == 'A' || grade =='B' || grade == 'C'){
		           
		            outKet.setText("Dinyatakan Lulus");
		        }
		        else {
		            outKet.setText("Dinyatakan Tidak Lulus");
		        }
			}
		});
		
		
		btnHitung.setBounds(55, 354, 89, 23);
		contentPane.add(btnHitung);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNama.setText(null);
		        txtNIM.setText(null);
		        txtNilaiTgs.setText(null);
		        txtNilaiUTS.setText(null);
		        txtNilaiUAS.setText(null);
		        outNama.setText(null);
		        outNIM.setText(null);
		        outRerata.setText(null);
		        outGrade.setText(null);
		        outKet.setText(null);
			}
		});
		btnReset.setBounds(172, 354, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSimpan.setBounds(345, 354, 89, 23);
		contentPane.add(btnSimpan);
		
		JButton btnKeluar = new JButton("Keluar");
		btnKeluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION )==0) {
					utama.this.dispose();
				}
			}
		});
		btnKeluar.setBounds(476, 354, 89, 23);
		contentPane.add(btnKeluar);
	}
}
