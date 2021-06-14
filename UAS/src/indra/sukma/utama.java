package indra.sukma;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class utama extends JFrame {

	private JPanel contentPane;
	private JTextField txtNama;
	private JTextField txtNIM;
	private JTextField txtNilaiTgs;
	private JTextField txtNilaiUTS;
	private JTextField txtNilaiUAS;
	private JTextField txtPresensi;
	private JTable isi;
	private DefaultTableModel out;

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
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		inputPanel.setBackground(new Color(230, 230, 250));
		inputPanel.setBounds(10, 11, 285, 246);
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
		
		JLabel lblPresensi = new JLabel("Presensi");
		lblPresensi.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPresensi.setBounds(10, 187, 63, 14);
		inputPanel.add(lblPresensi);
		
		txtPresensi = new JTextField();
		txtPresensi.setColumns(10);
		txtPresensi.setBounds(83, 181, 116, 20);
		inputPanel.add(txtPresensi);
		
		JPanel outputPanel = new JPanel();
		outputPanel.setBorder(new LineBorder(new Color(100, 149, 237), 3));
		outputPanel.setBackground(new Color(230, 230, 250));
		outputPanel.setBounds(305, 11, 285, 246);
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
		
		JLabel Presensi = new JLabel("Presensi     :");
		Presensi.setFont(new Font("Arial", Font.PLAIN, 12));
		Presensi.setBounds(10, 156, 70, 14);
		outputPanel.add(Presensi);
		
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
		outKet.setBounds(97, 183, 143, 14);
		outputPanel.add(outKet);
		
		JLabel lblKeterangan_1 = new JLabel("Keterangan :");
		lblKeterangan_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblKeterangan_1.setBounds(10, 183, 70, 14);
		outputPanel.add(lblKeterangan_1);
		
		JLabel outPresensi = new JLabel("");
		outPresensi.setFont(new Font("Arial", Font.PLAIN, 12));
		outPresensi.setBounds(97, 156, 143, 14);
		outputPanel.add(outPresensi);
		
		JLabel keluar = new JLabel("X");
		keluar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION )==0) {
					utama.this.dispose();
				}
			}
		});
		keluar.setFont(new Font("Arial", Font.BOLD, 15));
		keluar.setBounds(261, 11, 14, 14);
		outputPanel.add(keluar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 289, 580, 100);
		contentPane.add(scrollPane);
		
		isi = new JTable();
		isi.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nama", "Nim", "Nilai Tugas", "NIlai UTS", "Nilai UAS", "Grade", "Presensi", "Keterangan"
			}
		));
		scrollPane.setViewportView(isi);
		
		JButton btnHitung = new JButton("Hitung");
		btnHitung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
			        String nama =txtNama.getText().toUpperCase();
			        String nim =txtNIM.getText().toUpperCase();
			        			        
			        if (txtNama.getText().isEmpty() || txtNIM.getText().isEmpty() || txtNilaiTgs.getText().isEmpty() || txtNilaiUTS.getText().isEmpty()||txtNilaiUAS.getText().isEmpty() ||txtPresensi.getText().isEmpty()){
			            JOptionPane.showMessageDialog(null, "Maaf , form belum lengkap");
			        }
			        else{
			        	int uts =Integer.parseInt(txtNilaiUTS.getText());
				        int tgs =Integer.parseInt(txtNilaiTgs.getText());
				        int uas =Integer.parseInt(txtNilaiUAS.getText());
				        int presensi =Integer.parseInt(txtPresensi.getText());
				        String Grade;
				        String Hasil;
			            int rata =(uts+tgs+uas)/3;
			            int kehadiran=(presensi);

			            if (rata>=80 && kehadiran>=15 ){
			                Grade ="A";
			                Hasil ="Lulus";
			            }
			            else if (rata>=70&&rata<=79 && kehadiran>=15  ){
			                Grade ="B";
			                Hasil ="Lulus";
			            }
			            else if(rata>=60&&rata<=69 && kehadiran>=15  ){
			                Grade ="C";
			                Hasil ="Lulus";
			            }
			            else{
			                Grade ="D";
			                Hasil ="Tidak Lulus";
			            }
			            outNama.setText(" "+nama);
			            outNIM.setText(""+nim);
			            outPresensi.setText(""+presensi);
			            outRerata.setText(" "+String.valueOf(rata));
			            outGrade.setText(" "+Grade);
			            outKet.setText(" "+Hasil);
			        }
			        
			}
		});
		
		
		btnHitung.setBounds(48, 262, 89, 23);
		contentPane.add(btnHitung);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNama.setText(null);
		        txtNIM.setText(null);
		        txtNilaiTgs.setText(null);
		        txtNilaiUTS.setText(null);
		        txtNilaiUAS.setText(null);
		        txtPresensi.setText(null);
		        outNama.setText(null);
		        outNIM.setText(null);
		        outRerata.setText(null);
		        outGrade.setText(null);
		        outPresensi.setText(null);
		        outKet.setText(null);
			}
		});
		btnReset.setBounds(165, 262, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nama = txtNama.getText();
				String nim = txtNIM.getText();
				String nilaiTgs = txtNilaiTgs.getText();
				String nilaiUTS =  txtNilaiUTS.getText().toString();
				String nilaiUAS = txtNilaiUAS.getText().toString();
				String grade = outGrade.getText();
				String presensi = txtPresensi.getText();
				String keterangan = outKet.getText();
				
				out = (DefaultTableModel) isi.getModel();
				
				Object[] data = new Object[8];
		        data[0]=nama;
		        data[1]=nim;
		        data[2]=nilaiTgs;
		        data[3]=nilaiUTS;
		        data[4]=nilaiUAS;
		        data[5]=grade;
		        data[6]=presensi;
		        data[7]=keterangan;
				out.addRow(data);
				
				txtNama.setText(null);
		        txtNIM.setText(null);
		        txtNilaiTgs.setText(null);
		        txtNilaiUTS.setText(null);
		        txtNilaiUAS.setText(null);
		        txtPresensi.setText(null);
		        outNama.setText(null);
		        outNIM.setText(null);
		        outRerata.setText(null);
		        outGrade.setText(null);
		        outPresensi.setText(null);
		        outKet.setText(null);
			}
		});
		btnSimpan.setBounds(338, 262, 89, 23);
		contentPane.add(btnSimpan);
		
		JButton hapus = new JButton("Hapus");
		hapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus?", "Hapus Data", JOptionPane.YES_NO_OPTION);
                int row = isi.getSelectedRow(); 
                if (row >= 0) {
                    if(confirm == 0) {
                        out.removeRow(row);
                        JOptionPane.showMessageDialog(null, "Data telah dihapus");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih data yang ingin anda dihapus");
                }

			}
		});
		hapus.setBounds(465, 262, 89, 23);
		contentPane.add(hapus);
		
	}
}
