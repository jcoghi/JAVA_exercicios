import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Employee {
    private JPanel Main;
    private JLabel EmployeeRegistration;
    private JLabel Name;
    private JLabel Salary;
    private JLabel Fone;
    private JTextField txtName;
    private JTextField txtSalary;
    private JTextField txtFone;
    private JButton saveButton;
    private JTable table1;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton searchButton;
    private JTextField txtId;
    private JScrollPane table_1;

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public static Connection getConnection() {
        try {
            final String url = "jdbc:mysql://localhost:3306/aula";
            final String user = "root";
            final String psw = "123456";
            return DriverManager.getConnection(url,user,psw);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame("Employee");
        frame.setContentPane(new Employee().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }



    void table_load() {
        try {
            pst = conn.prepareStatement("SELECT * FROM pessoas");
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.setNumRows(0); // Recharge the table
            table1.getColumnModel().getColumn(0).setPreferredWidth(20);
            table1.getColumnModel().getColumn(1).setPreferredWidth(80);
            table1.getColumnModel().getColumn(2).setPreferredWidth(80);
            table1.getColumnModel().getColumn(3).setPreferredWidth(80);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }



    public Employee() throws SQLException {
        conn = getConnection();
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS aula");
        stmt.execute("CREATE TABLE IF NOT EXISTS pessoas (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(200) NOT NULL," +
                "salary VARCHAR(50)," +
                "phone VARCHAR(20)" +
                ")");

    saveButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            String name,salary,phone;
            name = txtName.getText();
            salary = txtSalary.getText();
            phone = txtFone.getText();

            try {
                pst = conn.prepareStatement("INSERT INTO pessoas(name,salary,phone) VALUE(?,?,?)");
                pst.setString(1,name);
                pst.setString(2,salary);
                pst.setString(3,phone);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Added");

                while (rs.next()) {
                    table_load();
                }

                txtName.setText("");
                txtFone.setText("");
                txtFone.setText("");
                txtName.requestFocus();
            }catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    });
    }
}
